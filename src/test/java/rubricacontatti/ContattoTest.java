/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author EURO
 */
public class ContattoTest {
    private Contatto c;
    
    public ContattoTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        c = new Contatto("Mario", "Rossi", "1234567890", "333665577", null, "mario.rossi@lavoro.it", "mario.rossi@gmail.com", null);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of removeNumero method, of class Contatto.
     */
    @Test
    public void testRemoveNumero() {
        System.out.println("removeNumero");
        String numero = "333665577";
        boolean trovato = false;
        c.removeNumero(numero);
        String numeri[] = c.getNumeri();
        for(int i=0; i<c.getNumeri().length;i++){
            if(numeri[i].equals(numero)){
                trovato = true;
                break;
            }
        }
        assertFalse(trovato);
    }

    /**
     * Test of removeEmail method, of class Contatto.
     */
    @Test
    public void testRemoveEmail() {
        System.out.println("removeEmail");
        String email_r = "mario.rossi@gmail.com";
        boolean trovato = false;
        c.removeEmail(email_r);
        String email[] = c.getEmail();
        for(int i=0; i<c.getEmail().length;i++){
            if(email[i].equals(email_r)){
                trovato = true;
                break;
            }
        }
        assertFalse(trovato);
    }

    /**
     * Test of getId method, of class Contatto.
     */
    @Test
    public void testGetId() {
        System.out.println("getId");
        assertNotNull(c.getId());
    }

    /**
     * Test of getNumeri method, of class Contatto.
     */
    @Test
    public void testGetNumeri() {
        System.out.println("getNumeri");
        assertNotNull(c.getNumeri());
    }

    /**
     * Test of getEmail method, of class Contatto.
     */
    @Test
    public void testGetEmail() {
        System.out.println("getEmail");
        assertNotNull(c.getEmail());
    }

    /**
     * Test of equals method, of class Contatto.
     */
    
}