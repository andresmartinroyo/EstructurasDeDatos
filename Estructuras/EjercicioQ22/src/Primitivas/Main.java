/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ABB arbol1 = new ABB();
        ABB arbol2 = new ABB();
        
        arbol1.insertar(7);
        arbol1.insertar(8);
        arbol1.insertar(6);
        arbol1.insertar(3);
        arbol1.insertar(31);
        arbol1.insertar(16);
        arbol1.insertar(21);
        arbol1.insertar(52);
        arbol1.insertar(5);
        arbol1.insertar(1);
        arbol1.insertar(2);
        
        arbol2.insertar(7);
        arbol2.insertar(8);
        arbol2.insertar(80);
        arbol2.insertar(6);
        arbol2.insertar(15);
        
        int altura1 = arbol1.medirArbol();
        int altura2 = arbol2.medirArbol();
        System.out.println(altura2);
        System.out.println(altura1);
        
        Lista lista = new Lista();
        
        String texto = lista.compararArboles(arbol1, arbol2);
        
        System.out.println(texto);
        
    }
    
}
