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
public class LearnCebController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }

    public void handleButtonActionBack(ActionEvent event) throws IOException {
        //System.out.println("Lmao gumagana");
        Parent CebPage = FXMLLoader.load(getClass().getResource("/polywika/Cebuano/CebuanoFXML.fxml"));
        Scene CebPageScene = new Scene(CebPage);
        Stage CebStage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        CebStage.setScene(CebPageScene);
        CebStage.show();
    }

}
