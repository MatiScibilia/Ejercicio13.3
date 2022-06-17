package arbolBinario;


public class ArbolBinario {
    protected Nodo raiz;

    public ArbolBinario() {
        raiz = null;
    }

    public ArbolBinario(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getRaiz() {
        return this.raiz;
    }

    public boolean estaVacio() {
        return raiz == null;
    }

    public static Nodo nuevoArbol(Nodo ramaIzquierda, Object tipoObjeto, Nodo ramaDerecha) {
        return new Nodo(ramaIzquierda, tipoObjeto, ramaDerecha);
    }

    public static void preorden(Nodo x) {
        if (x != null) {
            x.visitar();
            preorden(x.getIzquierdo());
            preorden(x.getDerecho());
        }
    }

    public static void enorden(Nodo x) {
        if (x != null) {
            enorden(x.getIzquierdo());
            x.visitar();
            enorden(x.getDerecho());
        }
    }

    public static void postorden(Nodo x) {
        if (x != null) {
            postorden(x.getIzquierdo());
            postorden(x.getDerecho());
            x.visitar();
        }
    }
}

