package arbolBinario;

import java.io.IOException;

public class App {
    public static void main(String[] args) throws Exception { 

    ArbolBinario arrrrbollll = new ArbolBinario() ;
    Nodo a1, a2, a;
    PilaVector pila = new PilaVector();
   
   
    a1 = ArbolBinario.nuevoArbol(null, new gato("Matii", "Clau"), null);
    a2 = ArbolBinario.nuevoArbol(null, new gato("Tomi", "Clau"), null);
    a = ArbolBinario.nuevoArbol(a1, new gato("Popi", "Juan"), a2);
    pila.insertar(a);

    a1 = ArbolBinario.nuevoArbol(null, new gato("Laura", "Amber"), null);
    a2 = ArbolBinario.nuevoArbol(null, new gato("Eneas", "Amber"), null);
    a = ArbolBinario.nuevoArbol(a1, new gato ("Joel", "Graciela"), a2);
    pila.insertar(a);

    a2 = (Nodo) pila.quitar();
    a1 = (Nodo) pila.quitar();
    a = ArbolBinario.nuevoArbol(a1,new gato("Nico", "Carlito"), a2);
    arrrrbollll = new ArbolBinario(a);

    System.out.println("");
    System.out.println("Recorrido en preorden:");
    System.out.println("\t");
    ArbolBinario.preorden(a);


    System.out.println("");
    System.out.println("Recorrido en orden:");
    System.out.println("\t");
    ArbolBinario.enorden(a);


    System.out.println("");
    System.out.println("Recorrido en posorden:");
    System.out.println("\t");
    ArbolBinario.postorden(a);
}
}
