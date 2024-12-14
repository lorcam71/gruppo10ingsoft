
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

/** @file Persona.java
 * 
 * 
 * 
 *  @brief Il file contiene l'implementazione della classe astratta Persona.
 * 
 * 
 * 
 *  @author Gruppo10
 *  @date December 14, 2024
 *  @version 1.1
 */
public abstract class Persona {
    
    private String nome;
    private String cognome;



    /**
     * @brief Crea un oggetto persona
     * 
     * @param nome[in] nome associato all'oggetto
     * @param cognome[in] cognome associato all'oggetto
     * 
     * Qualora uno dei 2 parametri dovesse non esser stato assegnato viene impostato a stringa vuota
     * 
     * 
    */
    public Persona(String nome, String cognome) {
        if(nome.equals(null)){
            nome = "";
            this.nome = nome;
            this.cognome = cognome;
        }else if(cognome.equals(null)){
            cognome = "";
            this.nome = nome;
            this.cognome = cognome;
        }
        this.nome = nome;
        this.cognome = cognome;
    }



    /**
     * @brief I metodi getter e setter aggiungono e ritornano un parametro di persona
     * 
     * 
    */
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCognome() {
        return cognome;
    }

    public void setCognome(String cognome) {
        this.cognome = cognome;
    }

    /**
     * @brief Override della funzione toString()
     * @return stringa contenente nome e cognome della persona
     */

    @Override
    public String toString() {
        return "Nome=" + this.nome + ", Cognome=" + this.cognome;
    }
    
    
    
    
}
