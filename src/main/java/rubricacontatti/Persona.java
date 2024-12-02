
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

/**
 *
 * @author lorenzo
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
     * Qualore uno dei 2 parametri dovesse non esser stato assegnato viene impostato a stringa vuota
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



    @Override
    public String toString() {
        return "Nome=" + this.nome + ", Cognome=" + this.cognome;
    }
    
    
    
    
}
