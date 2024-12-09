/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettogruppo10;
import rubricacontatti.*;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.beans.binding.Bindings;

/**
 * FXML Controller class
 *
 * @author lorenzo
 */
public class ThirdController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private TextField firstMailField;
    @FXML
    private TextField secondMailField;
    @FXML
    private TextField thirdMailField;
    @FXML
    private TextField thirdNumber;
    @FXML
    private TextField secondNumber;
    @FXML
    private TextField firstNumber;
    @FXML
    private Button backButton;
    @FXML
    private Button addContactButton;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // avvio i metodi
        initBindings();
    }    

    @FXML
    private void goBack(ActionEvent event) throws IOException{
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    @FXML
    private void addContactToList(ActionEvent event) throws IOException {
        //Ricavo i dati dell'utent dai box
        Contatto n = new Contatto(nameField.getText(),surnameField.getText(),firstNumber.getText(),
        secondNumber.getText(),thirdNumber.getText(),firstMailField.getText(),secondMailField.getText(),thirdMailField.getText());
        //Richiamo il metodo statico della lista osservabile e aggiungo il contatto
        PrimaryController.getContatti().add(n);
        goBack(event);     
    }

    
    private void initBindings() {
        //Disattivo aggiungi, finchè non è presente almeno un carattere nellla casella nome o cognome
        addContactButton.disableProperty().bind(Bindings.when(
            nameField.textProperty().isEmpty().and(surnameField.textProperty().isEmpty())).then(true).otherwise(false));
    }
    
    
    
}
