/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparaduria2;

/**
 *
 * @author Andres
 */
public class Nodo {
    
    private int dato;
    private Nodo siguiente;

        
    // Insertar inicio
    public Nodo(int dato, Nodo siguiente) {
        this.dato = dato;
        this.siguiente = siguiente;
        
    }
    
    // Insertar datos por el último
    public Nodo(int dato){
        this.dato = dato;
        this.siguiente = null;
        
        
    }

    /**
     * @return the data
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato
     */
    public void setDato(int dato) {
        this.dato = dato;
    }

    /**
     * @return the pNext
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param pnext the pNext to set
     */
    public void setSiguiente(Nodo pnext) {
        this.siguiente = pnext;
    }
    
}
