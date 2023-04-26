/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author Andres
 */
public class NodoArbolB {
    private NodoArbolB hijo_izq;
    private NodoArbolB hijo_derecho;
    private Object element;

    public NodoArbolB() {
    }

    public NodoArbolB(Object element) {
        this.element = element;
    }

    /**
     * @return the hijo_izq
     */
    public NodoArbolB getHijo_izq() {
        return hijo_izq;
    }

    /**
     * @param hijo_izq the hijo_izq to set
     */
    public void setHijo_izq(NodoArbolB hijo_izq) {
        this.hijo_izq = hijo_izq;
    }

    /**
     * @return the hijo_derecho
     */
    public NodoArbolB getHijo_derecho() {
        return hijo_derecho;
    }

    /**
     * @param hijo_derecho the hijo_derecho to set
     */
    public void setHijo_derecho(NodoArbolB hijo_derecho) {
        this.hijo_derecho = hijo_derecho;
    }

    /**
     * @return the element
     */
    public Object getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(Object element) {
        this.element = element;
    }
    
    
}
