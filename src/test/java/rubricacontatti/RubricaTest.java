/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rubricacontatti;

import java.util.ArrayList;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author ferra
 */
public class RubricaTest {
    private Rubrica r;
    Contatto b = new Contatto("Mario","Rossi","0000001","0000002","0000003",
                   "mr4@unisa.it","privata@gmail.com","lavoro@gmail.com");
    Contatto c = new Contatto("Marco","Verdi","0000010","0000020","0000030",
                   "mv4@unisa.it","privata@gmail.com","lavoro@gmail.com");
    
    public RubricaTest() {
        
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
         r = new Rubrica();
        
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addContatto method, of class Rubrica.
     */
    @Test
    public void testAddContatto() {
        System.out.println("addContatto");
        r.addContatto(b);
        assertTrue(r.getRubrica().contains(b));
    }

    /**
     * Test of removeContatto method, of class Rubrica.
     */
    @Test
    public void testRemoveContatto() {
        System.out.println("removeContatto");
         r.addContatto(c);
         r.removeContatto(c);
        assertFalse(r.getRubrica().contains(c));
      
    }

    /**
     * Test of searchContatto method, of class Rubrica.
     */
    @Test
    public void testSearchContatto() {
        System.out.println("searchContatto");
        r.addContatto(c);
        r.addContatto(b);
        String sottostringa = ("mario");
        ArrayList<Contatto> result = r.searchContatto(sottostringa);
        assertTrue(result.contains(b));
       
    }

    /**
     * Test of toString method, of class Rubrica.
     */
    @Test
    public void testGetRubrica(){
         System.out.println("getRubrica");
         assertNotNull(r.getRubrica());
    }
    
    
    @Test
    public void testToString() {
        System.out.println("toString");
  
       assertNotNull(r.getRubrica());
        
    }
    
}
