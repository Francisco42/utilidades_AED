/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd8;
import java.util.*;
import java.util.ArrayList;

/**
 *
 * @author fran_
 */
public class Sucursal {
   
    private Comparable nombreCiudad;

    public Sucursal(String ciudad) {
        this.nombreCiudad = ciudad;
    }

    public Comparable getNombreCiudad() {
        return nombreCiudad;
    }
    
     public void imprimir()
        {
          
            System.out.print(this.getNombreCiudad()+";_");
          
            
        }
    
    
    
}
