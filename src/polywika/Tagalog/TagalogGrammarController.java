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
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import polywika.Cebuano.CebuanoFXMLController;
import polywika.HomePageController;
import polywika.Vocab;

/**
 * FXML Controller class
 *
 * @author Ribai
 */
public class TagalogGrammarController implements Initializable {

    @FXML
    AnchorPane root;
    @FXML
    Button HomePage;
    @FXML
    ChoiceBox Choices;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
//        try {
//            ObjectMapper objectMapper = new ObjectMapper();
//            String dir = "src/polywika/vocabfiles/TagalogGrammarTest.json";
//            Vocab v = objectMapper.readValue(new File(dir), Vocab.class);
//        } catch (IOException ex) {
//            Logger.getLogger(TagalogGrammarController.class.getName()).log(Level.SEVERE, null, ex);
//        }
    }

    public void handleButtonActionBack(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/polywika/HomePage.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            HomePageController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(TagalogGrammarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
