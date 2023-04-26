/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class AsosiacionVecinos {

    private ListaEdificios listaDeEdificios;
    private ListaVecinos listaDeVecinos;

    public AsosiacionVecinos() {
        this.listaDeEdificios = new ListaEdificios();
        this.listaDeVecinos = new ListaVecinos();
    }

    public AsosiacionVecinos(ListaEdificios listaDeEdificios, ListaVecinos listaDeVecinos) {
        this.listaDeEdificios = listaDeEdificios;
        this.listaDeVecinos = listaDeVecinos;
    }

    public String direccionVecino(int cedula) {
        String datosT = "";
        if (!this.getListaDeVecinos().esVacio()) {
            NodoVecino vecino = this.getListaDeVecinos().getpFirst();
            for (int i = 0; i < this.getListaDeVecinos().getSize(); i++) {
                if (vecino.getCedula() == cedula) {
                    datosT ="Nombre: " + vecino.getNombre() + "\n" +
                            "Telefono: " + vecino.getTelefono() + "\n" +
                            "Cedula: " + String.valueOf(vecino.getCedula()) + "\n" +
                            "Direccion: Edificio " + vecino.getApartamento().getNombreEdificio() + ", apto: " + vecino.getApartamento().getNumeroApartamento();
                } 
                vecino = vecino.getpNextVecino();
            }
        }return datosT;
    }

    /**
     * @return the listaDeEdificios
     */
    public ListaEdificios getListaDeEdificios() {
        return listaDeEdificios;
    }

    /**
     * @param listaDeEdificios the listaDeEdificios to set
     */
    public void setListaDeEdificios(ListaEdificios listaDeEdificios) {
        this.listaDeEdificios = listaDeEdificios;
    }

    /**
     * @return the listaDeVecinos
     */
    public ListaVecinos getListaDeVecinos() {
        return listaDeVecinos;
    }

    /**
     * @param listaDeVecinos the listaDeVecinos to set
     */
    public void setListaDeVecinos(ListaVecinos listaDeVecinos) {
        this.listaDeVecinos = listaDeVecinos;
    }

}
