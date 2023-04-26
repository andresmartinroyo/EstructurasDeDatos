/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author Andres
 */
public class Lista {
    
    private Nodo pFirst;
    private Nodo pLast;
    private int size;
    
    public Lista() {
    this.pFirst = null;
    this.pLast= null;
    this.size = 0;
}
    //isEmpty
    public boolean isEmpty(){
        return (this.getpFirst()==null);
    }
    
//Insertar al inicio
    public void appendizar(String nombre, String cedula){
        Nodo newNodo = new Nodo(nombre,cedula);
        if (!isEmpty()){
            newNodo.setpNext(getpFirst());
            setpFirst(newNodo);
            
        }else{
            setpFirst(newNodo);
            setpLast(newNodo);
        }size+=1;
        
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
