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
public class BisayaFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionBack(ActionEvent event) throws IOException {
        //System.out.println("Lmao gumagana");
        Parent homePage = FXMLLoader.load(getClass().getResource("HomePage.fxml"));
        Scene homePageScene = new Scene(homePage);
        Stage homeStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        homeStage.setScene(homePageScene);
        homeStage.show();
    }

    public void handleButtonActionLearn(ActionEvent event) throws IOException {
        Parent learnBis = FXMLLoader.load(getClass().getResource("/polywika/Bisaya/LearnBis.fxml"));
        Scene learnBisScene = new Scene(learnBis);
        Stage learnBisStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        learnBisStage.setScene(learnBisScene);
        learnBisStage.show();
    }

}
