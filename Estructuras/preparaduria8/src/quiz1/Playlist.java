/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Playlist {

    private Nodo primero;
    private Nodo ultimo;
    private int size;

    //Crear el playlist vacio
    public Playlist() {
        this.primero = null;
        this.ultimo = null;
        this.size = 0;
    }

    //Vacio
    public boolean isEmpty() {
        return (getPrimero() == null);
    }

    //Insertar cancion de ultimo
    public void addToQueue(Nodo cancion) {
        if (!isEmpty()) {
            this.getUltimo().setSiguiente(cancion);
            this.setUltimo(cancion);

        }else{
            setPrimero(cancion);
            setUltimo(cancion);
        }
        this.setSize(this.getSize() + 1);

    }
    
    //Buscar Artista
    public void SearchArtist(String nombre){
        Nodo aux = this.getPrimero();
        String canciones = "";
        if (!isEmpty()){
            for (int i = 0; i < this.getSize(); i++) {
                if (aux.getCancion().getArtista().equalsIgnoreCase(nombre)){
                    canciones = aux.getCancion().imprimirCancion() + "\n";
                    
                }
                aux = aux.getSiguiente();
            }
            if (!canciones.isBlank()){
                JOptionPane.showMessageDialog(null, canciones);
            }else{
                JOptionPane.showMessageDialog(null, "No se encontaron canciones de " + nombre);
            }
        }else{
            JOptionPane.showMessageDialog(null, "La lista está vacía.");
        }
    }
    
    public void imprimirPlaylist(){
        String canciones = "";
        Nodo aux = this.primero;
        for (int i = 0; i < this.size; i++) {
            canciones += aux.getCancion().imprimirCancion() +"\n";
            aux = aux.getSiguiente();
            
        }
        JOptionPane.showMessageDialog(null, canciones);
             
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
