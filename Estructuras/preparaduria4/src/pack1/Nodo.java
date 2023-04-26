/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author Andres
 */
public class Nodo {

    
    private String nombre;
    private String cedula;
    private Nodo pNext;

    public Nodo(String nombre, String cedula, Nodo pNext) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.pNext = pNext;
    }
    
    public Nodo(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.pNext = null;
    }

    /**
     * @return the data
     */
    public Object getNombre() {
        return nombre;
    }

    /**
     * @param nombre the data to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
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

    /**
     * @return the cedula
     */
    public String getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }
    
    
    
}
