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
        c = new Contatto("Mario", "Rossi", "1234567890", null, null, "mario.rossi@lavoro.it", null, null);
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addNumero method, of class Contatto.
     */
    @Test
    public void testAddNumero() {
        System.out.println("addNumero");
        String numero = "1234567891";
        c.addNumero(numero);
        c.addNumero("33");
        System.out.println(c);
        
    }

    /**
     * Test of addEmail method, of class Contatto.
     */
    @Test
    public void testAddEmail() {
        System.out.println("addEmail");
        String email = "";
        Contatto instance = null;
        instance.addEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeNumero method, of class Contatto.
     */
    @Test
    public void testRemoveNumero() {
        System.out.println("removeNumero");
        String numero = "";
        Contatto instance = null;
        instance.removeNumero(numero);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of removeEmail method, of class Contatto.
     */
    @Test
    public void testRemoveEmail() {
        System.out.println("removeEmail");
        String email = "";
        Contatto instance = null;
        instance.removeEmail(email);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
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
