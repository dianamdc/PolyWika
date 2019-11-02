/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Tagalog;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
//import java.util.logging.Level;
//import java.util.logging.Logger;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
//import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class TagalogFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }
    
    @FXML
    public void handleButtonActionBack (ActionEvent event) throws IOException{
        //System.out.println("Lmao gumagana");
        Parent homePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homeStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        homeStage.setScene(homePageScene);
        homeStage.show();
    }
    
    public void handleButtonActionLearn (ActionEvent event) throws IOException{
        Parent learnTag = FXMLLoader.load(getClass().getResource("/polywika/Tagalog/LearnTag.fxml"));
        Scene learnTagScene = new Scene(learnTag);
        Stage learnTagStage = (Stage)((Node)event.getSource()).getScene().getWindow();
    
        learnTagStage.setScene(learnTagScene);
        learnTagStage.show(); 
    }
}
