/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Colas;


/**
 *
 * @author Andres
 */
public class Cola {

    public NodoCola cabeza;
    public NodoCola fin;
    public int size;

    public Cola() {
        cabeza = null;
        fin = null;
        size = 0;
    }

    public boolean esVacio() {
        return (cabeza == null);
    }

    public void encolar(int elemento) {
        NodoCola aux = new NodoCola(elemento);
        if (this.esVacio()) {
            this.cabeza = aux;
            this.fin = aux;

        } else {
            this.fin.pNext = aux;
            this.fin = aux;
        }
        this.size++;
    }

    public void desencolar() {
        if (!this.esVacio()) {
            if (this.cabeza.equals(this.fin)) {
                this.cabeza = null;
                this.fin = null;
            } else {
                this.cabeza = this.cabeza.pNext;
            }
            this.size--;
        }
    }

    public void invertir() {
        if (!this.esVacio()) {
            NodoCola aux = this.cabeza;
            this.desencolar();
            this.invertir();
            this.encolar(aux.dato);
        }
    }

    public void imprimir() {
        this.preimprimir();
        this.invertir();
    }

    public void preimprimir() {
        if (!this.esVacio()) {
            NodoCola aux = this.cabeza;
            this.desencolar();
            System.out.print(aux.dato + "->");
            this.preimprimir();
            this.encolar(aux.dato);
        } else {
            System.out.println("");
        }

    }

    public boolean existe(int valor, boolean resultado) {
        if (this.esVacio()) {
            return resultado;
        } else {
            int auxC = this.cabeza.dato;
            this.desencolar();
            if (valor == auxC) {
                resultado = true;
            }
            resultado = this.existe(valor, resultado);
            this.encolar(auxC);
        }
        return resultado;
    }

    public boolean buscar(int valor) {
        this.invertir();
        boolean resultado = false;
        resultado = this.existe(valor, resultado);
        return resultado;
    }
}
