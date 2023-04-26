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
public class NodoApartamento {
    
    private String numeroApartamento;
    private NodoApartamento pNext;
    private String nombreEdificio;
    private ListaHabitantes habitantes;

    //Constructor vacio
    public NodoApartamento() {
    }
    
    //Constructor con apartamento
    public NodoApartamento(String numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }
    
    
    //GETTERS Y SETTERS

    /**
     * @return the numeroApartamento
     */
    public String getNumeroApartamento() {
        return numeroApartamento;
    }

    /**
     * @param numeroApartamento the numeroApartamento to set
     */
    public void setNumeroApartamento(String numeroApartamento) {
        this.numeroApartamento = numeroApartamento;
    }

    /**
     * @return the pNext
     */
    public NodoApartamento getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoApartamento pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the nombreEdificio
     */
    public String getNombreEdificio() {
        return nombreEdificio;
    }

    /**
     * @param nombreEdificio the nombreEdificio to set
     */
    public void setNombreEdificio(String nombreEdificio) {
        this.nombreEdificio = nombreEdificio;
    }

    /**
     * @return the habitantes
     */
    public ListaHabitantes getHabitantes() {
        return habitantes;
    }

    /**
     * @param habitantes the habitantes to set
     */
    public void setHabitantes(ListaHabitantes habitantes) {
        this.habitantes = habitantes;
    }


    
    
}
