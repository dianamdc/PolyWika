/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Tagalog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
//import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import polywika.HomePageController;
import polywika.LearnVocabFXMLController;

/**
 * FXML Controller class
 *
 * @author MARUAL FAMILY
 */
public class LearnTagController implements Initializable {

    /**
     * Initializes the controller class.
     *
     * @param url
     * @param rb
     */
    @FXML
    private AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionBack(ActionEvent event) throws IOException {

    }

    public void handleButtonActionLearnVocab(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/polywika/LearnVocabFXML.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            LearnVocabFXMLController other = loader.getController();
            other.setLanguage("tagalog");
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
