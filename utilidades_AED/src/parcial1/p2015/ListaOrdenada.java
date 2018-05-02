package parcial1.p2015;

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
        } else if (aux.compareTo(nuevaEtiqueta) >= 0) {
            unNodo.setSiguiente(primero);
            primero = unNodo;
        } else {
            Nodo<T> aux2 = aux.getSiguiente();
            while (aux2 != null) {
                if (aux.compareTo(nuevaEtiqueta) < 0 && aux2.compareTo(nuevaEtiqueta) >= 0) {
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
    
    public ListaOrdenada<T> mezclar(ListaOrdenada<T> otraLista) {
        ListaOrdenada<T> nuevaLista = new ListaOrdenada<>();
        while (!esVacia()) {
            nuevaLista.insertar(quitarPrimero());
        }
        while (!otraLista.esVacia()) {
            nuevaLista.insertar(otraLista.quitarPrimero());
        }
        return nuevaLista;
    }
    
    public void retirarDuplicados() {
        Nodo<T> aux1 = primero;
        while (aux1 != null) {
            Nodo<T> aux2 = aux1.getSiguiente();
            while (aux2 != null) {
                if (aux1.getEtiqueta().equals(aux2.getEtiqueta())) {
                    Nodo<T> aEliminar = aux2;
                    aux2 = aux2.getSiguiente();
                    eliminar(aEliminar.getEtiqueta());
                } else {
                    aux2 = aux2.getSiguiente();
                }
            }
            aux1 = aux1.getSiguiente();
        }
    }
}
