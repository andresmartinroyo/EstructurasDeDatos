/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivasdeedd;

/**
 *
 * @author Andres
 */
public class Pila<T> {

    private Nodo<T> fondo;
    private Nodo<T> cima;
    private int size;

    public Pila() {
    }

    //Verufucar si es vacía
    public boolean isEmpty() {
        return (this.getCima() == null);
    }

    //Apilar
    public void apilar(T dato) {
        Nodo<T> nodo = new Nodo<T>(dato);
        if (!this.isEmpty()) {
            nodo.setpPrev(this.getCima());
            this.setCima(nodo);
        } else {
            this.setCima(nodo);
            this.setFondo(nodo);
        }

    }

    //Desapilar
    public void desapilar() {
        if (!this.isEmpty()) {
            this.setCima(this.getCima().getpPrev());
        }
    }

    //Invertir REVISAR
    public Pila<T> invertirPila() {
        Pila<T> copia = new Pila<>();
        Nodo<T> aux = new Nodo<>();
        if (!this.isEmpty()) {
            aux = this.getCima();
            copia.apilar(aux.getData());
            this.desapilar();
            this.invertirPila();
            this.apilar(aux.getData());
        }
        return copia;
    }
    
    //Show
    public void imprimir(){
        Nodo<T> aux = new Nodo<>();
        if (!this.isEmpty()){
            System.out.println(this.getCima().getData());
            this.desapilar();
            this.imprimir();
            this.apilar(aux.getData());
        }
    }

    /**
     * @return the fondo
     */
    public Nodo<T> getFondo() {
        return fondo;
    }

    /**
     * @param fondo the fondo to set
     */
    public void setFondo(Nodo<T> fondo) {
        this.fondo = fondo;
    }

    /**
     * @return the cima
     */
    public Nodo<T> getCima() {
        return cima;
    }

    /**
     * @param cima the cima to set
     */
    public void setCima(Nodo<T> cima) {
        this.cima = cima;
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