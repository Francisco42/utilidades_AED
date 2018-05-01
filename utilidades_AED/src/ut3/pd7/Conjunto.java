/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd7;

/**
 *
 * @author usuario
 * @param <E>
 */
public class Conjunto<E> extends Lista<E> implements IConjunto<E> {

    @Override
    public IConjunto<E> union(IConjunto<E> otroConjunto) {
        IConjunto<E> conjuntoUnion = new Conjunto<>();
        for (INodo<E> aux = primero; aux != null; aux = aux.getSiguiente()) {
            conjuntoUnion.insertar(aux.clonar());
        }
        for (INodo<E> aux2 = otroConjunto.getPrimero(); aux2 != null; aux2 = aux2.getSiguiente()) {
            if (conjuntoUnion.buscar(aux2.getEtiqueta()) == null) {
                conjuntoUnion.insertar(aux2.clonar());
            }
        }
        return conjuntoUnion;
    }

    @Override
    public IConjunto<E> interseccion(IConjunto<E> otroConjunto) {
        IConjunto<E> conjuntoInterseccion = new Conjunto<>();
        for (INodo<E> aux = primero; aux != null; aux = aux.getSiguiente()) {
            if (otroConjunto.buscar(aux.getEtiqueta()) != null) {
                conjuntoInterseccion.insertar(aux.clonar());
            }
        }
        return conjuntoInterseccion;
    }
    
}
