/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.progettogruppo10;
import java.io.IOException;
import rubricacontatti.*;

import java.net.URL;
import java.util.ArrayList;
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
import javafx.stage.FileChooser;
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
    private static Rubrica rubrica = new Rubrica(); //Creo la rubrica
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //instanzio la lista osservabile
        contatti = FXCollections.observableArrayList();
        //metto i nomi delle celle 
        colName.setCellValueFactory(s->{return new SimpleStringProperty(s.getValue().getNome());});
        colSurname.setCellValueFactory(s->{return new SimpleStringProperty(s.getValue().getCognome());});

        //pulisco la vista e carico la rubrica
        //cosi quando cambio view ricarico correttamente
        contatti.clear();
        contatti.addAll(rubrica.getRubrica());
    
        //Uso la funzione di ricerca implementata in rubrica
        //Se l'utente non mette nulla nella barra di ricerca o cancella la sottotringa
        //viene visualizzata tutta la rubrica
        searchContatto.textProperty().addListener((observable,oldValue,newValue)->{
            contatti.clear();
            if (newValue == null || newValue.isEmpty()) {
                contatti.addAll(rubrica.getRubrica());
            } else {
            ArrayList<Contatto> risultatiRicerca = rubrica.searchContatto(newValue);
            contatti.addAll(risultatiRicerca);
            }
        });
        
        listContatti.setItems(contatti);
        listContatti.refresh(); //aggiorno la view
        
        listContatti.setOnMouseClicked(event -> {
            if(event.getClickCount() == 2){
                Contatto contattoSelezionato = listContatti.getSelectionModel().getSelectedItem();
                if(contattoSelezionato != null){
                    infoContatto(contattoSelezionato);
                }
            }
        });
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

    public static Rubrica getRubrica() {
        return rubrica;
    }
    
    @FXML
    private void closeProgram(ActionEvent event) {
        //Chiude il programma
        System.exit(0);
    }

    @FXML
    private void importaRubrica(ActionEvent event) {
    }

    @FXML
    private void esportaRubrica(ActionEvent event) {
    }
    
    private void infoContatto(Contatto contatto){
        try{
            FXMLLoader loader  =  new FXMLLoader(getClass().getResource("secondary.fxml"));
            Parent root  = loader.load();
            
            SecondaryController secondaryCont = loader.getController();
            secondaryCont.setContatto(contatto);
            
            Stage stage = (Stage) listContatti.getScene().getWindow();
            Scene scene  = new Scene(root);
            stage.setScene(scene);
            stage.centerOnScreen();
            stage.show();
        }catch(IOException e){
            
        }
    }
    
}
