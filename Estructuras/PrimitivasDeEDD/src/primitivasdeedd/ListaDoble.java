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
public class ListaDoble<T> {
    
    private Nodo<T> pFirst;
    private Nodo<T> pLast;
    private int size;
    
    //Verificar que este vacia
    public boolean isEmpty(){
        return (this.getpFirst()==null);
    }
    
    //Agregar elementos al final
    public void agregarAlFinal(Nodo nodo){
        if (!this.isEmpty()){
            nodo.setpPrev(this.getpLast());
            this.getpLast().setpNext(nodo);
            this.setpLast(nodo);
        }else{
            this.setpFirst(nodo);
            this.setpLast(nodo);
        }
            this.setSize(this.getSize()+1);
    }
    
    //Agregar al inicio
    public void agregarAlInicio(Nodo nodo){
        if (!this.isEmpty()){
            nodo.setpNext(getpLast());
            this.getpFirst().setpPrev(nodo);
            this.setpFirst(nodo);
        }else{
            this.setpFirst(nodo);
            this.setpLast(nodo);
        }
            this.setSize(this.getSize()+1);
    }
    
    //Buscar elemento
    public Nodo<T> buscarDato(T dato){
        Nodo<T> aux = new Nodo<>();
        if (!this.isEmpty()){
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getData()==dato){
                    return aux;
                }
                aux = aux.getpNext();
            }
         
        }
        
        return null;
    }
    
    //Insertar eleemento despues de un dato especifico
    public void agregarDespuesDe(Nodo nodo,T dato){
        Nodo<T> aux1 = new Nodo<>();
        Nodo<T> aux2 = new Nodo<>();
        aux1 = this.buscarDato(dato);
        aux2 = aux1.getpNext();
        if (aux1!=null){
            nodo.setpPrev(aux1.getpNext());
            nodo.setpPrev(aux2);
            aux1.setpNext(nodo);
            aux2.setpPrev(nodo);
            if (aux2==null){
                this.setpLast(nodo);
            }
            
        }else{
            JOptionPane.showMessageDialog(null, "No existe el elemento " + dato + " en esta lista.");
        }
    }
    
    /**
     * @return the pFirst
     */
    public Nodo getpFirst() {
        return pFirst;
    }

    /**
     * @param pFirst the pFirst to set
     */
    public void setpFirst(Nodo pFirst) {
        this.pFirst = pFirst;
    }

    /**
     * @return the pLast
     */
    public Nodo getpLast() {
        return pLast;
    }

    /**
     * @param pLast the pLast to set
     */
    public void setpLast(Nodo pLast) {
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
