/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polywika.Tagalog;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import polywika.*;

/**
 * FXML Controller class
 *
 * @author diana
 */
public class TagalogVocabFXMLController implements Initializable {

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {

//        try {
//            // TODO
//            Vocab v = new Vocab("Tagalog");
//            v.addNewWord("alam", "know");
//            ObjectMapper objectMapper = new ObjectMapper();
//            String dir = "src/polywika/Vocab/tagalogvocab.json";
//            objectMapper.writeValue(new FileOutputStream(dir), v);
//
//        } catch (FileNotFoundException ex) {
//            Logger.getLogger(TagalogVocabFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//        } catch (IOException ex) {
//            Logger.getLogger(TagalogVocabFXMLController.class.getName()).log(Level.SEVERE, null, ex);
//        }
        try {
            ObjectMapper objectMapper = new ObjectMapper();
            String dir = "src/polywika/vocabfiles/tagalogvocab.json";
            Vocab v = objectMapper.readValue(new File(dir), Vocab.class);
        } catch (IOException ex) {
            Logger.getLogger(TagalogVocabFXMLController.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
