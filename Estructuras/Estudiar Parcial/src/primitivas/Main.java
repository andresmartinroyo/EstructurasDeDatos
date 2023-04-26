/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

//        Pilas pila = new Pilas();
//        pila.apilar(1);
//        pila.apilar(2);
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(5);
//        pila.apilar(6);
//        pila.imprimirPila();
//        Pilas copia = new Pilas();
//        Pilas p3 = new Pilas();
//        copia.copiar(pila);
//        pila.invertir();
//        pila.imprimirPila();
//        copia.eliminarUnelemento(1);
//        copia.eliminarUnelemento(2);
//        copia.imprimirPila();
//        System.out.println(pila.obtenerMinimo(pila.pCima.dato));
//        int dato = copia.obtenerMinimo(copia.pCima.dato);
//        System.out.println(dato);
//        pila.ordenarPilaAsc();
//        copia.ordenarPilaAsc();
//        pila.imprimirPila();
//        copia.imprimirPila();
//        System.out.println(copia);
//        pila.ordenarPilaDesc();
//        pila.imprimirPila();
//        p3.sumarPilas(pila, copia, 0);
//        p3.imprimirPila();
//        pila.apilar(1);
//        pila.apilar(2);
//        pila.apilar(3);
//        pila.apilar(4);
//        pila.apilar(5);
//        pila.apilar(6);
//        pila.ordenarPilaAsc();
//        p3.ordenarPilaDesc();
//        pila.imprimirPila();
//        p3.imprimirPila();
//        copia.ordernarPilaNueva(pila, p3);
//        copia.imprimirPila();
//        Pilas.eliminarMedio(copia,0, copia.size);
//        copia.imprimirPila();
//        System.out.println(13/2);
//        Cola cola = new Cola();
//        cola.encolar(1);
//        cola.encolar(2);
//        cola.encolar(3);
//        cola.encolar(4);
//        cola.encolar(5);
//        cola.encolar(6);
//        cola.encolar(7);
//        cola.encolar(8);
//        cola.encolar(9);
//        cola.imprimir();
//        cola.imprimir();
//        cola.invertir();
//        cola.imprimir();
//        cola.imprimir();
//        System.out.println(cola.buscar(10));
//        System.out.println(cola.buscar(9));
//        cola.imprimir();
        ListaDoble lista = new ListaDoble();
        lista.insertarAlInicio(0);
        lista.insertarAlInicio(1);
        lista.insertarAlInicio(2);
        lista.insertarAlInicio(24);
        lista.insertarAlInicio(65);
        lista.insertarAlInicio(46);
        lista.insertarAlInicio(45);
        lista.insertarAlInicio(32);
        lista.imprimirLista();
        lista.eliminarUnElemento(0);
        lista.imprimirLista();
        System.out.println("");
        lista.eliminarUnElemento(31);
        lista.eliminarUnElemento(32);
        lista.eliminarUnElemento(0);
        lista.imprimirLista();
        System.out.println("");
        lista.ordenarListaDoble();
        lista.imprimirLista();
    }

}
