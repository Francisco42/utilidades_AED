package ut3.pd11;


public class Lista<T> implements ILista<T> {

    protected Nodo<T> primero;

    public Lista() {
        primero = null;
    }

    public Lista(Nodo<T> unNodo) {
        this.primero = unNodo;
    }

    @Override
    public void insertar(Nodo<T> unNodo) {
        if (esVacia()) {
            setPrimero(unNodo);
        } else {
            Nodo<T> aux = getPrimero();
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(unNodo);
        }
    }

    @Override
    public Nodo<T> buscar(Comparable clave) {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = getPrimero();
            while (aux != null) {
                if (aux.getEtiqueta().equals(clave)) {
                    return aux;
                }
                aux = aux.getSiguiente();
            }
        }
        return null;
    }
    
    /**
     * Busca el nodo con la "menor" etiqueta de la lista.
     * 
     * @return El nodo con la menor etiqueta.
     */
    public Nodo<T> buscarMenor() {
        Nodo<T> nodo1 = primero;
        Nodo<T> nodo2 = primero.getSiguiente();
        while (nodo2 != null) {
            if (nodo1.compareTo(nodo2.getEtiqueta()) > 0) {
                nodo1 = nodo2;
            }
            nodo2 = nodo2.getSiguiente();
        }
        return nodo1;
    }
        
    public Lista<T> ordenaParesImpares() {
        Lista<T> nuevaLista = new Lista<>();
        Lista<T> listaPares = new Lista<>();
        while (!esVacia()) {
            Nodo<T> aux = quitar(buscarMenor().getEtiqueta());
            if (((int)aux.getEtiqueta() % 2) == 1) {
                nuevaLista.insertar(aux);
            } else {
                listaPares.insertar(aux);
            }
        }
        nuevaLista.insertar(listaPares.getPrimero());
        return nuevaLista;
    }

    /**
     * Remueve un nodo de la lista para su posterior utilizacion.
     * 
     * @param clave - La etiqueta del nodo a quitar.
     * @return El nodo quitado.
     */
    public Nodo<T> quitar(Comparable clave){
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = primero;
            if (primero.getEtiqueta().equals(clave)) {
                primero = aux.getSiguiente();
                aux.setSiguiente(null);
                return aux;
            } else {
                Nodo<T> aux2 = aux.getSiguiente();
                while (aux2 != null) {
                    if (aux2.getEtiqueta().equals(clave)) {
                        aux.setSiguiente(aux2.getSiguiente());
                        aux2.setSiguiente(null);
                        return aux2;
                    }
                    aux = aux2;
                    aux2 = aux2.getSiguiente();
                }           
            }
        }
        return null;
    }

    @Override
    public int cantElementos() {
        int contador = 0;
        if (esVacia()) {
            System.out.println("Cantidad de elementos 0.");
            return 0;
        } else {
            Nodo aux = getPrimero();
            while (aux != null) {
                contador++;
                aux = aux.getSiguiente();
            }
        }
        return contador;
    }

    @Override
    public boolean esVacia() {
        return getPrimero() == null;
    }

    @Override
    public Nodo<T> getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo<T> primero) {
        this.primero = primero;
    }

    @Override
    public boolean eliminar(Comparable clave) {
        if (esVacia()) {
            return false;
        }
        if (primero.getSiguiente() == null) {
            if (primero.getEtiqueta().equals(clave)) {
                primero = null;
                return true;
            }
        }
        Nodo<T> aux = primero;
        if (aux.getEtiqueta().compareTo(clave) == 0) {
            //Eliminamos el primer elemento
            Nodo<T> temp1 = aux;
            Nodo<T> temp = aux.getSiguiente();
            primero = temp;
            return true;
        }
        while (aux.getSiguiente() != null) {
            if (aux.getSiguiente().getEtiqueta().equals(clave)) {
                Nodo<T> temp = aux.getSiguiente();
                aux.setSiguiente(temp.getSiguiente());
                return true;

            }
            aux = aux.getSiguiente();
        }
        return false;
    }

    @Override
    public String imprimir() {
        String aux = "";
        if (!esVacia()) {
            Nodo<T> temp = getPrimero();
            while (temp != null) {
                temp.imprimirEtiqueta();
                aux += temp.getEtiqueta() + " ";
                temp = temp.getSiguiente();
            }
        }
        return aux;
    }

    @Override
    public String imprimir(String separador) {
        String aux;
        if (esVacia()) {
            return "";
        } else {
            Nodo<T> temp = getPrimero();
            aux = "" + temp.getEtiqueta();
            while (temp.getSiguiente() != null) {
                aux = aux + separador + temp.getSiguiente().getEtiqueta();
                temp = temp.getSiguiente();
            }

        }
        return aux;

    }

    @Override
    public Nodo<T> quitarPrimero() {
        if (esVacia()) {
            return null;
        } else {
            Nodo<T> aux = primero;
            primero = primero.getSiguiente();
            aux.setSiguiente(null);
            return aux;
        }
    }

}
