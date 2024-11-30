
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.util.ArrayList;

/**
 *
 * @author lorenzo
 */
public class Contatto extends Persona{
    
    private ArrayList<String> numeri;
    private ArrayList<String> email;

    public Contatto(String nome, String cognome, String numero1, String numero2,
        String numero3, String email1, String email2, String email3) {
        super(nome,cognome);
        
        
    }
    
    public void addNumero(String numero){
        
    }
    
    public void addEmail(String numero){
        
    }
    
    public void removeNumero(String numero){
        
    }
    
    public void removeEmail(String numero){
        
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
