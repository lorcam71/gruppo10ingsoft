/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/** @file ImportExport.java
 * 
 * 
 * 
 *  @brief Il file contiene l'implementazione dei metodi per importare la rubrica 
 * e per esportare la rubrica.
 * 
 * 
 * 
 *  @author Gruppo10
 *  @date December 13, 2024
 *  @version 1.1
 */
public class ImportExport {
    
    
    
    /**
     * @brief Esegue l'importazione della rubrica
     * 
     * Carica nell'arrayList i contatti da un file
     * 
     * @param[in] filename indica il file da cui eseguire l'importazione 
     * 
     * 
     * @return contiene una lista di contatti imporatati dal file
     * 
    */
    
    public static Rubrica importRubrica(String fileName) throws IOException {
        Rubrica rubrica = new Rubrica();
        try(Scanner s = new Scanner(new BufferedReader(new FileReader(fileName)))){
            if(s.nextLine() == null) return rubrica;
            
            s.useDelimiter("[;\n]");
            
            while(s.hasNext()){
                String nome = s.next();
                String cognome = s.next();
                String numero1 = s.next();
                String numero2 = s.next();
                String numero3 = s.next();
                String email1 = s.next();
                String email2 = s.next();
                String email3 = s.next();
                
                Contatto c = new Contatto(nome,cognome,numero1,numero2,numero3,email1,email2,email3);
                rubrica.addContatto(c);
            }
        }
        return rubrica;
    }
    
    
    
    /**
     * @brief Esegue l'esportazione della rubrica 
     * 
     * Esporta i contatti dell'arrayList in un file esterno specificato dall'utente
     * 
     * @param[in] filename indica il file su cui esportare la rubrica
     * @param[in] rubrica indica la lista di contatti che verra esportata
     * 
    */
    
    public static void exportRubrica(String fileName, ArrayList<Contatto> rubrica) throws IOException{
        try(PrintWriter pw = new PrintWriter(new BufferedWriter(new FileWriter(fileName)))){
            
            pw.println("Nome;Cognome;Numero1;Numero2;Numero3;Email1;Email2;Email3");
            for(Contatto c: rubrica){
                
                pw.print(c.getNome());
                pw.append(';');
                
                pw.print(c.getCognome());
                pw.append(';');
                
                String[] email = c.getEmail();
                String[] numeri = c.getNumeri();
                
                pw.print(numeri[0]);
                pw.append(';');
                pw.print(numeri[1]);
                pw.append(';');
                pw.print(numeri[2]);
                pw.append(';');
                
                pw.print(email[0]);
                pw.append(';');
                pw.print(email[1]);
                pw.append(';');
                pw.println(email[2]);
                
            }
            
        }
    }
    
}
