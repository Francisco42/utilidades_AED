/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parcial1.p2015;

/**
 *
 * @author Francisco
 */
public class Parcial1 {
    
    public static void main(String[] args) {
        ListaOrdenada<Object> lista1 = new ListaOrdenada<>();
        ListaOrdenada<Object> lista2 = new ListaOrdenada<>();
        
        lista1.insertar(new Nodo(2, null));
        lista1.insertar(new Nodo(1, null));
        lista1.insertar(new Nodo(4, null));
        
        lista1.insertar(new Nodo(2, null));
        lista2.insertar(new Nodo(4, null));
        lista2.insertar(new Nodo(5, null));
        lista2.insertar(new Nodo(3, null));
        
        ListaOrdenada<Object> listaMezclada = lista1.mezclar(lista2);
        
        System.out.println(listaMezclada.imprimir(","));
        
        listaMezclada.retirarDuplicados();
        
        System.out.println(listaMezclada.imprimir(","));
    }
}
