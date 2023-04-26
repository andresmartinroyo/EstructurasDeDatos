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
public class ListaCapitulos {

    private NodoCapitulo primero;
    private NodoCapitulo ultimo;
    private int size;

    public ListaCapitulos() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    //vacio
    public boolean esVacio() {
        return (this.getPrimero() == null);
    }

    //Agregar al final
    public void agregarCapitulo(NodoCapitulo capitulo) {
        if (this.esVacio()) {
            this.setPrimero(capitulo);
            this.setUltimo(capitulo);

        } else {
            this.getUltimo().setpNext(capitulo);
            capitulo.setpPrev(this.getUltimo());
            this.setUltimo(capitulo);
        }
        this.setSize(this.getSize() + 1);
    }


    //Mostrar capitulos
    public String mostrarNombreCapitulos() {
        String texto = "";
        NodoCapitulo aux = this.primero;
        if (!this.esVacio()) {
            for (int i = 1; i <= this.getSize(); i++) {
                texto += String.valueOf(i) + aux.mostrarTituloCapitulo();
                aux = aux.getpNext();
            }
        }
        return texto;
    }

    //Mostrar sinapsis 
    public String mostrarSinopsisCapitulo(String titulo){
        NodoCapitulo aux = this.getPrimero();
        String texto = "";
        if (!this.esVacio()){
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getTituloCapitulo().equalsIgnoreCase(titulo))
                    texto = aux.mostrarSinopsis();
                    aux = aux.getpNext();
                
            }
        }return texto;
    }
    
    /**
     * @return the primero
     */
    public NodoCapitulo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(NodoCapitulo primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public NodoCapitulo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(NodoCapitulo ultimo) {
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
