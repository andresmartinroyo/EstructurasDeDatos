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
public class NodoCapitulo {

    private String tituloCapitulo;
    private String sinopsisCapitulo;
    private NodoCapitulo pNext;
    private NodoCapitulo pPrev;

    public NodoCapitulo() {

    }
   public NodoCapitulo(String nombre, String sinopsis){
        this.tituloCapitulo = nombre;
        this.sinopsisCapitulo = sinopsis;
        this.pPrev = null;
        this.pNext = null;
   }
   
      //Imprimir una capitulo
   public String mostrarTituloCapitulo(){
       return ". Titulo: " + this.getTituloCapitulo() + "\n";
   }
   
   //Mostrar sinapsis
   public String mostrarSinopsis(){
       return this.getSinopsisCapitulo();
   }
    /**
     * @return the tituloCapitulo
     */
    public String getTituloCapitulo() {
        return tituloCapitulo;
    }

    /**
     * @param tituloCapitulo the tituloCapitulo to set
     */
    public void setTituloCapitulo(String tituloCapitulo) {
        this.tituloCapitulo = tituloCapitulo;
    }

    /**
     * @return the sinopsisCapitulo
     */
    public String getSinopsisCapitulo() {
        return sinopsisCapitulo;
    }

    /**
     * @param sinopsisCapitulo the sinopsisCapitulo to set
     */
    public void setSinopsisCapitulo(String sinopsisCapitulo) {
        this.sinopsisCapitulo = sinopsisCapitulo;
    }

    /**
     * @return the pNext
     */
    public NodoCapitulo getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoCapitulo pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the pPrev
     */
    public NodoCapitulo getpPrev() {
        return pPrev;
    }

    /**
     * @param pPrev the pPrev to set
     */
    public void setpPrev(NodoCapitulo pPrev) {
        this.pPrev = pPrev;
    }
    
    

}
