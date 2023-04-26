/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivas;

/**
 *
 * @author Andres
 */
public class ListaDoble {

    public NodoDoble pFirst;
    public NodoDoble pLast;
    public int size;

    public ListaDoble() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    public boolean esVacio() {
        return (pFirst == null);
    }

    
    public void insertarAlInicio(int dato) {
        NodoDoble pNew = new NodoDoble(dato);
        if (this.esVacio()) {
            pFirst = pNew;
            pLast = pNew;
        } else {
            pNew.pNext = pFirst;
            pFirst.pPrev = pNew;
            pFirst = pNew;
        }
        size++;
    }

    
    public void insertarAlFinal(int dato) {
        NodoDoble pNew = new NodoDoble(dato);
        if (this.esVacio()) {
            pFirst = pNew;
            pLast = pNew;
        } else {
            pLast.pNext = pNew;
            pNew.pPrev = pLast;
            pLast = pNew;
        }
        size++;

    }

    public boolean buscar(int dato) {
        NodoDoble pAux = this.pFirst;
        for (int i = 0; i < this.size; i++) {
            if (pAux.data == dato) {
                return true;
            }
            pAux = pAux.pNext;
        }
        return false;
    }

    public void eliminarUnElemento(int dato) {
        if (this.buscar(dato)) {
            NodoDoble pAux = this.pFirst;
            for (int i = 0; i < this.size; i++) {
                if ((pAux.data == dato) && ((pAux != pFirst) && (pAux != pLast))) {
                    NodoDoble pAux2 = pAux.pNext;
                    pAux2.pPrev = pAux.pPrev;
                    pAux.pPrev.pNext = pAux2;
                    size = size - 1;
                    break;
                } else if ((pAux.data == dato) && (pAux == pFirst)) {
                    pFirst = pFirst.pNext;
                    pAux.pNext.pPrev = null;
                    pAux.pNext = null;
                    size = size - 1;
                    break;

                } else if ((pAux.data == dato) && (pAux == pLast)) {
                    pLast = pLast.pPrev;
                    pAux.pPrev.pNext = null;
                    pAux.pPrev = null;
                    size = size - 1;
                    break;
                }
                pAux = pAux.pNext;
            }
        } else {
            System.out.println("El elemento no esta en la lista.");
        }
    }

    public void imprimirLista() {
        if (!this.esVacio()) {
            NodoDoble pAux = this.pFirst;
            for (int i = 0; i < this.size; i++) {
                if (pAux == pFirst) {
                    System.out.print("//<-> " + pAux.data + " <-> ");
                } else if (pAux == pLast) {
                    System.out.print(pAux.data + " <-> //");
                    System.out.println("");

                } else {
                    System.out.print(pAux.data + " <-> ");
                }
                pAux = pAux.pNext;
            }
            System.out.println("");
        }
    }
    
    public int minimoDentroDeUnIntervalo(int limite){
        NodoDoble pAux = this.pFirst;
        int minimo = pAux.data;
        for (int i = 0; i < this.size-limite; i++) {
            if (pAux.data < minimo){
                minimo = pAux.data;
            }
            pAux = pAux.pNext;
        }
        return minimo;
    }

    public void ordenarListaDoble(){
        for (int i = 0; i < this.size; i++) {
            int minimo = this.minimoDentroDeUnIntervalo(i);
            this.eliminarUnElemento(minimo);
            this.insertarAlFinal(minimo);
        }
    }
    
}
