/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pilas;
/**
 *
 * @author Andres
 */
public class Pilas {

    public int size;
    public NodoPila pCima;

    public Pilas() {
    }

    public boolean esVacio() {
        return this.pCima == null;
    }

    public void apilar(int dato) {
        NodoPila nuevo = new NodoPila(dato);
        nuevo.pNext = this.pCima;
        this.pCima = nuevo;
        this.size++;
    }

    public void desapilar() {
        this.pCima = this.pCima.pNext;
        this.size--;
    }

    public void imprimirPila() {
        if (this.esVacio()) {
            System.out.println("//\n");
        } else {
            int aux = this.pCima.dato;
            this.desapilar();
            System.out.print(aux + " -> ");
            this.imprimirPila();
            this.apilar(aux);
        }
    }

    public void sumegir(int dato) {
        if (!this.esVacio()) {
            int aux = this.pCima.dato;
            this.desapilar();
            this.sumegir(dato);
            this.apilar(aux);
        } else {
            this.apilar(dato);
        }

    }

    public void invertir() {
        if (!this.esVacio()) {
            int aux = this.pCima.dato;
            this.desapilar();
            this.invertir();
            this.sumegir(aux);

        }

    }

    public Pilas copiar(Pilas copiada) {
        if (!copiada.esVacio()) {
            int aux = copiada.pCima.dato;
            copiada.desapilar();
            this.copiar(copiada);
            this.apilar(aux);
            copiada.apilar(aux);
        }
        return copiada;
    }

    public void eliminarUnelemento(int elem) {
        if (!this.esVacio()) {
            int aux = this.pCima.dato;
            if (aux != elem) {
                this.desapilar();
                this.eliminarUnelemento(elem);
                this.apilar(aux);
            } else {
                this.desapilar();
            }
        }
    }

    public int obtenerMinimo(int minimo) {
        if (!this.esVacio()) {
            int aux = this.pCima.dato;
            if (aux < minimo) {
                minimo = aux;
            }
            this.desapilar();
            minimo = this.obtenerMinimo(minimo);
            this.apilar(aux);

        } else {
            return minimo;
        }
        return minimo;
    }

    public int obtenerMaximo(int maximo) {
        if (!this.esVacio()) {
            int aux = this.pCima.dato;
            if (aux > maximo) {
                maximo = aux;
            }
            this.desapilar();
            maximo = this.obtenerMaximo(maximo);
            this.apilar(aux);

        } else {
            return maximo;
        }
        return maximo;
    }

    public void ordenarPilaAsc() {
        if (!this.esVacio()) {
            int minimo = this.obtenerMinimo(this.pCima.dato);
            this.eliminarUnelemento(minimo);
            this.ordenarPilaAsc();
            this.apilar(minimo);
        }
    }

    public void ordenarPilaDesc() {
        if (!this.esVacio()) {
            int maximo = this.obtenerMaximo(this.pCima.dato);
            this.eliminarUnelemento(maximo);
            this.ordenarPilaDesc();
            this.apilar(maximo);
        }
    }

    public void sumarPilas(Pilas p1, Pilas p2, int acarreador) {
        int suma = 0;
        if (p1.esVacio() && !p2.esVacio()) {
            suma = p2.pCima.dato + acarreador;
            if (suma >= 10) {
                acarreador = 1;
                suma -= 10;
            } else {
                acarreador = 0;
            }
            p2.desapilar();
            sumarPilas(p1, p2, acarreador);
        } else if (!p1.esVacio() && p2.esVacio()) {
            suma = p1.pCima.dato + acarreador;
            if (suma >= 10) {
                acarreador = 1;
                suma -= 10;
            } else {
                acarreador = 0;
            }
            p1.desapilar();
            sumarPilas(p1, p2, acarreador);
        } else if (!p1.esVacio() && !p2.esVacio()) {
            suma = p1.pCima.dato + p1.pCima.dato + acarreador;
            if (suma >= 10) {
                acarreador = 1;
                suma -= 10;
            } else {
                acarreador = 0;
            }
            p1.desapilar();
            p2.desapilar();
            sumarPilas(p1, p2, acarreador);
        }
        this.apilar(suma);
    }

    public void ordernarPilaNueva(Pilas p1, Pilas p2) {
        if (!p2.esVacio()) {
            int auxp2 = p2.pCima.dato;
            p2.desapilar();
            this.ordernarPilaNueva(p1, p2);
            while (true) {
                if (!p1.esVacio()) {
                    if (p1.pCima.dato < auxp2) {
                        this.apilar(p1.pCima.dato);
                        p1.desapilar();
                    } else {
                        this.apilar(auxp2);
                        break;
                    }
                } else {
                    this.apilar(auxp2);
                    break;
                }
            }
        }
    }
    
    static void eliminarMedio(Pilas p, int cont, int tamano){
        if (!p.esVacio()){
            int elem = p.pCima.dato;
            p.desapilar();
            cont ++;
            eliminarMedio(p,cont,tamano);
            if (cont!= tamano/2){
                p.apilar(elem);
            }
            
        }
            
    }

}
