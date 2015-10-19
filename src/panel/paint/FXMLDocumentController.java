/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel.paint;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;

/**
 *
 * @author W8
 */
public class FXMLDocumentController implements Initializable {
    @FXML
    private Button button;
    
    //j
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        Image cubo = new Image(getClass().getResourceAsStream("cubo_azul.png"));
        ImageView iv=new ImageView(cubo);
        iv.setFitHeight(50);
        iv.setFitWidth(50);
        button.setGraphic(iv);
    }    
    
}
