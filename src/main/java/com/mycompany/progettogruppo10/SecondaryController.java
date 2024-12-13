/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettogruppo10;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.binding.Bindings;
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
import rubricacontatti.Contatto;

/**
 * FXML Controller class
 *
 * @author lorenzo
 */
public class SecondaryController implements Initializable {

    @FXML
    private TextField nameField;
    @FXML
    private TextField surnameField;
    @FXML
    private Button saveButton;
    @FXML
    private Button backButton;
    @FXML
    private Button removeButton;
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
    
    private Contatto contatto;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        initBindings();
    }    

    @FXML
    private void saveAction(ActionEvent event) throws IOException{
        //chiamare la funzione updateInfoContatto 
        //{Prende le info dai fiel -> crea il contatto e rimuove il precedete}
        updateContactInfo(contatto);
        goBack(event);
    }

    private void updateContactInfo(Contatto c){
        //Salvo le informazioni aggiunte dall'utente
        Contatto aggiornato = new Contatto(nameField.getText(),surnameField.getText(),firstNumber.getText(),
        secondNumber.getText(),thirdNumber.getText(),firstMailField.getText(),secondMailField.getText(),thirdMailField.getText());
        
        //Cancello il contatto "vecchio" -> c
        this.deleteContactFromList(c);
        
        //Aggiungo il nuovo con info aggiornate per preservare l'ordinamento
        //Cosi se l'utente cambia cognome/nome siamo coperti
        PrimaryController.getRubrica().addContatto(aggiornato);
    
    }
    
    @FXML
    private void goBack(ActionEvent event) throws IOException{
        //Torna alla scena principale
        FXMLLoader loader = new FXMLLoader(getClass().getResource("primary.fxml"));
        Parent root = loader.load();
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }

    private void deleteContactFromList(Contatto c){
        PrimaryController.getRubrica().removeContatto(contatto);
    }
    
    @FXML
    private void removeContact(ActionEvent event) throws IOException{
        //Rimuovo dalla rubrica e dalla lista osservabile.
        //Delete basata sul metodo equals definito in contatto
        this.deleteContactFromList(contatto);
        goBack(event);
    }
    
    private void initBindings() {
        //Disattivo salva, finchè non è presente almeno un carattere nellla casella nome o cognome
        saveButton.disableProperty().bind(Bindings.when(
            nameField.textProperty().isEmpty().and(surnameField.textProperty().isEmpty())).then(true).otherwise(false));
    }
    
    public void setContatto(Contatto contatto){
        //Mi salvo le info del contatto.
        this.contatto = contatto;
        //Mostro i dati all'utente settando i textField
        setViewInfoContatto();
    }
    
    private void setViewInfoContatto(){
        nameField.setText(contatto.getNome());
        surnameField.setText(contatto.getCognome());
        
        String email[] = contatto.getEmail();
        String numeri[] = contatto.getNumeri();
        
        
        firstNumber.setText(numeri[0]);
        secondNumber.setText(numeri[1]);
        thirdNumber.setText(numeri[2]);

        firstMailField.setText(email[0]);
        secondMailField.setText(email[1]);
        thirdMailField.setText(email[2]);
           
    }
    
    
}
