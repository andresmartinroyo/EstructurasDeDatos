/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinarioDeBusqueda;

/**
 *
 * @author Andres
 */
public class NodoABB {
    
    private NodoABB left;
    private NodoABB right;
    private int element;

    public NodoABB() {
    }

    public NodoABB(int element) {
        this.element = element;
    }

    /**
     * @return the left
     */
    public NodoABB getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(NodoABB left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public NodoABB getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(NodoABB right) {
        this.right = right;
    }

    /**
     * @return the element
     */
    public int getElement() {
        return element;
    }

    /**
     * @param element the element to set
     */
    public void setElement(int element) {
        this.element = element;
    }
    
    
    
}
