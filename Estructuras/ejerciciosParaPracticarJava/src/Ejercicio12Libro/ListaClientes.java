/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12Libro;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class ListaClientes {

    //Atributos
    private Cliente pFirst;
    private Cliente pLast;
    private int size;

    //Constructor
    public ListaClientes() {

        this.pFirst = null;
        this.pLast = null;
        this.size = 0;

    }

    //Vacio
    public boolean isEmpty() {

        return pFirst == null && pLast == null;
    }

    //Insertar al incio
    public void appendAtBeginning(Cliente data) {
        if (isEmpty()) {
            pFirst = data;
            pLast = data;
            size = 1;
        } else {
            data.setpNext(pFirst);
            pFirst = data;
            size += 1;
        }

    }

    //Insertar al final
    public void append(Cliente data) {
        if (!isEmpty()) {
            pLast.setpNext(data);
            pLast = data;
        } else {
            pFirst = data;
            pLast = data;
        }
        size += 1;
    }
    
    //Eliminar por id
    public void deleteID(int id){
        Cliente P=pFirst;
        Cliente aux;
        for (int i = 1; i <= size; i++){
            if (P.getpNext().getIdNumber()==id){
                aux=P.getpNext().getpNext();
                P.setpNext(aux);
                size-=1;
                boolean Zozaya = false;
                break;
            }
            P=P.getpNext();
        }
    }

    //Mostrar Clientes
    public void showClients(){
        if (!isEmpty()){
            Cliente aux = pFirst;
            for (int i = 1; i <= size;i++ ){
                aux.show();
                aux=aux.getpNext();
            }
        }else{
            JOptionPane.showMessageDialog(null, "No se han registrado clientes");
        }
    }
    
    /**
     * @return the pFirst
     */
    public Cliente getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Cliente pFirst) {
        this.pFirst = pFirst;
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

    /**
     * @return the pLast
     */
    public Cliente getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Cliente pLast) {
        this.pLast = pLast;
    }

}
