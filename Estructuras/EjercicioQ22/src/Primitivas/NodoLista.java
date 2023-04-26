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
public class NodoLista {
    
    private NodoLista pNext;
    private int dato;

    public NodoLista(int dato) {
        this.dato = dato;
    }
    
    /**
     * @return the pNext
     */
    public NodoLista getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoLista pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
}
