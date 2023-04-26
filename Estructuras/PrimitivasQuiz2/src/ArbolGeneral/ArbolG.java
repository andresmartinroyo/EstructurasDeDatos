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
public class ArbolG {

    private NodoArbolG pRoot;

    public ArbolG() {
    }


    /*
    Verifica si el arbol es vacio
     */
    public boolean esVacio() {
        return (this.getpRoot() == null);
    }

    /*
    Imprime en prorden. Hacer que devuelva String
     */
    public void imprimirPreorden() {
        this.imprimirPreorden(this.getpRoot());
        System.out.println("");
    }

    public void imprimirPreorden(NodoArbolG raiz) {
        System.out.print(raiz.getElemento() + ",");
        if (raiz.getHijo_izq() != null) {
            this.imprimirPreorden(raiz.getHijo_izq());
        }
        if (raiz.getHermano_der() != null) {
            this.imprimirPreorden(raiz.getHermano_der());
        }
    }

    /*
    Imprime postorden. Hay que hacer que devuelva string
     */
    public void imprimirPostorden() {
        this.imprimirPostorden(this.getpRoot());
        System.out.println("");
    }

    public void imprimirPostorden(NodoArbolG raiz) {
        if (raiz.getHijo_izq() != null) {
            this.imprimirPostorden(raiz.getHijo_izq());
        }
        System.out.print(raiz.getElemento() + ",");
        if (raiz.getHermano_der() != null) {
            this.imprimirPostorden(raiz.getHermano_der());
        }
    }

    /*
    Imprimir Inorden.
     */
    public void imprimirInorden() {
        this.imprimirInorden(this.getpRoot());
        System.out.println("");
    }

    public void imprimirInorden(NodoArbolG raiz) {
        if (raiz.getHijo_izq() != null) {
            this.imprimirInorden(raiz.getHijo_izq());
        }
        if (raiz.getHijo_izq() == null) {
            System.out.print(raiz.getElemento() + ",");
        }
        if (raiz.getPadre() != null) {
            if (raiz.getPadre().getHijo_izq().equals(raiz)) {
                System.out.print(raiz.getPadre().getElemento() + ",");
            }
        }
        if (raiz.getHermano_der() != null) {
            this.imprimirInorden(raiz.getHermano_der());
        }
    }

    /*
    Insertar nodo conciendo padre
     */
    public void insertar(NodoArbolG padre, NodoArbolG nuevo) {
        if (padre == null) {
            this.setpRoot(nuevo);
        } else if (padre.getHijo_izq() == null) {
            nuevo.setPadre(padre);
            padre.setHijo_izq(nuevo);
        } else {
            NodoArbolG pAux = padre.getHijo_izq();
            while (pAux.getHermano_der() != null) {
                pAux = pAux.getHermano_der();
            }
            nuevo.setPadre(padre);
            pAux.setHermano_der(nuevo);
        }
    }

    /*
    Buscar un nodo
     */
    public NodoArbolG buscar(Object elemento) {
        return buscar(this.getpRoot(), elemento);
    }

    public NodoArbolG buscar(NodoArbolG raiz, Object elemento) {
        NodoArbolG buscado = null;
        if (this.getpRoot() == null) {
        } else if (raiz.getElemento() == elemento) {
            buscado = raiz;
        } else if (raiz.getHijo_izq() != null) {
            buscado = buscar(raiz.getHijo_izq(), elemento);
            if (buscado != null) {
            } else if (raiz.getHermano_der() != null) {
                buscado = buscar(raiz.getHermano_der(),elemento);
            }
        }else if (raiz.getHijo_izq() == null){
            if (raiz.getHermano_der() != null){
                buscado = buscar(raiz.getHermano_der(),elemento);
            }
        }
        return buscado;
    }

    /**
     * @param pRoot the pRoot to set
     */
    public void setpRoot(NodoArbolG pRoot) {
        this.pRoot = pRoot;
    }

    /**
     * @return the pRoot
     */
    public NodoArbolG getpRoot() {
        return pRoot;
    }

}
