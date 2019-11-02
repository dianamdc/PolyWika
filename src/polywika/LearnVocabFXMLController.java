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
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.scene.text.Text;
import polywika.Tagalog.TagalogVocabFXMLController;

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
    @FXML
    private Text txt, num, order, word, meaning, wordsLeft;
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
        String n = numWords.getText();
        int i = 0;
        try {
            i = Integer.parseInt(n);
        } catch (NumberFormatException err) {
            //add error
        }
        if (i <= v.getUnlearned().size()) {
            learn(i);
        } else {
            //add error
        }
    }

    public void learn(int n) {
        menu.setVisible(false);
        learning.setVisible(true);
        num.setText(String.valueOf(n));

        for (int i = 0; i < n; i++) {
            order.setText(String.valueOf(i + 1));
            Word w = v.getUnlearned().get(i);
            word.setText(w.getWord());
            meaning.setText(w.getMeaning());
        }
    }

    public void setLanguage(String lang_in) {
        learning.setVisible(false);
        lang = lang_in;
        txt.setText(lang_in);
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String dir = "src/polywika/vocabfiles/" + lang_in + "vocab.json";
            v = objectMapper.readValue(new File(dir), Vocab.class);

            wordsLeft.setText(String.valueOf(v.getUnlearned().size()));
        } catch (IOException ex) {
            Logger.getLogger(TagalogVocabFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
