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
public class NodoGeneral<T> {
    
    private T dato;
    private NodoGeneral pNext;

    public NodoGeneral() {
    }

    
    
    public NodoGeneral(T dato) {
        this.dato = dato;
        this.pNext = null;
    }

    /**
     * @return the dato
     */
    public T getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(T dato) {
        this.dato = dato;
    }

    /**
     * @return the pNext
     */
    public NodoGeneral getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoGeneral pNext) {
        this.pNext = pNext;
    }
    
    
    
    
    
    
}
