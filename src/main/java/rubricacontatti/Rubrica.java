/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.util.ArrayList;
/** @file Rubrica.java
 * 
 *  @brief Il file contiene un arraylist di contatti
 * 
 * Il file implementa tutte le funzioni di gestione di una rubrica, con aggiunta, rimozione
 * ricerca, importazione da file e esportazione su file.
 *  
 * 
 *  @author Gruppo10
 *  @date December 2, 2024
 *  @version 1.0
 */
public class Rubrica {
    private ArrayList<Contatto> rubrica;
    /**
     * @brief costruttore della rubrica
     * Istanzia l'ArrayList di contatti
     * 
     */
    public Rubrica(){
        rubrica = new ArrayList<Contatto>();

    }
    /**
     * @brief la funzione aggiunge un contatto alla lista 
     * 
     * @param[in] c rappresenta il contatto da aggiungere
    */
    public void addContatto(Contatto c){

    }
    
    /**
     * @brief la funzione aggiunge un contatto alla lista 
     * 
     * @param[in] c rappresenta il contatto da rimuovere
    */
    public void removeContatto(Contatto c){
        
    }

    /**
     * @brief Ricerca una stringa nella rubrica
     * 
     * Dopo l'immessione di una sotto stringa quest' ultima viene utilizzata per trovare il contatto desiderato
     * 
     * @param[in] sottostringa Stringa da utilizzare per la ricerca
     * @return Il contatto cercato dall'utente
     * 
     * 
    */
    public Contatto searchContatto(String sottostringa){
        
    }

    
    @Override
    public String toString() {
        return "Rubrica{" + "rubrica=" + rubrica + '}';
    }
    
  
}