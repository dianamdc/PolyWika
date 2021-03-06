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
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import polywika.HomePageController;

/**
 * FXML Controller class
 *
 * @author Admin
 */
public class PangabayController implements Initializable {

    @FXML
    AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleBackToHome(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/polywika/HomePage.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            HomePageController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(LearnTagGrammarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleBackToMenu(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LearnTagGrammar.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            LearnTagGrammarController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(LearnTagGrammarController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
