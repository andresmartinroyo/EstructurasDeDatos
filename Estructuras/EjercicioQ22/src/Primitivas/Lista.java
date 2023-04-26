/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Lista {
    
    private NodoLista pFirstArbol1;
    private NodoLista pLastArbol1;
    private NodoLista pFirstArbol2;
    private NodoLista pLastArbol2;
    private int sizeArbol1;
    private int sizeArbol2;

    public Lista() {
    }
    
    
    
    public void insertarArbol1(int dato){
        NodoLista pAux = new NodoLista(dato);
        if (this.getpFirstArbol1() == null){
            this.setpFirstArbol1(pAux);
            this.setpLastArbol1(pAux);
        }else{
            this.getpLastArbol1().setpNext(pAux);
            this.setpLastArbol1(pAux);
        }
        this.setSizeArbol1(this.getSizeArbol1()+1);
    }

    public void insertarArbol2(int dato){
        NodoLista pAux = new NodoLista(dato);
        if (this.getpFirstArbol2() == null){
            this.setpFirstArbol2(pAux);
            this.setpLastArbol2(pAux);
        }else{
            this.getpLastArbol2().setpNext(pAux);
            this.setpLastArbol2(pAux);
        }
        this.setSizeArbol2(this.getSizeArbol2()+1);
    }
    
    
    public void insertarEnInordenArbol1(NodoABB raiz){
        if (raiz.getLeft() != null){
            this.insertarEnInordenArbol1(raiz.getLeft());
        }
        this.insertarArbol1(raiz.getElement());
        if (raiz.getRight() != null){
            this.insertarEnInordenArbol1(raiz.getRight());
        }
    }
    
    public void insertarEnInordenArbol2(NodoABB raiz){
        if (raiz.getLeft() != null){
            this.insertarEnInordenArbol2(raiz.getLeft());
        }
        this.insertarArbol2(raiz.getElement());
        if (raiz.getRight() != null){
            this.insertarEnInordenArbol2(raiz.getRight());
        }
    }
    
    public String compararArboles(ABB arbol1,ABB arbol2){
        String texto = "";
        if (arbol1.getpRoot() == null || arbol2.getpRoot() == null){
            JOptionPane.showMessageDialog(null, "Alguno de los arboles esta vacío.");
        }else{
            this.insertarEnInordenArbol1(arbol1.getpRoot());
            this.insertarEnInordenArbol2(arbol2.getpRoot());
            int iteraciones = this.getSizeArbol1() + this.getSizeArbol2();
            NodoLista a1 = this.getpFirstArbol1();
            NodoLista a2 = this.getpFirstArbol2();
            for (int i = 0; i < iteraciones; i++) {
                if (a1.getDato() < a2.getDato()){
                    a1 = a1.getpNext();
                }else if (a1.getDato() > a2.getDato()){
                    a2 = a2.getpNext();
                }else{
                    texto += ", " + a1.getDato();
                    a1 = a1.getpNext();
                    a2 = a2.getpNext();
                }
                if (a1 == null || a2 == null){
                    break;
                }
            }
        }
        
        
        return texto;
    }
    
    
    
    /**
     * @return the pFirstArbol1
     */
    public NodoLista getpFirstArbol1() {
        return pFirstArbol1;
    }

    /**
     * @param pFirstArbol1 the pFirstArbol1 to set
     */
    public void setpFirstArbol1(NodoLista pFirstArbol1) {
        this.pFirstArbol1 = pFirstArbol1;
    }

    /**
     * @return the pFirstArbol2
     */
    public NodoLista getpFirstArbol2() {
        return pFirstArbol2;
    }

    /**
     * @param pFirstArbol2 the pFirstArbol2 to set
     */
    public void setpFirstArbol2(NodoLista pFirstArbol2) {
        this.pFirstArbol2 = pFirstArbol2;
    }

    /**
     * @return the sizeArbol1
     */
    public int getSizeArbol1() {
        return sizeArbol1;
    }

    /**
     * @param sizeArbol1 the sizeArbol1 to set
     */
    public void setSizeArbol1(int sizeArbol1) {
        this.sizeArbol1 = sizeArbol1;
    }

    /**
     * @return the sizeArbol2
     */
    public int getSizeArbol2() {
        return sizeArbol2;
    }

    /**
     * @param sizeArbol2 the sizeArbol2 to set
     */
    public void setSizeArbol2(int sizeArbol2) {
        this.sizeArbol2 = sizeArbol2;
    }

    /**
     * @return the pLastArbol2
     */
    public NodoLista getpLastArbol2() {
        return pLastArbol2;
    }

    /**
     * @param pLastArbol2 the pLastArbol2 to set
     */
    public void setpLastArbol2(NodoLista pLastArbol2) {
        this.pLastArbol2 = pLastArbol2;
    }

    /**
     * @return the pLastArbol1
     */
    public NodoLista getpLastArbol1() {
        return pLastArbol1;
    }

    /**
     * @param pLastArbol1 the pLastArbol1 to set
     */
    public void setpLastArbol1(NodoLista pLastArbol1) {
        this.pLastArbol1 = pLastArbol1;
    }
    
    
    
}
