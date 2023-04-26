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
public class NodoVecino {
    
    private String nombre;
    private int cedula;
    private String telefono;
    private NodoApartamento apartamento;
    private NodoVecino pNextVecino;
    private NodoVecino pNextHabitante;

    //Constructor vacio
    public NodoVecino() {
    }
    
    //Constructor con: nombre, cedula, telefono
    public NodoVecino(String nombre, int cedula, String telefono) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.telefono = telefono;
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
     * @return the cedula
     */
    public int getCedula() {
        return cedula;
    }

    /**
     * @param cedula the cedula to set
     */
    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    /**
     * @return the telefono
     */
    public String getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the apartamento
     */
    public NodoApartamento getApartamento() {
        return apartamento;
    }

    /**
     * @param apartamento the apartamento to set
     */
    public void setApartamento(NodoApartamento apartamento) {
        this.apartamento = apartamento;
    }

    /**
     * @return the pNextVecino
     */
    public NodoVecino getpNextVecino() {
        return pNextVecino;
    }

    /**
     * @param pNextVecino the pNextVecino to set
     */
    public void setpNextVecino(NodoVecino pNextVecino) {
        this.pNextVecino = pNextVecino;
    }

    /**
     * @return the pNextHabitante
     */
    public NodoVecino getpNextHabitante() {
        return pNextHabitante;
    }

    /**
     * @param pNextHabitante the pNextHabitante to set
     */
    public void setpNextHabitante(NodoVecino pNextHabitante) {
        this.pNextHabitante = pNextHabitante;
    }
    
    
    
    
}
