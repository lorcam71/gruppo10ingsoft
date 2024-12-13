/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
/** @file Rubrica.java
 * 
 *  @brief Il file contiene un arraylist di contatti
 * 
 * Il file implementa tutte le funzioni di gestione di una rubrica, con aggiunta, rimozione
 * ricerca, importazione da file e esportazione su file.
 *  
 * 
 *  @author Gruppo10
 *  @date December 13, 2024
 *  @version 1.1
 */
public class Rubrica {
    private ArrayList<Contatto> rubrica;
    /**
     * @brief costruttore della rubrica
     * Istanzia l'ArrayList di contatti
     * 
     * @return Istanza un oggetto di tipo Rubrica
     */
    public Rubrica(){
        rubrica = new ArrayList<Contatto>();

    }
    /**
     * @brief la funzione aggiunge un contatto alla lista 
     * La funzione dopo aver aggiunto il contatto alla lista,
     * la ordina.
     * 
     * @param[in] c rappresenta il contatto da aggiungere
    */
    public void addContatto(Contatto c){
        rubrica.add(c);
        rubrica.sort((o1, o2) -> {
            if(!o1.getCognome().toLowerCase().equals(o2.getCognome().toLowerCase())){
                return o1.getCognome().toLowerCase().compareTo(o2.getCognome().toLowerCase());
            }
            else{            
                return o1.getNome().toLowerCase().compareTo(o2.getNome().toLowerCase());
            }
        });
        
    }
    
    /**
     * @brief la funzione rimuove un contatto dalla lista 
     * Basata sull'id del contatto.
     * 
     * @param[in] c rappresenta il contatto da rimuovere
    */
    public void removeContatto(Contatto c){
        rubrica.remove(c);
    }

    /**
     * @brief Ricerca una stringa nella rubrica
     * 
     * Dopo l'immessione di una sotto stringa quest' ultima 
     * viene utilizzata per trovare il contatto desiderato
     * Vengono visualizzati i contatti che hanno nome o cognome che iniziano per quella stringa.
     * è stato gestito il caso in cui l'utente passi come stringa nome e cognome del contatto esempio:
     * "mario rossi".
     * 
     * @param[in] sottostringa Stringa da utilizzare per la ricerca
     * @return ArrayList di tipo Contatto, con i contatti che iniziano per la sottostringa
     * 
     * 
    */
    public ArrayList<Contatto> searchContatto(String sottostringa){
        
        ArrayList<Contatto> rubricaRicerca = new ArrayList<Contatto>();
        for(Contatto c: rubrica){
            
            if(c.getNome().toLowerCase().startsWith(sottostringa.toLowerCase()) || c.getCognome().toLowerCase().startsWith(sottostringa.toLowerCase()) || (c.getCognome()+" "+c.getNome()).toLowerCase().startsWith(sottostringa.toLowerCase()) || (c.getNome()+" "+c.getCognome()).toLowerCase().startsWith(sottostringa.toLowerCase())){
                rubricaRicerca.add(c);
            }
            
        }
        return rubricaRicerca;
    }

    /**
     * @brief restituisce la rubrica
     * 
     * @return La rubrica.
     */
    public ArrayList<Contatto> getRubrica() {
        return rubrica;
    }
    
    
    /*
    @Override
    public String toString() {
        return "Rubrica{" + "rubrica=" + rubrica + '}';
    }
    
  */
}