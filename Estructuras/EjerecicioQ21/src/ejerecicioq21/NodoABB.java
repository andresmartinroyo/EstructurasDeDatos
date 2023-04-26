/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejerecicioq21;

/**
 *
 * @author Andres
 */
public class NodoABB {
    
    private NodoABB hijoI;
    private NodoABB hijoD;
    private int dato;

    public NodoABB() {
    }

    public NodoABB(int dato) {
        this.dato = dato;
    }

    /**
     * @return the hijoI
     */
    public NodoABB getHijoI() {
        return hijoI;
    }

    /**
     * @param hijoI the hijoI to set
     */
    public void setHijoI(NodoABB hijoI) {
        this.hijoI = hijoI;
    }

    /**
     * @return the hijoD
     */
    public NodoABB getHijoD() {
        return hijoD;
    }

    /**
     * @param hijoD the hijoD to set
     */
    public void setHijoD(NodoABB hijoD) {
        this.hijoD = hijoD;
    }

    /**
     * @return the dato
     */
    public int getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(int dato) {
        this.dato = dato;
    }
    
    
    
}
