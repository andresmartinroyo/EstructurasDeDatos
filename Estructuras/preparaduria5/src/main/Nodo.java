/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Andres
 * @param <T>
 */
public class Nodo<T> {
    private T data;
    private int next;
//    private int previous;
    
    public Nodo(T data){
        this.next = -1;
        this.data = data;
//        this.next = this.previous = -1;
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
     * @return the next
     */
    public int getNext() {
        return next;
    }

    /**
     * @param next the next to set
     */
    public void setNext(int next) {
        this.next = next;
    }

    /**
     * @return the previous
     */
//    public int getPrevious() {
//        return previous;
//    }
//
//    /**
//     * @param previous the previous to set
//     */
//    public void setPrevious(int previous) {
//        this.previous = previous;
//    }
//    
}
