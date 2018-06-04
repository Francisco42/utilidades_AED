package parcial2;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.LinkedList;
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
public class TArbolBBUTest {
    
    public TArbolBBUTest() {
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
     * Test of armarIndiceCarrera method, of class TArbolBBU.
     */
    @Test
    public void testArmarIndiceCarrera() {
        System.out.println("armarIndiceCarrera");

        Alumno a1 = new Alumno(123,"Abadie","Psicología");
        Alumno a2 = new Alumno(279,"Abal","Ing. Informática");
        Alumno a3 = new Alumno(96,"Aguerrondo","Derecho");
        Alumno a4 = new Alumno(267,"Aicardi","Psicología");
        Alumno a5 = new Alumno(330,"Alberti","Derecho");
        Alumno a6 = new Alumno(226,"Aldecosea","Medicina");
        Alumno a7 = new Alumno(154,"Alegre","Medicina");
        Alumno a8 = new Alumno(259,"Alonso","Ing. Informática");
        Alumno a9 = new Alumno(281,"Alpuy","Ing. Informática");

        TArbolBBU instance = new TArbolBBU();
        instance.insertar(new TNodoAlumnoAB(a1.getCodigo(), a1));
        instance.insertar(new TNodoAlumnoAB(a2.getCodigo(), a2));
        instance.insertar(new TNodoAlumnoAB(a3.getCodigo(), a3));
        instance.insertar(new TNodoAlumnoAB(a4.getCodigo(), a4));
        instance.insertar(new TNodoAlumnoAB(a5.getCodigo(), a5));
        instance.insertar(new TNodoAlumnoAB(a6.getCodigo(), a6));
        instance.insertar(new TNodoAlumnoAB(a7.getCodigo(), a7));
        instance.insertar(new TNodoAlumnoAB(a8.getCodigo(), a8));
        instance.insertar(new TNodoAlumnoAB(a9.getCodigo(), a9));
        
        //
        
        TArbolBBU result1 = instance.armarIndiceCarrera("Arquitectura");
        
        assertEquals(null, result1.inOrden());
        assertEquals("Arbol vacio.", result1.postOrden());
        
        //
        
        TArbolBBU result2 = instance.armarIndiceCarrera("Ing. Informática");
        
        assertEquals("Abal-Alonso-Alpuy", result2.inOrden());
        assertEquals("Alpuy-Alonso-Abal", result2.postOrden());
    }
    
}
