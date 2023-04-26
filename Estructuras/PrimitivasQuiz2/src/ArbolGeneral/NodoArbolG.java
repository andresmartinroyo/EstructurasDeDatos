/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolGeneral;

/**
 *
 * @author Andres
 */
public class NodoArbolG {
    private NodoArbolG hijo_izq;
    private NodoArbolG hermano_der;
    private NodoArbolG padre;
    private Object elemento;

    public NodoArbolG(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the hijo_izq
     */
    public NodoArbolG getHijo_izq() {
        return hijo_izq;
    }

    /**
     * @param hijo_izq the hijo_izq to set
     */
    public void setHijo_izq(NodoArbolG hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    /**
     * @return the hermano_der
     */
    public NodoArbolG getHermano_der() {
        return hermano_der;
    }

    /**
     * @param hermano_der the hermano_der to set
     */
    public void setHermano_der(NodoArbolG hermano_der) {
        this.hermano_der = hermano_der;
    }

    /**
     * @return the elemento
     */
    public Object getElemento() {
        return elemento;
    }

    /**
     * @param elemento the elemento to set
     */
    public void setElemento(Object elemento) {
        this.elemento = elemento;
    }

    /**
     * @return the padre
     */
    public NodoArbolG getPadre() {
        return padre;
    }

    /**
     * @param padre the padre to set
     */
    public void setPadre(NodoArbolG padre) {
        this.padre = padre;
    }
    
    
    
}
