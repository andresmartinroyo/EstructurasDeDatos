/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author Andres
 */
public class ListaVecinos {

    private NodoVecino pFirst;
    private NodoVecino pLast;
    private int size;

    //Constructor vacio
    public ListaVecinos() {

    }

    //Vacio
    public boolean esVacio() {
        return (this.getpFirst() == null);
    }

    //Agrega a los vecinos de manera ordenada
    public void agregarVecino(NodoVecino vecino) {
        if (!this.esVacio()) {
            if (this.getSize() == 1) {
                if (this.getpFirst().getCedula() > vecino.getCedula()) {
                    vecino.setpNextVecino(this.getpFirst());
                    this.setpFirst(this.getpFirst());
                } else {
                    this.getpFirst().setpNextVecino(vecino);
                    this.setpLast(vecino);
                }
            } else {
                NodoVecino aux = this.getpFirst();
                for (int i = 0; i < this.getSize(); i++) {
                    if (i < this.getSize() - 1) {
                        if (aux.getpNextVecino().getCedula() > vecino.getCedula()) {
                            vecino.setpNextVecino(aux.getpNextVecino());
                            aux.setpNextVecino(vecino);
                            break;
                        }

                    } else if (i == this.getSize() - 1) {
                        this.getpLast().setpNextVecino(vecino);
                        this.setpLast(vecino);

                    }
                        aux = aux.getpNextVecino();
                }
            }
        } else {
            this.setpFirst(vecino);
            this.setpLast(vecino);
        }
        this.setSize(this.getSize() + 1);
    }

    /**
     * @return the pFirst
     */
    public NodoVecino getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(NodoVecino pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public NodoVecino getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(NodoVecino pLast) {
        this.pLast = pLast;
    }

    /**
     * @return the size
     */
    public int getSize() {
        return size;
    }

    /**
     * @param size the size to set
     */
    public void setSize(int size) {
        this.size = size;
    }

}
