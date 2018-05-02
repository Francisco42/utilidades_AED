/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.p2015;

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
public class ListaOrdenadaTest {
    
    public ListaOrdenadaTest() {
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
     * Test of mezclar method, of class ListaOrdenada.
     */
    @Test
    public void testMezclar() {
        System.out.println("mezclar");
        
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();
        
        lista1.insertar(new Nodo(2, null));
        lista1.insertar(new Nodo(1, null));
        lista1.insertar(new Nodo(4, null));
        
        lista1.insertar(new Nodo(2, null));
        lista2.insertar(new Nodo(4, null));
        lista2.insertar(new Nodo(5, null));
        lista2.insertar(new Nodo(3, null));
        
        ListaOrdenada expResult = new ListaOrdenada();
        
        expResult.insertar(new Nodo(1, null));
        expResult.insertar(new Nodo(2, null));
        expResult.insertar(new Nodo(2, null));
        expResult.insertar(new Nodo(3, null));
        expResult.insertar(new Nodo(4, null));
        expResult.insertar(new Nodo(4, null));
        expResult.insertar(new Nodo(5, null));
        
        ListaOrdenada result = lista1.mezclar(lista2);
        
        Nodo aux1 = result.getPrimero();
        Nodo aux2 = expResult.getPrimero();
        while ((aux1 != null) || (aux2 != null)) {
            assertEquals(aux1.getEtiqueta(), aux2.getEtiqueta());
            aux1 = aux1.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
    }

    /**
     * Test of retirarDuplicados method, of class ListaOrdenada.
     */
    @Test
    public void testRetirarDuplicados() {
        System.out.println("retirarDuplicados");
        
        ListaOrdenada lista1 = new ListaOrdenada();
        ListaOrdenada lista2 = new ListaOrdenada();
        
        lista1.insertar(new Nodo(1, null));
        lista1.insertar(new Nodo(2, null));
        lista1.insertar(new Nodo(2, null));
        lista1.insertar(new Nodo(3, null));
        lista1.insertar(new Nodo(4, null));
        lista1.insertar(new Nodo(4, null));
        lista1.insertar(new Nodo(5, null));
        
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        lista2.insertar(new Nodo(1, null));
        
        lista1.retirarDuplicados();
        lista2.retirarDuplicados();
        
        ListaOrdenada expResult1 = new ListaOrdenada();
        ListaOrdenada expResult2 = new ListaOrdenada();
        
        expResult1.insertar(new Nodo(1, null));
        expResult1.insertar(new Nodo(2, null));
        expResult1.insertar(new Nodo(3, null));
        expResult1.insertar(new Nodo(4, null));
        expResult1.insertar(new Nodo(5, null));
        
        expResult2.insertar(new Nodo(1, null));
        
        Nodo aux1 = lista1.getPrimero();
        Nodo aux2 = expResult1.getPrimero();
        while ((aux1 != null) || (aux2 != null)) {
            assertEquals(aux1.getEtiqueta(), aux2.getEtiqueta());
            aux1 = aux1.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        Nodo aux1b = lista2.getPrimero();
        Nodo aux2b = expResult2.getPrimero();
        while ((aux1 != null) || (aux2 != null)) {
            assertEquals(aux1.getEtiqueta(), aux2.getEtiqueta());
            aux1 = aux1.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
    }
    
}
