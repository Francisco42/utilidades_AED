/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ut3.pd9;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 *
 * @author Francisco
 */
public class Expresion {
    
    public boolean controlCorchetes(String listaEntrada) {
        Stack<Object> pila = new Stack<>();
        for (int i = 0; i < listaEntrada.length(); i++) {
            if (listaEntrada.charAt(i) == '{') {
                pila.push(new Object());
            } else if (listaEntrada.charAt(i) == '}'){
                try {
                    pila.pop();
                } catch (EmptyStackException ex) {
                    return false;
                } 
            }
        }
        return pila.empty();
    }
}
