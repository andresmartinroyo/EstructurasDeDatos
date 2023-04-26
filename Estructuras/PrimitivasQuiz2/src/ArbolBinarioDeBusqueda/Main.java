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
//        
//        System.out.println(arbol.inorden());
//        System.out.println(arbol.preorden());
//        arbol.eliminar(4);
//        System.out.println(arbol.inorden());
//        arbol.insertar(4);
//        
        arbol.eliminar(5);
        System.out.println(arbol.inorden());
        System.out.println(arbol.preorden());
//        arbol.insertar(5);
//        
//        arbol.eliminar(8);
//        System.out.println(arbol.inorden());
//        arbol.insertar(8);
//        
//        arbol.eliminar(14);
//        System.out.println(arbol.inorden());
//        
        
        System.out.println(arbol.buscarNodo(3).getElement());
        System.out.println(arbol.existe(3));
        System.out.println(arbol.existe(20));
        
        NodoABB nodoP3 = arbol.devolverPadre(8);
        
        NodoABB nodoP5 = arbol.devolverPadre(5);
        try{
            System.out.println(nodoP5.getElement());
        }catch (Exception e){
            
        }
        System.out.println(nodoP3.getElement());
        
        System.out.println(arbol.inorden());
        System.out.println(arbol.preorden());
        System.out.println("");
        System.out.println(arbol.buscarmca(2, 8).getElement());
        System.out.println(arbol.buscarmca(6, 8).getElement());
        System.out.println(arbol.buscarmca(4, 2).getElement());
        System.out.println(arbol.buscarmca(7, 6).getElement());
        System.out.println(arbol.buscarmca(5, 3).getElement());
        System.out.println(arbol.buscarmca(2, 2).getElement());
        try{                                                                    //<----Pilas con este try
        System.out.println(arbol.buscarmca(5, 5).getElement());
        }catch (Exception e){
            if (e.equals("java.lang.NullPointerException"));
            System.out.println("El nodo es es la raiz.");
        }        
        
    }
    
}
