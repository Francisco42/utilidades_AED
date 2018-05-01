/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd7;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author usuario
 */
public class ConjuntoTest {

    
    public ConjuntoTest() {
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
     * Test of union method, of class Conjunto.
     */
    @Test
    public void testUnion() {
        System.out.println("union");
        
        Conjunto<Alumno> instance1 = new Conjunto();
        Conjunto<Alumno> instance2 = new Conjunto();
        Conjunto<Alumno> instance3 = new Conjunto();
        Conjunto<Alumno> instance4 = new Conjunto();
        
        Alumno a1 = new Alumno("a", "a", 1);
        Alumno a2 = new Alumno("b", "b", 2);
        Alumno a3 = new Alumno("c", "c", 3);
        Alumno a4 = new Alumno("d", "d", 4);
        Alumno a5 = new Alumno("e", "e", 5);
        Alumno a6 = new Alumno("f", "f", 6);
        Alumno a7 = new Alumno("g", "g", 7);
        Alumno a8 = new Alumno("h", "h", 8);
        Alumno a9 = new Alumno("i", "i", 9);
        Alumno a10 = new Alumno("j", "j", 10);
        
        instance1.insertar(new Nodo(a1, a1.getCedula()));
        instance1.insertar(new Nodo(a2, a2.getCedula()));
        instance1.insertar(new Nodo(a3, a3.getCedula()));
        instance1.insertar(new Nodo(a4, a4.getCedula()));
        instance1.insertar(new Nodo(a5, a5.getCedula()));
        instance1.insertar(new Nodo(a6, a6.getCedula()));
        instance1.insertar(new Nodo(a7, a7.getCedula()));
        
        instance2.insertar(new Nodo(a1, a1.getCedula()));
        instance2.insertar(new Nodo(a4, a4.getCedula()));
        instance2.insertar(new Nodo(a10, a10.getCedula()));
        instance2.insertar(new Nodo(a8, a8.getCedula()));
        instance2.insertar(new Nodo(a2, a2.getCedula()));
        
        instance3.insertar(new Nodo(a1, a1.getCedula()));
        instance3.insertar(new Nodo(a2, a2.getCedula()));
        instance3.insertar(new Nodo(a3, a3.getCedula()));
        instance3.insertar(new Nodo(a4, a4.getCedula()));
        instance3.insertar(new Nodo(a5, a5.getCedula()));
        instance3.insertar(new Nodo(a6, a6.getCedula()));
        instance3.insertar(new Nodo(a7, a7.getCedula()));
        
        instance4.insertar(new Nodo(a8, a8.getCedula()));
        instance4.insertar(new Nodo(a9, a9.getCedula()));
        instance4.insertar(new Nodo(a10, a10.getCedula()));
        
        IConjunto expResultA = new Conjunto();
        IConjunto expResultB = new Conjunto();
        IConjunto expResultC = new Conjunto();
        
        expResultA.insertar(new Nodo(a1, a1.getCedula()));
        expResultA.insertar(new Nodo(a2, a2.getCedula()));
        expResultA.insertar(new Nodo(a3, a3.getCedula()));
        expResultA.insertar(new Nodo(a4, a4.getCedula()));
        expResultA.insertar(new Nodo(a5, a5.getCedula()));
        expResultA.insertar(new Nodo(a6, a6.getCedula()));
        expResultA.insertar(new Nodo(a7, a7.getCedula()));
        expResultA.insertar(new Nodo(a10, a10.getCedula()));
        expResultA.insertar(new Nodo(a8, a8.getCedula()));
        
        expResultB.insertar(new Nodo(a1, a1.getCedula()));
        expResultB.insertar(new Nodo(a2, a2.getCedula()));
        expResultB.insertar(new Nodo(a3, a3.getCedula()));
        expResultB.insertar(new Nodo(a4, a4.getCedula()));
        expResultB.insertar(new Nodo(a5, a5.getCedula()));
        expResultB.insertar(new Nodo(a6, a6.getCedula()));
        expResultB.insertar(new Nodo(a7, a7.getCedula()));
        
        expResultC.insertar(new Nodo(a1, a1.getCedula()));
        expResultC.insertar(new Nodo(a2, a2.getCedula()));
        expResultC.insertar(new Nodo(a3, a3.getCedula()));
        expResultC.insertar(new Nodo(a4, a4.getCedula()));
        expResultC.insertar(new Nodo(a5, a5.getCedula()));
        expResultC.insertar(new Nodo(a6, a6.getCedula()));
        expResultC.insertar(new Nodo(a7, a7.getCedula()));
        expResultC.insertar(new Nodo(a8, a8.getCedula()));
        expResultC.insertar(new Nodo(a9, a9.getCedula()));
        expResultC.insertar(new Nodo(a10, a10.getCedula()));
        
        IConjunto resultA = instance1.union(instance2);
        IConjunto resultB = instance1.union(instance3);
        IConjunto resultC = instance1.union(instance4);
        
        INodo<Alumno> aux1A = resultA.getPrimero();
        INodo<Alumno> aux2 = expResultA.getPrimero();
        while ((aux1A != null) && (aux2 != null)) {
            assertEquals(aux1A.getDato(), aux2.getDato());
            aux1A = aux1A.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        INodo<Alumno> aux1B = resultB.getPrimero();
        INodo<Alumno> aux3 = expResultB.getPrimero();
        while ((aux1A != null) && (aux3 != null)) {
            assertEquals(aux1B.getDato(), aux3.getDato());
            aux1B = aux1B.getSiguiente();
            aux3 = aux3.getSiguiente();
        }
        
        INodo<Alumno> aux1C = resultC.getPrimero();
        INodo<Alumno> aux4 = expResultC.getPrimero();
        while ((aux1C != null) && (aux4 != null)) {
            assertEquals(aux1C.getDato(), aux4.getDato());
            aux1C = aux1C.getSiguiente();
            aux4 = aux4.getSiguiente();
        }
    }

    /**
     * Test of interseccion method, of class Conjunto.
     */
    @Test
    public void testInterseccion() {
        System.out.println("interseccion");
        
        Conjunto<Alumno> instance1 = new Conjunto();
        Conjunto<Alumno> instance2 = new Conjunto();
        Conjunto<Alumno> instance3 = new Conjunto();
        Conjunto<Alumno> instance4 = new Conjunto();

        Alumno a1 = new Alumno("a", "a", 1);
        Alumno a2 = new Alumno("b", "b", 2);
        Alumno a3 = new Alumno("c", "c", 3);
        Alumno a4 = new Alumno("d", "d", 4);
        Alumno a5 = new Alumno("e", "e", 5);
        Alumno a6 = new Alumno("f", "f", 6);
        Alumno a7 = new Alumno("g", "g", 7);
        Alumno a8 = new Alumno("h", "h", 8);
        Alumno a9 = new Alumno("i", "i", 9);
        Alumno a10 = new Alumno("j", "j", 10);
        
        instance1.insertar(new Nodo(a1, a1.getCedula()));
        instance1.insertar(new Nodo(a2, a2.getCedula()));
        instance1.insertar(new Nodo(a3, a3.getCedula()));
        instance1.insertar(new Nodo(a4, a4.getCedula()));
        instance1.insertar(new Nodo(a5, a5.getCedula()));
        instance1.insertar(new Nodo(a6, a6.getCedula()));
        instance1.insertar(new Nodo(a7, a7.getCedula()));
        
        instance2.insertar(new Nodo(a1, a1.getCedula()));
        instance2.insertar(new Nodo(a4, a4.getCedula()));
        instance2.insertar(new Nodo(a10, a10.getCedula()));
        instance2.insertar(new Nodo(a8, a8.getCedula()));
        instance2.insertar(new Nodo(a2, a2.getCedula()));
        
        instance3.insertar(new Nodo(a1, a1.getCedula()));
        instance3.insertar(new Nodo(a2, a2.getCedula()));
        instance3.insertar(new Nodo(a3, a3.getCedula()));
        instance3.insertar(new Nodo(a4, a4.getCedula()));
        instance3.insertar(new Nodo(a5, a5.getCedula()));
        instance3.insertar(new Nodo(a6, a6.getCedula()));
        instance3.insertar(new Nodo(a7, a7.getCedula()));
        
        instance4.insertar(new Nodo(a8, a8.getCedula()));
        instance4.insertar(new Nodo(a9, a9.getCedula()));
        instance4.insertar(new Nodo(a10, a10.getCedula()));
        
        IConjunto expResultA = new Conjunto();
        IConjunto expResultB = new Conjunto();
        IConjunto expResultC = new Conjunto();
        
        expResultA.insertar(new Nodo(a1, a1.getCedula()));
        expResultA.insertar(new Nodo(a2, a2.getCedula()));
        expResultA.insertar(new Nodo(a4, a4.getCedula()));
        
        expResultB.insertar(new Nodo(a1, a1.getCedula()));
        expResultB.insertar(new Nodo(a2, a2.getCedula()));
        expResultB.insertar(new Nodo(a3, a3.getCedula()));
        expResultB.insertar(new Nodo(a4, a4.getCedula()));
        expResultB.insertar(new Nodo(a5, a5.getCedula()));
        expResultB.insertar(new Nodo(a6, a6.getCedula()));
        expResultB.insertar(new Nodo(a7, a7.getCedula()));
        
        IConjunto resultA = instance1.interseccion(instance2);
        IConjunto resultB = instance1.interseccion(instance3);
        IConjunto resultC = instance1.interseccion(instance4);
        
        INodo<Alumno> aux1A = resultA.getPrimero();
        INodo<Alumno> aux2 = expResultA.getPrimero();
        while ((aux1A != null) && (aux2 != null)) {
            assertEquals(aux1A.getDato(), aux2.getDato());
            aux1A = aux1A.getSiguiente();
            aux2 = aux2.getSiguiente();
        }
        
        INodo<Alumno> aux1B = resultB.getPrimero();
        INodo<Alumno> aux3 = expResultB.getPrimero();
        while ((aux1A != null) && (aux3 != null)) {
            assertEquals(aux1B.getDato(), aux3.getDato());
            aux1B = aux1B.getSiguiente();
            aux3 = aux3.getSiguiente();
        }
        
        INodo<Alumno> aux1C = resultC.getPrimero();
        INodo<Alumno> aux4 = expResultC.getPrimero();
        while ((aux1C != null) && (aux4 != null)) {
            assertEquals(aux1C.getDato(), aux4.getDato());
            aux1C = aux1C.getSiguiente();
            aux4 = aux4.getSiguiente();
        }
    }
    
}
