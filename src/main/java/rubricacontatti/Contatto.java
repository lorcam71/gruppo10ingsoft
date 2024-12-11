
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.util.ArrayList;

/** @file Contatto.java
 * 
 * 
 * 
 *  @brief Il file contiene l'implementazione di un contatto 
 * 
 *  Contatto estende Persona e gestisce numeri ed email di un contatto in degli arrayList.
 *  Utilizza le funzioni addNumero addEmail removeNumero removeEmail 
 * 
 * 
 *  @author Gruppo10
 *  @date December 1, 2024
 *  @version 1.0
 */
public class Contatto extends Persona{
    
    private ArrayList<String> numeri;
    private ArrayList<String> email;
    private final int id;
    private static int numero=0;
    
    /**
     * @brief Inizializza il contatto 
     * Aggiunge gli attributi inseriti dall'utente al contatto
     * 
     * @param[in] nome,cognome, numero1,numero2,numero3,email1,email2,email3
     */
    public Contatto(String nome, String cognome, String numero1, String numero2,
        String numero3, String email1, String email2, String email3) {
        super(nome,cognome);
        numeri = new ArrayList<String>();
        email = new ArrayList<String>();
        id=numero++;
        
        numeri.add(numero1);
        numeri.add(numero2);
        numeri.add(numero3);
        email.add(email1);
        email.add(email2);
        email.add(email3);
        
    }
    /**
     * @brief Aggiunge un numero al contatto
     * 
     * @param[in] numero da aggiungere al contatto
     * 
    */
    public void addNumero(String numero){
        numeri.add(numero);
    }
    /**
     * @brief Aggiunge una mail 
     * 
     * @param[in] email email da aggiungere al contatto
     * 
    */
    public void addEmail(String email){
        this.email.add(email);
    }
    /**
     * @brief rimuove un numero passato come argomento 
     * 
     * @param[in] numero numero da aggiungere al contatto
     * 
    */
    public void removeNumero(String numero){
        numeri.remove(numero.indexOf(numero));
    }
    /**
     * @brief Aggiunge una mail 
     * 
     * @param[in] email email da aggiungere al contatto
     * 
    */
    public void removeEmail(String email){
        this.email.remove(this.email.indexOf(email));
    }

    public int getId() {
        return id;
    }
    
    public String[] getNumeri(){
     return (String[]) this.numeri.toArray();
    }
    
    public String[] getEmail(){
        return (String[]) this.email.toArray();
    }




    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Contatto other = (Contatto) obj;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }
    
    
    
    
    
    @Override
    public String toString() {
        StringBuffer s = new StringBuffer();
        s.append("Numeri: ");
        for(String n: numeri){
            s.append(n);
            s.append("\n");
        }
        
        s.append("Email: \n");
        for(String p: email){
            s.append(p);
            s.append("\n");
        }
        return s.toString();
    }
    
    
    
    
}
