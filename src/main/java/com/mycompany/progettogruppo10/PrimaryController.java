/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettogruppo10;
import java.io.IOException;
import rubricacontatti.*;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

/**
 * FXML Controller class
 *
 * @author lorenzo
 */
public class PrimaryController implements Initializable {

    @FXML
    private Button newContatto; //Collegato ad addContact, Action on event scene Builder
    @FXML
    private TextField searchContatto;
    @FXML
    private TableView<Contatto> listContatti;
    @FXML
    private TableColumn<Contatto, String> colName;
    @FXML
    private TableColumn<Contatto, String> colSurname;
    @FXML
    private Button importRubrica;
    @FXML
    private Button exportRubrica;
    @FXML
    private Button exit;
    
    private static ObservableList<Contatto> contatti; //Lista osservabile
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
        contatti = FXCollections.observableArrayList(); //Istanzio arrayList osservabile e assegno un riferimento

        colName.setCellValueFactory(s->{return new SimpleStringProperty(s.getValue().getNome());});
        colSurname.setCellValueFactory(new PropertyValueFactory("Cognome"));
        
        listContatti.setItems(contatti);
        
    }

    @FXML
    private void addContact(ActionEvent event) throws IOException{
        // Prendo l'FXML da far visualizzare
        FXMLLoader loader = new FXMLLoader(getClass().getResource("third.fxml"));
        Parent root = loader.load(); //CArica la scena

        // Prendo la finestra corrente
        Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();

        // Imposta la nuova scena nello Stage
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.centerOnScreen();
        stage.show();
    }
    
    public static ObservableList<Contatto> getContatti(){
        //dichiarando static la lista osservabile, e creando un metodo che la ritorna
        //posso richiamare il metodo ovunque ed eseguire le operazioni che voglio sulla lista
        return contatti;
    }
    
    
    
}
