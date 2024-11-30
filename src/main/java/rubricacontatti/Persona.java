
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
