/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCalculadora;

/**
 *
 * @author Andres
 */
public class Consola {
    private String numS;
    
    public Consola(String numS){
        this.numS=numS;
    }
    
    public void addDigit(String newDigit){
        this.numS += newDigit;
    }
    
}
