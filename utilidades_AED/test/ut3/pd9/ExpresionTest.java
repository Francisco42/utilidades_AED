/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd9;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Francisco
 */
public class ExpresionTest {
    
    public ExpresionTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    @Test
    public void testControlCorchetes() {
        Expresion instance = new Expresion();
        
        boolean result1 = instance.controlCorchetes("{{}}");
        boolean result2 = instance.controlCorchetes("{}}{}}");
        boolean result3 = instance.controlCorchetes("{{{}}");
        
        boolean expResult1 = true;
        boolean expResult2 = false;
        boolean expResult3 = false;
        
        assertEquals(result1, expResult1);
        assertEquals(result2, expResult2);
        assertEquals(result3, expResult3);
    }
    
}
