/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;

/**
 *
 * @author Andres
 */
public class NodoPila<T> {
    
    public NodoPila pNext;
    public int dato;

    public NodoPila() {
    }

    public NodoPila(int dato) {
        this.dato = dato;
    }
    
    
}
