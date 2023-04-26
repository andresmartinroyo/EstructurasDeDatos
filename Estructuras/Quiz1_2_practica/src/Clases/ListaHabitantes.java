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
public class ListaHabitantes {
    
    private NodoVecino pFirst;
    private NodoVecino pLast;
    private int size;

    public ListaHabitantes() {
    }
    
    //Vacio
    public boolean esVacio(){
        return (this.getpFirst()==null);
    }
    
    //Agregar elemento
    public void agregarHabitante(NodoVecino vecino){
        if (!this.esVacio()){
            this.getpLast().setpNextHabitante(vecino);
            this.setpLast(vecino);
        }else{
            this.setpFirst(vecino);
            this.setpLast(vecino);
        }
        this.setSize(this.getSize()+1);
    }
    
    
    

    /**
     * @return the pFirst
     */
    public NodoVecino getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoVecino pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoVecino getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoVecino pLast) {
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
