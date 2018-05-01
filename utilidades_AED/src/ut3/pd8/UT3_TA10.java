/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd8;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author usuario
 */
public class UT3_TA10 {
    
    public static void main(String[] args) {
        
        //parte 1
        
        ArrayList<Sucursal> listaSucursales1 = new ArrayList<>();
        
        String[] lineasArchivo1 = ManejadorArchivosGenerico.leerArchivo("suc1.txt");
        for (String linea : lineasArchivo1) {
            listaSucursales1.add(new Sucursal(linea));
        }

        for(Sucursal sucursal: listaSucursales1) {
    	    System.out.println(sucursal.getNombreCiudad());
        }
        System.out.println(listaSucursales1.size());
        
        System.out.println("");
        
        //parte 2
        
        listaSucursales1.remove(buscar(listaSucursales1, "Chicago"));
        
        imprimir(listaSucursales1, "");
        System.out.println(listaSucursales1.size());
        
        System.out.println("");
        
        //parte 3
        
        ArrayList<Sucursal> listaSucursales3 = new ArrayList<>();
        
        String[] lineasArchivo3 = ManejadorArchivosGenerico.leerArchivo("suc2.txt");
        for (String linea : lineasArchivo3) {
            listaSucursales3.add(new Sucursal(linea));
        }
        
        listaSucursales3.remove(buscar(listaSucursales3, "Shenzen"));
        listaSucursales3.remove(buscar(listaSucursales3, "Tokio"));

        for(Sucursal sucursal: listaSucursales3) {
    	    System.out.println(sucursal.getNombreCiudad());
        }
        System.out.println(listaSucursales3.size());
        
        System.out.println("");
        
        //parte 4
        
        ArrayList<Sucursal> listaSucursales4 = new ArrayList<>();
        
        String[] lineasArchivo4 = ManejadorArchivosGenerico.leerArchivo("suc3.txt");
        for (String linea : lineasArchivo4) {
            listaSucursales4.add(new Sucursal(linea));
        }
        imprimir (listaSucursales4, ";_");
    }
    
    public static void imprimir(ArrayList<Sucursal> lista, String separador) {
        for(Sucursal sucursal: lista) {
    	    System.out.println(sucursal.getNombreCiudad() + separador);
        }
    }
    
    public static Sucursal buscar(ArrayList<Sucursal> lista, String ciudad) {
        for (Sucursal sucursal: lista) {
    	    if (sucursal.getNombreCiudad().equals(ciudad)) {
                return sucursal;
            }
        }
        return null;
       
        
    }
    
          
      
           
        
    
}
