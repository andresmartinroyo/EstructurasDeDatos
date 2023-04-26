/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Andres
 */
public class ListaEdificios {
    
    private NodoEdificio pFirst;
    private NodoEdificio pLast;
    private int size;
    
    public ListaEdificios() {
    }

    //Vacio
    public boolean esVacio() {
        return (this.getpFirst() == null);
    }

    //Agregar elemento
    public void agregarEdificio(NodoEdificio edificio) {
        if (!this.esVacio()) {
            this.getpLast().setpNext(edificio);
            this.setpLast(edificio);
        } else {
            this.setpFirst(edificio);
            this.setpLast(edificio);
        }
        this.setSize(this.getSize() + 1);
    }

    /**
     * @return the pFirst
     */
    public NodoEdificio getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoEdificio pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoEdificio getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoEdificio pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }
    
}
