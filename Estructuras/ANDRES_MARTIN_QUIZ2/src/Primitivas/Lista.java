/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

/**
 *
 * @author Andres
 */
public class Lista<T> {
    
    private NodoGeneral pFirst;
    private NodoGeneral pLast;
    private int size;

    public Lista() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }
    
    public boolean esVacio(){
        return (this.getpFirst() == null);
    }
    
    public void agregarNodo(NodoGeneral pNew){
        if (!this.esVacio()){
            this.getpLast().setpNext(pNew);
            this.setpLast(pNew);
        }else{
            this.setpFirst(pNew);
            this.setpLast(pNew);
            
        }
        this.setSize(this.getSize()+1);
    }

    /**
     * @return the pFirst
     */
    public NodoGeneral getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoGeneral pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoGeneral getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoGeneral pLast) {
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
