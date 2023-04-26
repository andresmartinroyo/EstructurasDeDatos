/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abbarreglos;

/**
 *
 * @author Andres
 */
public class NodoABB {
    
    private int left;
    private int right;
    private int data;

    public NodoABB(int data) {
        this.data = data;
        this.left = -1;
        this.right = -1;
    }
    
    

    /**
     * @return the left
     */
    public int getLeft() {
        return left;
    }

    /**
     * @param left the left to set
     */
    public void setLeft(int left) {
        this.left = left;
    }

    /**
     * @return the right
     */
    public int getRight() {
        return right;
    }

    /**
     * @param right the right to set
     */
    public void setRight(int right) {
        this.right = right;
    }

    /**
     * @return the data
     */
    public int getData() {
        return data;
    }

    /**
     * @param data the data to set
     */
    public void setData(int data) {
        this.data = data;
    }
    
    
    
}
