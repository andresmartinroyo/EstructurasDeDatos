/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGeneral;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolG arbolito = new ArbolG();
        NodoArbolG n1 = new NodoArbolG("A");
        arbolito.insertar(null, n1);
        NodoArbolG n2 = new NodoArbolG("B");
        arbolito.insertar(n1, n2);
        NodoArbolG n3 = new NodoArbolG("C");
        arbolito.insertar(n1, n3);
        NodoArbolG n4 = new NodoArbolG("D");
        arbolito.insertar(n1, n4);
        NodoArbolG n5 = new NodoArbolG("E");
        arbolito.insertar(n2, n5);
        NodoArbolG n6 = new NodoArbolG("F");
        arbolito.insertar(n2, n6);
        NodoArbolG n7 = new NodoArbolG("G");
        arbolito.insertar(n2, n7);
        NodoArbolG n8 = new NodoArbolG("H");
        arbolito.insertar(n4, n8);
        NodoArbolG n9 = new NodoArbolG("I");
        arbolito.insertar(n4, n9);
        NodoArbolG n10 = new NodoArbolG("J");
        arbolito.insertar(n8, n10);
        NodoArbolG n11 = new NodoArbolG("K");
        arbolito.insertar(n8, n11);
        NodoArbolG n12= new NodoArbolG("L");
        arbolito.insertar(n8, n12);
        
        System.out.println("Preorden:");
        arbolito.imprimirPreorden();
        System.out.println("Postorden:");
        arbolito.imprimirPostorden();
        System.out.println("Inorden:");
        arbolito.imprimirInorden();
        System.out.println(arbolito.buscar("M"));
        System.out.println(arbolito.buscar("A"));
        System.out.println(arbolito.buscar("L"));
        
        
    }
    
}
