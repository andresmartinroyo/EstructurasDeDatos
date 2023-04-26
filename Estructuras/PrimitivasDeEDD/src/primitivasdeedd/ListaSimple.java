/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivasdeedd;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ListaSimple<T> {

    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;

    //Constructor vacío
    public ListaSimple() {
        this.pFirst = null;
        this.pLast = null;
        this.size = 0;
    }

    //Verificar que este vacía
    public boolean isEmpty() {
        return (this.getpFirst() == null);
    }

    //Añadir al inicio
    public void insertarAlInicio(Nodo<T> nodito) {
        if (!this.isEmpty()) {
            nodito.setpNext(this.getpFirst());
            this.setpFirst(nodito);
        } else {
            this.setpFirst(nodito);
            this.setpLast(nodito);
        }
        this.setSize(this.getSize() + 1);
    }

    //Añadir al final de la lista
    public void insterarAlFinal(Nodo<T> nodito) {
        if (!this.isEmpty()) {
            this.getpLast().setpNext(nodito);
            this.setpLast(nodito);
        } else {
            this.setpFirst(nodito);
            this.setpLast(nodito);
        }
        this.setSize(this.getSize() + 1);
    }

    //Buscar elemento
    public Nodo<T> buscarDato(T dato) {
        Nodo<T> aux = new Nodo<>();
        aux = this.getpFirst();
        if (!this.isEmpty()) {
            for (int i = 0; i < this.size; i++) {
                if (dato == aux.getData()) {
                    return aux;
                }
                aux = aux.getpNext();
            }
        }
        return null;

    }

    //Añadir despues de un nodo
    public void insterarDespuesDe(Nodo nodo, T dato) {
        Nodo<T> aux = new Nodo<>();
        aux = this.buscarDato(dato);
        if (aux != null) {
            nodo.setpNext(aux.getpNext());
            aux.setpNext(nodo);
            this.setSize(this.getSize() + 1);
        } else {
            JOptionPane.showMessageDialog(null, "No se ha encontrado " + dato + " en la lista");
        }
    }

    //Eliminar elemento seleccionado
    public void eliminarUnElemento(T dato) {
        Nodo<T> aux1 = new Nodo<>();
        Nodo<T> aux2 = new Nodo<>();
        aux1 = this.getpFirst();
        if (!this.isEmpty()) {
            for (int i = 0; i < this.getSize(); i++) {
                if (aux1.getpNext().getData() == dato) {
                    aux2 = aux1;
                    aux1 = aux1.getpNext();
                    aux2.setpNext(aux1.getpNext());
                    aux1.setpNext(null);
                }
                aux1=aux1.getpNext();
            }

        }
    }

    //Eliminar ultimo elemento
    public void eliminarUltimoElemento() {
        if (!this.isEmpty()) {
            Nodo<T> aux = new Nodo<>();
            aux = this.getpFirst();
            for (int i = 1; i <= this.getSize(); i++) {
                if (i == this.getSize() - 1) {
                    aux.setpNext(null);
                } else {
                    aux = aux.getpNext();
                }
            }
            this.setSize(this.getSize() - 1);
        }
        JOptionPane.showMessageDialog(null, "La lista ya está vacía.");
    }
    
    //Ordenar lista de enteros
//    public ListaSimple<Integer> orderanLista(){
//        if (!this.isEmpty()){
//            Nodo aux = new Nodo();
//            ListaSimple<Integer> listaOrdenada = new ListaSimple<Integer>();
//            for (int i = 0; i < this.getSize(); i++) {
//                if (i==0){
//                    aux=this.getpFirst().getData();
//                }
//                
//            }
// 
//            
//        }
//    }

    /**
     * @return the pFirst
     */
    public Nodo<T> getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo<T> pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo<T> getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo<T> pLast) {
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
