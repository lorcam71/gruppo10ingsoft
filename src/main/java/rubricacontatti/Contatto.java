
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
 * 
 * 
 *  @author Gruppo10
 *  @date December 14, 2024
 *  @version 1.1
 */
public class Contatto extends Persona{
    
    private ArrayList<String> numeri;
    private ArrayList<String> email;
    private final int id;
    private static int numero=0;
    
    /**
     * @brief Inizializza il contatto 
     * 
     * Crea il contatto con gli attributi passati dall'utente.
     * Se l'utente non inserisce dei dati, (vengono passati null)
     * viene inserita una stringa vuota.
     * Assegna un id univoco al contatto.
     * 
     * @param nome[in]
     * @param cognome[in] 
     * @param numero1[in]
     * @param numero2[in]
     * @param numero3[in]
     * @param email1[in]
     * @param email2[in]
     * @param email3[in]
     */
    public Contatto(String nome, String cognome, String numero1, String numero2,
        String numero3, String email1, String email2, String email3) {
        super(nome,cognome);
        numeri = new ArrayList<String>();
        email = new ArrayList<String>();
        id=numero++;
        
        if(numero1 == null){
            numeri.add("");
        }else{
            numeri.add(numero1);
        }
        
        if(numero2 == null){
            numeri.add("");
        }else{
            numeri.add(numero2);
        }
        
        if(numero3 == null){
            numeri.add("");
        }else{
            numeri.add(numero3);
        }
        
        if(email1 == null){
            email.add("");
        }else{
            email.add(email1);
        }
        
        if(email2 == null){
            email.add("");
        }else{
            email.add(email2);
        }
        if(email3 == null){
            email.add("");
        }else{
            email.add(email3);
        }
        
        

        
    }

    /**
     * @brief rimuove un numero passato come argomento 
     * 
     * @param numero[in] numero da aggiungere al contatto
     * 
    */
    public void removeNumero(String numero){
        this.numeri.remove(numero);
    }
    /**
     * @brief Rimuove la mail passata come parametro
     * 
     * @param email[in] è la mail da rimuovere
     * 
    */
    public void removeEmail(String email){
        this.email.remove(email);
    }
    
    /**
     * @brief restituisce l'id univoco assegnato al contatto
     * 
     * @return id del contatto
     */
    public int getId() {
        return this.id;
    }
    
    /**
     * @brief Funzione per ricevere i numeri associati al contatto.
     * 
     * Lo fa tramite la funzion toArray() che trasforma l'arrayList in un array
     * 
     * @return array di stringhe contenente i numeri di telefono.
     */
    public String[] getNumeri(){
     return this.numeri.toArray(new String[0]);
    }
    
    /**
     * @brief Funzione per ricevere le mail associate al contatto.
     * 
     * Lo fa tramite la funzione toArray() che trasforma l'arrayList in un array
     * 
     * @return array di stringhe contenente le mail.
     */
    public String[] getEmail(){
        return this.email.toArray(new String[0]);
    }

    /**
     * @brief Override della funzione equals
     * 
     * Ci permette di confrontare i contatti tramite l'id.
     * 
     * 
     * @return true se gli id corrispondono, false altrimenti.
     */
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
    
    
    /**
     * @brief Override della funzione toString
     * 
     * 
     * 
     * @return stringa contenente numeri ed email associate ad un contatto.
     */
    
    
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
