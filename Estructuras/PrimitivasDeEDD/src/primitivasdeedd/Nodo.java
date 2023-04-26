/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivasdeedd;

/**
 *
 * @author Andres
 * @param <T>
 */
public class Nodo<T> {
    
    private T data;
    private Nodo<T> pNext;
    private Nodo<T> pPrev;
    
    
    //Nodo vacío
    public Nodo(){
    this.data = null;
    this.pNext = null;
    this.pPrev = null;
    }
    
    
    //Nodo con la data
    public Nodo(T data) {
        this.data = data;
    }
    
    //Nodo con la data y pNext
    public Nodo(T data, Nodo<T> pNext) {
        this.data = data;
        this.pNext = pNext;
    }

    //Nodo con la data, pNext y pPrev
    public Nodo(T data, Nodo<T> pNext, Nodo<T> pPrev) {
        this.data = data;
        this.pNext = pNext;
        this.pPrev = pPrev;
    }

    /**
     * @return the data
     */
    public T getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(T data) {
        this.data = data;
    }

    /**
     * @return the pNext
     */
    public Nodo<T> getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(Nodo<T> pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pPrev
     */
    public Nodo<T> getpPrev() {
        return pPrev;
    }

    /**
     * @param pPrev the pPrev to set
     */
    public void setpPrev(Nodo<T> pPrev) {
        this.pPrev = pPrev;
    }
    
    
    
    
    
}
