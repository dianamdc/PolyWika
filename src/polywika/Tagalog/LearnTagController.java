/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Tagalog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
//import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MARUAL FAMILY
 */
public class LearnTagController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @FXML
    AnchorPane root;
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionBack (ActionEvent event) throws IOException{
        Parent TagPage = FXMLLoader.load(getClass().getResource("/polywika/Bisaya/BisayaFXML.fxml"));
        Scene TagPageScene = new Scene(TagPage);
        Stage TagStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        TagStage.setScene(TagPageScene);
        TagStage.show();
    }
    
}
