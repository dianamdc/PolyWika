/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Bisaya;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author MARUAL FAMILY
 */
public class LearnBisController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }  
    
    public void handleButtonActionBack (ActionEvent event) throws IOException{
        //System.out.println("Lmao gumagana");
        Parent BisPage = FXMLLoader.load(getClass().getResource("/polywika/Bisaya/BisayaFXML.fxml"));
        Scene BisPageScene = new Scene(BisPage);
        Stage BisStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        BisStage.setScene(BisPageScene);
        BisStage.show();
    }
    
}
