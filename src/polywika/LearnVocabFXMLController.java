/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import javax.swing.JOptionPane;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class LearnVocabFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    private Vocab v;
    private String lang;
    private int count = 0, numToLearn = 0;
    private ArrayList<Word> learnedWords = new ArrayList<>();
    @FXML
    private Text txt, num, order, word, meaning, wordsLeft, diin, type;
    @FXML
    private TextField numWords;
    @FXML
    private Pane menu, learning;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    @FXML
    public void handleButtonActionStart(ActionEvent e) {
        String str = numWords.getText();
        int n = 0;
        try {
            n = Integer.parseInt(str);
        } catch (NumberFormatException err) {
            //add error
        }
        if (n <= v.getUnlearned().size()) {
            menu.setVisible(false);
            learning.setVisible(true);
            num.setText(String.valueOf(n));
            numToLearn = n;
            learn(0);
        } else {
            //add error
        }
    }

    @FXML
    public void handleButtonActionNext(ActionEvent e) {
        if (count < numToLearn - 1) {
            count++;
            learn(count);
        } else {
            int boo = JOptionPane.showConfirmDialog(null, "Finish learning?");
            if (boo == 0) {
                for (Word w : learnedWords) {
                    v.learnWord(w);
                }

                int x = JOptionPane.showConfirmDialog(null, "Would you like to take a quiz?");
                if (x == 0) {
                    //test
                } else if (x == 1) {
                    //exit
                    menu.setVisible(true);
                    wordsLeft.setText(String.valueOf(v.getUnlearned().size()));
                    learning.setVisible(false);
                }
            }
        }
    }

    @FXML
    public void handleButtonActionPrev(ActionEvent e) {
        if (count > 0) {
            count--;
            learn(count);
        }
    }

    public void learn(int n) {
        order.setText(String.valueOf(n + 1));
        Word w = v.getUnlearned().get(n);
        //v.learnWord(w);
        if (!learnedWords.contains(w)) learnedWords.add(w);

        word.setText(w.getWord());
        meaning.setText(w.getMeaning());
        diin.setText(w.getDiin());
        type.setText(w.getType());
    }

    public void test() {
        for (int i = 0; i < learnedWords.size(); i++) {

        }
    }

    public void setLanguage(String lang_in) {
        try {
            learning.setVisible(false);
            lang = lang_in;
            txt.setText(lang_in);
            ObjectMapper objectMapper = new ObjectMapper();
            String dir = "src/polywika/vocabfiles/" + lang_in + "vocab.json";
            v = objectMapper.readValue(new File(dir), Vocab.class);

            wordsLeft.setText(String.valueOf(v.getUnlearned().size()));
        } catch (IOException ex) {
            Logger.getLogger(LearnVocabFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
