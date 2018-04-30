package parcial1;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ernesto
 * @param <T>
 */
public class ListaOrdenada<T> extends Lista<T> {

    @Override
    public void insertar(Nodo<T> unNodo) {
        Comparable nuevaEtiqueta = unNodo.getEtiqueta();
        Nodo<T> aux = primero;
        if (esVacia()) {
            primero = unNodo;
        } else if (aux.compareTo(nuevaEtiqueta) > 0) {
            unNodo.setSiguiente(primero);
            primero = unNodo;
        } else {
            Nodo<T> aux2 = aux.getSiguiente();
            while (aux2 != null) {
                if (aux.compareTo(nuevaEtiqueta) < 0 && aux2.compareTo(nuevaEtiqueta) > 0) {
                    aux.setSiguiente(unNodo);
                    unNodo.setSiguiente(aux2);
                }
                aux = aux2;
                aux2 = aux2.getSiguiente();
            }
            if (aux.compareTo(nuevaEtiqueta) < 0) {
                aux.setSiguiente(unNodo);
                unNodo.setSiguiente(null);
            }
        }
    }

}
