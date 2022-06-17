package arbolBinario;

public class Nodo{
    protected Object objeto;
    protected Nodo izquierdo;
    protected Nodo derecho;

    public Nodo(Object tipoObjeto){
        this.objeto = objeto;
        izquierdo = derecho = null;
    }

    public Nodo(Nodo ramaIzquierda, Object objeto, Nodo ramaDerecha){
        this.objeto = objeto;
        this.izquierdo = ramaIzquierda;
        this.derecho = ramaDerecha;
    }

    public Nodo getIzquierdo() {
        return this.izquierdo;
    }

    public void setIzquierdo(Nodo izquierdo) {
        this.izquierdo = izquierdo;
    }

    public Nodo getDerecho() {
        return this.derecho;
    }

    public void setDerecho(Nodo derecho) {
        this.derecho = derecho;
    }

    public void visitar(){        
        System.out.println(objeto.toString());
    }

}