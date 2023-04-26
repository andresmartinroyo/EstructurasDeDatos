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
public class ListaApartamentos {

    private NodoApartamento pFirst;
    private NodoApartamento pLast;
    private int size;

    public ListaApartamentos() {
    }

    //Vacio
    public boolean esVacio() {
        return (this.getpFirst() == null);
    }

    //Agregar elemento
    public void agregarApartamento(NodoApartamento apartamento) {
        if (!this.esVacio()) {
            this.getpLast().setpNext(apartamento);
            this.setpLast(apartamento);
        } else {
            this.setpFirst(apartamento);
            this.setpLast(apartamento);
        }
        this.setSize(this.getSize() + 1);
    }

    /**
     * @return the pFirst
     */
    public NodoApartamento getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoApartamento pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoApartamento getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoApartamento pLast) {
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
