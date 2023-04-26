/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinarioDeBusqueda;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABB arbol = new ABB();
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(4);
        arbol.insertar(2);
        arbol.insertar(7);
        arbol.insertar(6);
        arbol.insertar(8);
        
        System.out.println(arbol.inorden());
        System.out.println(arbol.preorden());
        System.out.println(arbol.buscarNodo(3).getElement());
        System.out.println(arbol.existe(3));
        System.out.println(arbol.existe(20));
        
        NodoABB nodoP = arbol.searchPadre(arbol.getpRoot(), 3);
    }
    
}
