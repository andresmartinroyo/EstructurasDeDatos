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
public class NodoSeries {
    
    private String nombre;
    private String sinopsis;
    private ListaCapitulos capitulos;
    private String tipo;
    private NodoSeries pPrev;
    private NodoSeries pNext;
    
    //Constructor Vacio
    public NodoSeries(){
        this.nombre = "";
        this.sinopsis = "";
        this.tipo = "";
        this.capitulos = new ListaCapitulos();
        this.pPrev = null;
        this.pNext = null;
       
    }
    
   public NodoSeries(String nombre, String sinopsis, String tipo){
        this.nombre = nombre;
        this.sinopsis = sinopsis;
        this.capitulos = new ListaCapitulos();
        this.tipo = tipo;
        this.pPrev = null;
        this.pNext = null;
       
   }
   
   //Imprimir una serie
   public String mostrarSerie(){
       return "Nombre: " + this.getNombre() + "\nSinopsis: \n" + this.getSinopsis() + "\nNumero capitulos: " + this.getCapitulos().getSize() +"\n";
   }
    

   
    //Constructor con nombre
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the sinopsis
     */
    public String getSinopsis() {
        return sinopsis;
    }

    /**
     * @param sinopsis the sinopsis to set
     */
    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    /**
     * @return the capitulos
     */
    public ListaCapitulos getCapitulos() {
        return capitulos;
    }

    /**
     * @param capitulos the capitulos to set
     */
    public void setCapitulos(ListaCapitulos capitulos) {
        this.capitulos = capitulos;
    }

    /**
     * @return the pPrev
     */
    public NodoSeries getpPrev() {
        return pPrev;
    }

    /**
     * @param pPrev the pPrev to set
     */
    public void setpPrev(NodoSeries pPrev) {
        this.pPrev = pPrev;
    }

    /**
     * @return the pNext
     */
    public NodoSeries getpNext() {
        return pNext;
    }

    /**
     * @param pNext the pNext to set
     */
    public void setpNext(NodoSeries pNext) {
        this.pNext = pNext;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
   
    
    
}
