/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd11;

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
public class ListaTest {
    
    public ListaTest() {
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

    /**
     * Test of ordenaParesImpares method, of class Lista.
     */
    @Test
    public void testOrdenaParesImpares() {
        System.out.println("ordenaParesImpares");
        
        Lista instance1 = new Lista();
        Lista instance2 = new Lista();
        Lista instance3 = new Lista();
        
        instance1.insertar(new Nodo(1, null));
        instance1.insertar(new Nodo(5, null));
        instance1.insertar(new Nodo(4, null));
        instance1.insertar(new Nodo(9, null));
        instance1.insertar(new Nodo(2, null));
        instance1.insertar(new Nodo(3, null));
        
        instance2.insertar(new Nodo(2, null));
        instance2.insertar(new Nodo(8, null));
        instance2.insertar(new Nodo(6, null));
        
        instance3.insertar(new Nodo(9, null));
        instance3.insertar(new Nodo(1, null));
        instance3.insertar(new Nodo(3, null));
        
        Lista expResultA = new Lista();
        Lista expResultB = new Lista();
        Lista expResultC = new Lista();
        
        expResultA.insertar(new Nodo(1, null));
        expResultA.insertar(new Nodo(3, null));
        expResultA.insertar(new Nodo(5, null));
        expResultA.insertar(new Nodo(9, null));
        expResultA.insertar(new Nodo(2, null));
        expResultA.insertar(new Nodo(4, null));
        
        expResultB.insertar(new Nodo(2, null));
        expResultB.insertar(new Nodo(6, null));
        expResultB.insertar(new Nodo(8, null));
        
        expResultC.insertar(new Nodo(1, null));
        expResultC.insertar(new Nodo(3, null));
        expResultC.insertar(new Nodo(9, null));
        
        Lista resultA = instance1.ordenaParesImpares();
        Lista resultB = instance2.ordenaParesImpares();
        Lista resultC = instance3.ordenaParesImpares();
        
        Nodo aux1A = resultA.getPrimero();
        Nodo aux2 = expResultA.getPrimero();
        while ((aux1A != null) && (aux2 != null)) {
            assertEquals(aux1A.getEtiqueta(), aux2.getEtiqueta());
            aux1A = aux1A.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        Nodo aux1B = resultB.getPrimero();
        Nodo aux3 = expResultB.getPrimero();
        while ((aux1A != null) && (aux3 != null)) {
            assertEquals(aux1B.getEtiqueta(), aux3.getEtiqueta());
            aux1B = aux1B.getSiguiente();
            aux3 = aux3.getSiguiente();
        }
        
        Nodo aux1C = resultC.getPrimero();
        Nodo aux4 = expResultC.getPrimero();
        while ((aux1C != null) && (aux4 != null)) {
            assertEquals(aux1C.getEtiqueta(), aux4.getEtiqueta());
            aux1C = aux1C.getSiguiente();
            aux4 = aux4.getSiguiente();
        }
    }
    
}
