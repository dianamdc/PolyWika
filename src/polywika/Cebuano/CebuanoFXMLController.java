/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Cebuano;

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
public class CebuanoFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionBack(ActionEvent event) throws IOException {
        //System.out.println("Lmao gumagana");
        Parent homePage = FXMLLoader.load(getClass().getResource("/polywika/HomePage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        homeStage.setScene(homePageScene);
        homeStage.show();
    }

    public void handleButtonActionLearn(ActionEvent event) throws IOException {
        Parent learnCeb = FXMLLoader.load(getClass().getResource("/polywika/Cebuano/Cebuano.fxml"));
        Scene learnCebScene = new Scene(learnCeb);
        Stage learnCebStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        learnCebStage.setScene(learnCebScene);
        learnCebStage.show();
    }

}
