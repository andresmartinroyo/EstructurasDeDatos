/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Primitivas;

import aplication.Global;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ABB {
    
    private NodoABB pRoot;
    
    public ABB() {
    }

    /*
    Es vacio
     */
    public boolean esVacio() {
        return this.getpRoot() == null;
    }

    /*
    Recorrer arbol preorden
     */
    public String preorden() {
        return this.preorden(this.pRoot, "");
    }
    
    public String preorden(NodoABB raiz, String ruta) {
        ruta += raiz.getElement() + "(" + raiz.getProcedencia() + ")" + ",";
        if (raiz.getLeft() != null) {
            ruta = preorden(raiz.getLeft(), ruta);
        }
        if (raiz.getRight() != null) {
            ruta = preorden(raiz.getRight(), ruta);
        }
        return ruta;
    }

    /*
    Recorrer arbol postorden
     */
    public String postorden() {
        return this.postorden(this.pRoot, "");
    }
    
    public String postorden(NodoABB raiz, String ruta) {
        if (raiz.getLeft() != null) {
            ruta = postorden(raiz.getLeft(), ruta);
        }
        if (raiz.getRight() != null) {
            ruta = postorden(raiz.getRight(), ruta);
        }
        ruta += raiz.getElement();
        return ruta;
    }

    /*
    Recorrer arbol preorden
     */
    public String inorden() {
        return this.inorden(this.pRoot, "");
    }
    
    public String inorden(NodoABB raiz, String ruta) {
        if (raiz.getLeft() != null) {
            ruta = inorden(raiz.getLeft(), ruta);
        }
        ruta += raiz.getElement();
        if (raiz.getRight() != null) {
            ruta = inorden(raiz.getRight(), ruta);
        }
        return ruta;
    }

    /*
    Buscar al padre 
     */
    public NodoABB searchPadre(NodoABB current, int data) {
        NodoABB found = null;
        if (data < current.getElement()) {
            if (found != null) {
                return found;
            } else if (current.getLeft() != null) {
                found = this.searchPadre(current.getLeft(), data);
            } else {
                return current;
            }
        } else if (data > current.getElement()) {
            if (found != null) {
                return found;
            } else if (current.getRight() != null) {
                found = this.searchPadre(current.getRight(), data);
            } else {
                return current;
                
            }
        }
        return found;
    }

    /*
    Insertar
     */
    public void insertar(int data) {
        NodoABB node = new NodoABB(data);
        if (this.esVacio()) {
            this.setpRoot(node);
        } else {
            NodoABB nodeP = this.searchPadre(this.getpRoot(), data);
            if (nodeP == null) {
                
            } else if (nodeP.getElement() > node.getElement()) {
                nodeP.setLeft(node);
            } else if (nodeP.getElement() < node.getElement()) {
                nodeP.setRight(node);
            }
        }
    }
    
    public void insertarALaMezcla(int data,int numeroDeArbol) {
        NodoABB node = new NodoABB(data,numeroDeArbol);
        boolean esta = false;
        if (this.esVacio()) {
            this.setpRoot(node);
        } else {
            NodoABB nodeP = this.searchPadre(this.getpRoot(), data);
            if (nodeP == null) {
                NodoGeneral<Rechazados> pAux = Global.valoresRechazados.getpFirst();
                for (int i = 0; i < Global.valoresRechazados.getSize(); i++) {
                    if (pAux.getDato().getDato() == data) {
                        esta = true;
                        break;
                    }
                    pAux = pAux.getpNext();
                }
                if (!esta) {
                    Rechazados r = new Rechazados(data,numeroDeArbol);
                    NodoGeneral<Rechazados> nodoR =new NodoGeneral<>(r);
                    Global.valoresRechazados.agregarNodo(nodoR);
                }
                
            } else if (nodeP.getElement() > node.getElement()) {
                nodeP.setLeft(node);
            } else if (nodeP.getElement() < node.getElement()) {
                nodeP.setRight(node);
            }
        }
    }
    
    
    public void merge(ABB a2, int numeroDeArbol){
        merge(this,a2.getpRoot(), numeroDeArbol);
    }
    
    public void merge(ABB a1, NodoABB raiz,int numeroDeArbol){
        if (raiz.getLeft() != null){
            merge(a1,raiz.getLeft(),numeroDeArbol);
        }
        a1.insertarALaMezcla(raiz.getElement(),numeroDeArbol);
        if (raiz.getRight() != null){
            merge(a1,raiz.getRight(),numeroDeArbol);
        }
    }

    /**
     * @return the pRoot
     */
    public NodoABB getpRoot() {
        return pRoot;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoABB pRoot) {
        this.pRoot = pRoot;
    }
    
}
