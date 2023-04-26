/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Andres
 */
public class Nodo {
    
    private Nodo siguiente;
    private Cancion cancion;

    public Nodo(Cancion cancion) {
        this.cancion = cancion;
        this.siguiente = null;
    }
    
    public Nodo(Cancion cancion, Nodo siguiente) {
        this.cancion = cancion;
        this.siguiente = siguiente;
    }
    
    public Nodo() {
        this.cancion = null;
        this.siguiente = null;
    }

    /**
     * @return the siguiente
     */
    public Nodo getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the cancion
     */
    public Cancion getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }
    
    
}
