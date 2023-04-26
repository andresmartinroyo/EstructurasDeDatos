/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparaduria2;

/**
 *
 * @author Andres
 */
public class Lista {

    private Nodo primero;
    private Nodo ultimo;
    private int tamano;

    //Constructor lista vacía
    public Lista() {

        this.primero = null;
        this.ultimo = null;
        this.tamano = 0;

    }

    //Vacio
    public boolean Vacio() {
        return primero == null & ultimo == null;
    }

    //Insertar al inicio
    public void Insertar_Inicio(int dato) {
        Nodo nuevo_nodo = new Nodo(dato, primero);
        primero = nuevo_nodo;

        if (ultimo == null) {
            ultimo = primero;

        }
        tamano += 1;
    }

    //Insertar al final
    public void Insertar_Final(int dato) {
        Nodo nuevo_nodo = new Nodo(dato);
        if (Vacio()) {
            primero = nuevo_nodo;
            ultimo = nuevo_nodo;
        } else {
            Nodo aux = ultimo;
            ultimo = nuevo_nodo;
            aux.setSiguiente(nuevo_nodo);
        }
        tamano += 1;
    }

    //Mostrar
    public void Imprimir() {
        if (!Vacio()) {
            Nodo aux = primero;
            for (int i = 1; i <= tamano; i++) {
                System.out.println(aux.getDato());
                aux = aux.getSiguiente();
            }
        } else {
            System.out.println("La lista esta vacia.");
        }
    }

    //Eliminar inicio
    public void Eliminar_Inicio() {
        if (!Vacio()) {
            primero = primero.getSiguiente();
            tamano -= 1;
        } else {
            System.out.println("La lista esta vacía.");
        }
    }

    //Eliminar final
    public void Eliminar_Final() {
        if (!Vacio()) {
            Nodo aux = primero;
            for (int i = 1; i <= tamano - 1; i++) {
                if (i == tamano - 1) {
                    ultimo = aux;
                    tamano -= 1;
                    ultimo.setSiguiente(null);
                }
                aux = aux.getSiguiente();
            }
        }else{
            System.out.println("La lista esta vacía.");
    }
}

/**
 * @return the primero
 */
public Nodo getPrimero() {
        return primero;
    }

    /**
     * @param primero the primero to set
     */
    public void setPrimero(Nodo primero) {
        this.primero = primero;
    }

    /**
     * @return the ultimo
     */
    public Nodo getUltimo() {
        return ultimo;
    }

    /**
     * @param ultimo the ultimo to set
     */
    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    /**
     * @return the tamano
     */
    public int getTamano() {
        return tamano;
    }

    /**
     * @param tamano the tamano to set
     */
    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
public String toString() {
        return "Lista{" + "primero=" + primero + ", ultimo=" + ultimo + ", tamano=" + tamano + '}';
    }

}
