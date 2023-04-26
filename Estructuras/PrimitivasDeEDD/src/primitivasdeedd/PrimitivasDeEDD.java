/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivasdeedd;

/**
 *
 * @author Andres
 */
public class PrimitivasDeEDD {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Pila<Integer> pilaPrueba = new Pila<>();
        Pila<Integer> pilaCopia = new Pila<>();
        pilaPrueba.apilar(15);
        pilaPrueba.apilar(16);
        pilaPrueba.apilar(17);
        pilaPrueba.apilar(18);
        pilaPrueba.apilar(19);
        pilaPrueba.apilar(20);
        pilaPrueba.imprimir();
        pilaCopia = pilaPrueba.invertirPila();
        pilaCopia.imprimir();
    }
    
}
