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
import polywika.Tagalog.TagalogFXMLController;
import polywika.Tagalog.*;

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

    public void handleButtonActionTagalog(ActionEvent event) throws IOException{
        Parent TagPage = FXMLLoader.load(getClass().getResource("/polywika/Tagalog/TagalogFXML.fxml"));
        Scene TagPageScene = new Scene(TagPage);
        Stage TagStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        TagStage.setScene(TagPageScene);
        TagStage.show();
    }
    
    public void handleButtonActionBisaya(ActionEvent event) throws IOException{
        Parent BisPage = FXMLLoader.load(getClass().getResource("/polywika/Bisaya/BisayaFXML.fxml"));
        Scene BisPageScene = new Scene(BisPage);
        Stage BisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        BisStage.setScene(BisPageScene);
        BisStage.show();
    }

}
