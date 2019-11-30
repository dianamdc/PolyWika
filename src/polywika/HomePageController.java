/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import polywika.Cebuano.CebuanoFXMLController;
import polywika.Tagalog.TagalogFXMLController;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class HomePageController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @FXML
    AnchorPane root;

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionTagalog(ActionEvent e) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Tagalog/TagalogFXML.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            TagalogFXMLController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void handleButtonActionCebuano(ActionEvent event) throws IOException {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Cebuano/CebuanoFXML.fxml"));
            Parent secondview = loader.load();
            Scene newscene = new Scene(secondview);
            CebuanoFXMLController other = loader.getController();
            Stage curstage = (Stage) root.getScene().getWindow();
            curstage.setScene(newscene);
        } catch (IOException ex) {
            Logger.getLogger(HomePageController.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
