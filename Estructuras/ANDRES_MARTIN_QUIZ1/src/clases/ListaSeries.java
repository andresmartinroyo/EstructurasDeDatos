/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author Andres
 */
public class ListaSeries {

    private NodoSeries primero;
    private NodoSeries ultimo;
    private int size;

    public ListaSeries() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    //vacio
    public boolean esVacio() {
        return (this.getPrimero() == null);
    }

    //Agregar al final
    public void agregarSerie(NodoSeries serie) {
        if (this.esVacio()) {
            this.setPrimero(serie);
            this.setUltimo(serie);

        } else {
            this.getUltimo().setpNext(serie);
            serie.setpPrev(this.getUltimo());
            this.setUltimo(serie);
        }
        this.setSize(this.getSize() + 1);
    }

    //Buscar serie tipo
    public String buscarSerietipo(String tipo) {
        String catalogo = "";
        if (!this.esVacio()) {
            NodoSeries aux = this.getPrimero();
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getTipo().equals(tipo)) {
                    catalogo += aux.mostrarSerie();
                }
                aux = aux.getpNext();

            }
            return catalogo;
        }
        return catalogo;
    }

    //Buscar serie general
    public String mostrarTodasLasSeries() {
        String catalogo = "";
        if (!this.esVacio()) {
            NodoSeries aux = this.getPrimero();
            for (int i = 0; i < this.getSize(); i++) {

                catalogo += aux.mostrarSerie();

                aux = aux.getpNext();

            }
            return catalogo;
        }
        return catalogo;
    }

//Buscar serie invertido
    public String buscarSerieInvertido(String tipo) {
        String catalogo = "";
        if (!this.esVacio()) {
            NodoSeries aux = this.getUltimo();
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getTipo().equals(tipo)) {
                    catalogo += aux.mostrarSerie();
                }
                aux = aux.getpPrev();

            }
        }
        return catalogo;
    }

    public String mostrarSerieOrdenadoAsc() {
        String texto = "";
        this.Ordenar();
        texto = this.mostrarTodasLasSeries();
        return texto;
    }

    //Al final arrelgar agregar serie para que se suba ordenada
    //Ordenar
    public void Ordenar() {
        NodoSeries P = this.getPrimero();
        NodoSeries aux = new NodoSeries();
        if (!this.esVacio()) {
            for (int i = 0; i < this.getSize(); i++) {
                if (P.getCapitulos().getSize() > P.getpNext().getCapitulos().getSize()) {
                    aux = P.getpNext();
                    P.setpNext(aux.getpNext());
                    aux.setpPrev(P.getpPrev());
                    P.getpNext().setpPrev(P);
                    aux.setpNext(P);
                    aux.getpPrev().setpNext(aux);
                    i += 1;
                    if (P.getpNext() == null) {
                        this.setUltimo(P);
                    }
                    if (aux.getpPrev() == null) {
                        this.setPrimero(aux);
                    } else {

                        P = P.getpNext();
                    }
                }
            }
        }
    }

    //MOstrar capitulos de una serie
    public String mostrarCapitulosDeSerie(String name) {
        String texto = "";
        NodoSeries aux = this.getPrimero();
        if (!this.esVacio()) {
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getNombre().equalsIgnoreCase(name)) {
                    texto = aux.getCapitulos().mostrarNombreCapitulos();
                }
                aux = aux.getpNext();
            }
        }
        return texto;
    }

    //Devolver
    public ListaCapitulos devolverLista(String name) {
        NodoSeries aux = this.getPrimero();
        if (!this.esVacio()) {
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getNombre().equalsIgnoreCase(name)) {
                    return aux.getCapitulos();
                }
                aux = aux.getpNext();
            }
        }
        return null;
    }

    /**
     * @return the primero
     */
    public NodoSeries getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoSeries primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoSeries getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoSeries ultimo) {
        this.ultimo = ultimo;
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
