package polywika.Tagalog;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.fasterxml.jackson.databind.ObjectMapper;
//import com.gluonhq.charm.glisten.control.TextField; 
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import polywika.HomePageController;
import polywika.Vocab;
import polywika.Word;

/**
 * FXML Controller class
 *
 * @author MARUAL FAMILY
 */
public class TestTagVocabController implements Initializable {
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        setVocabList();
        meaning.setText(v.getUnlearned().get(n).getMeaning());
        
        back.setVisible(false);
        end.setVisible(false);
    }
    
    private Vocab v;
    private Boolean vtest;
    private ArrayList<Word> learnedWords = new ArrayList<>();
    private String tagalog, answer, word;
    private int compare;
    private int n = 0;
    private int correct = 0;
    private int wrong = 0;
    @FXML
    private AnchorPane root;
    @FXML
    private Button check, back,end;
    @FXML
    private Label meaning;
    @FXML
    private TextField input;
    @FXML
    private Label numCorrect, numWrong;
    
    public void handleButtonActionCheck (ActionEvent e){
        String userAnswer;
        userAnswer = input.getText();   //get user input answer
        
        answer = v.getUnlearned().get(n).getWord();   //get correct answer from json
        //System.out.println(correct);
        
        vtest = answer.equals(userAnswer);
        compare = Boolean.compare(vtest, true);
        
        if(compare == 0){
            correct++;
            n++;
            input.setText("");
            if(n==6){
                numCorrect.setText(Integer.toString(correct));
                numWrong.setText(Integer.toString(wrong));
                
                input.setText("");
                check.setVisible(false);
                back.setVisible(true);
                end.setVisible(true);
            }
            else{
                meaning.setText(v.getUnlearned().get(n).getMeaning());
            }
        }
        else{
            wrong++;
            n++;
            input.setText("");
            if(n==6){
                numCorrect.setText(Integer.toString(correct));
                numWrong.setText(Integer.toString(wrong));
                
                input.setText("");
                check.setVisible(false);
                back.setVisible(true);
                end.setVisible(true);
            }
            else{
                meaning.setText(v.getUnlearned().get(n).getMeaning());
            }
        }
        
        //System.out.println(n);
        
        numCorrect.setText(Integer.toString(correct));
        numWrong.setText(Integer.toString(wrong));
    }
    
    public void setVocabList(){
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String dir = "src/polywika/vocabfiles/tagalogvocab.json";
            v = objectMapper.readValue(new File(dir), Vocab.class);
        }
        catch (IOException ex){
            Logger.getLogger(TestTagVocabController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void handleButtonActionBack(ActionEvent event) throws IOException {
        //try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/polywika/HomePage.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            HomePageController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        /*} catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }
    
    public void handleButtonActionExit (ActionEvent e) {
        System.exit(0);
    }
}