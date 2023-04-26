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
public class NodoEdificio {
    private String nombre;
    private NodoEdificio pNext;
    private ListaApartamentos apartamentos;

    //Constructor vacio
    public NodoEdificio() {
    }

    //Constructor con nombre
    public NodoEdificio(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the pNext
     */
    public NodoEdificio getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoEdificio pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the apartamentos
     */
    public ListaApartamentos getApartamentos() {
        return apartamentos;
    }

    /**
     * @param apartamentos the apartamentos to set
     */
    public void setApartamentos(ListaApartamentos apartamentos) {
        this.apartamentos = apartamentos;
    }
    
    
}
