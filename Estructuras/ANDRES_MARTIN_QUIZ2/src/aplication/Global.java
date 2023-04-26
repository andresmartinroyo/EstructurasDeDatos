/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import Primitivas.ABB;
import Primitivas.Lista;
import Primitivas.NodoGeneral;

/**
 *
 * @author Andres
 */
public class Global {

    public static ABB mezcla;
    public static Lista bosque;
    public static Lista valoresRechazados;
    public static PaginaPrincipal window;

    public static void agregarArbol(NodoGeneral arbol) {
        if (!bosque.esVacio()) {
            bosque.getpLast().setpNext(arbol);
            bosque.setpLast(arbol);
        } else {
            bosque.setpFirst(arbol);
            bosque.setpLast(arbol);

        }
        bosque.setSize(bosque.getSize() + 1);
    }
    
    public static void mezclarBosque(){
        NodoGeneral<ABB> arbolAux = bosque.getpFirst();
        for (int i = 0; i < bosque.getSize(); i++) {
            mezcla.merge(arbolAux.getDato(),i+1);
            arbolAux = arbolAux.getpNext();
        }
    }

    
    public static void inicializar(){
        valoresRechazados = new Lista();
        bosque = new Lista();
        mezcla = new ABB();
        window = new PaginaPrincipal();
    }
}
