/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Tagalog;

import com.fasterxml.jackson.databind.ObjectMapper;
import java.awt.Button;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import polywika.HomePageController;
import polywika.Vocab;

/**
 * FXML Controller class
 *
 * @author Ribai
 */
public class TagalogGrammarController implements Initializable {

    private String[] Questions = {"Mahal ko ang _____ pamilya", "_____ ang aking itinutukoy", "Tumakbo siya ____ mabilis",
        "Tinawag siya ___ kaniyang ina"};
    private String[] Answers = {"aking", "Ikaw", "nang", "ng"};
    private Boolean compare;
    private String aa, Correct = "correct", Wrong = "wrong";
    private int i;
    @FXML
    AnchorPane root;
    @FXML
    Button HomePage;
    @FXML
    TextField answer;
    @FXML
    Label Question, RoW;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

    }

    public void GoToHomeScreen(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/polywika/HomePage.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            HomePageController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void CheckAnswer(ActionEvent event) throws IOException {
        String a = answer.getText();
        aa = Answers[i];
        if (aa.equals(a)) {
            RoW.setText(Correct);
            i++;
        } else {
            RoW.setText(Wrong);
        }

    }

    public void NextQuestion(ActionEvent event) throws IOException {
        for (i = 0; i >= 0; i++) {
            Question.setText(Questions[i]);
        }
        for (i = 1; i >= 1; i++) {
            Question.setText(Questions[i]);
        }
        for (i = 2; i >= 2; i++) {
            Question.setText(Questions[i]);
        }
        for (i = 3; i >= 3; i++) {
            Question.setText(Questions[i]);
        }
        if (i > 3) {
            boolean s = i == 0;
        }
    }
}
