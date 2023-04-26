/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12Libro;

/**
 *
 * @author Andres
 */
public class Nodo {
    
    private Cliente data;
    private Nodo pNext;
    
    
    //Insertar inicio
    
    public Nodo(Cliente data, Nodo siguiente) {
        this.data = data;
        this.pNext = siguiente;
    }

    // Insertar finall
    
    public Nodo(Cliente data) {
        this.data = data;
        this.pNext = null;
        
    }
    /**
     * @return the data
     */
    public Cliente getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(Cliente data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Nodo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo pNext) {
        this.pNext = pNext;
    }
    
    
    
}
