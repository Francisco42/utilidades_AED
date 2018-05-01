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
public interface IConjunto<E> extends ILista<E> {
    
    public IConjunto<E> union(IConjunto<E> otroConjunto);
    
    public IConjunto<E> interseccion(IConjunto<E> otroConjunto);
}
