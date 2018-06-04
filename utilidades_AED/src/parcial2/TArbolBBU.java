package parcial2;


import java.util.LinkedList;

public class TArbolBBU implements IArbolBBU {

    private  TNodoAlumnoAB raiz;

    /**
     * Separador utilizado entre elemento y elemento al imprimir la lista
     */
    public static final String SEPARADOR_ELEMENTOS_IMPRESOS = "-";

    public TArbolBBU() {
        raiz = null;
    }

   
    /**
     * @param unaEtiqueta
     * @return
     */
   
    @Override
    public TNodoAlumnoAB buscar(Comparable unaEtiqueta) {
        if (esVacio()) {
            return null;
        } else {
            return raiz.buscar(unaEtiqueta);
        }
    }

    /**
     * @return recorrida en inorden del arbol, null en caso de ser vacío
     */
    @Override
    public String inOrden() {
        if (esVacio()) {
            return null;
        } else {
            return raiz.inOrden();
        }
    }

    public boolean esVacio() {
        return (raiz == null);
    }

    @Override
    public LinkedList<Comparable> inorden() {
        LinkedList<Comparable> listaInorden = null;
        if (!esVacio()) {
            listaInorden = new LinkedList<>();
            raiz.inOrden(listaInorden);
        }
        return listaInorden;

    }

    /**
     *
     * @return
     */
    public TNodoAlumnoAB getraiz() {
        return this.raiz;
    }

    @Override
    public boolean insertar(TNodoAlumnoAB unElemento) {
        if (esVacio()) {
            raiz = unElemento;
            return true;
        } else {
            return raiz.insertar(unElemento);
        }
    }

    @Override
    public TArbolBBU armarIndiceCarrera(Comparable laCarrera) {
        TArbolBBU indiceCarrera = new TArbolBBU();
        if (raiz != null) {
            raiz.indizar(indiceCarrera, laCarrera);
        }
        return indiceCarrera;
    }
    
    public String preOrden() {
        if (raiz == null ) {
            return "Arbol vacio.";
        } else {
            return raiz.preOrden();
        }
    }
    
    public String postOrden() {
        if (raiz == null ) {
            return "Arbol vacio.";
        } else {
            return raiz.postOrden();
        }
    }

}
