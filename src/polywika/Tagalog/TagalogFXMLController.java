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
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javax.swing.JOptionPane;
import polywika.HomePageController;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class TagalogFXMLController implements Initializable {

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

    @FXML
    public void handleButtonActionBack(ActionEvent event) throws IOException {
        //System.out.println("Lmao gumagana");
        Parent homePage = FXMLLoader.load(getClass().getResource("/polywika/HomePage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        homeStage.setScene(homePageScene);
        homeStage.show();
    }

    public void handleButtonActionLearn(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("LearnTag.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            LearnTagController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleButtonActionPractice(ActionEvent e) {
        String[] options = {"Grammar", "Vocab"};
        int x = JOptionPane.showOptionDialog(null, "Practice grammar or vocab?",
                "",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);
        System.out.println(x);

        if (x == 0) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TagalogGrammar.fxml"));
                Parent secondview = loader.load();
                Scene newscene = new Scene(secondview);
                TagalogGrammarController other = loader.getController();
                Stage curstage = (Stage) root.getScene().getWindow();
                curstage.setScene(newscene);
            } catch (IOException ex) {
                Logger.getLogger(TagalogFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (x == 1) {
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("TestTagVocab.fxml"));
                Parent secondview = loader.load();
                Scene newscene = new Scene(secondview);
                TestTagVocabController other = loader.getController();
                Stage curstage = (Stage) root.getScene().getWindow();
                curstage.setScene(newscene);
            } catch (IOException ex) {
                Logger.getLogger(TagalogFXMLController.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
