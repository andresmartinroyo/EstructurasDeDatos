/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

/**
 *
 * @author Andres
 */
public class NodoDoble {
    
    public NodoDoble pPrev;
    public NodoDoble pNext;
    public int data;
    
    public NodoDoble(int element){
        this.pNext = null;
        this.pPrev = null;
        this.data = element;
    }
    
    
}
