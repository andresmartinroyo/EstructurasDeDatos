/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

/**
 *
 * @author Andres
 */
public class Cancion {

    private int numero;
    private String nombre;
    private String artista;
    private int numeroDeReproducciones;
    private int ano;
    private String idioma;


    public Cancion(int numero, String nombre, String artista, int numeroDeReproducciones, int ano, String idioma) {
        this.numero = numero;
        this.nombre = nombre;
        this.artista = artista;
        this.numeroDeReproducciones = numeroDeReproducciones;
        this.ano = ano;
        this.idioma = idioma;
    }

    public String imprimirCancion() {
        String cancion = Integer.toString(this.getNumero()) + ", " + this.getNombre() + ", " + this.getArtista() + ", " + Integer.toString(this.getNumeroDeReproducciones()) + ", " + Integer.toString(this.getAno()) + ", " + this.getIdioma();
        return cancion;
    }
    

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

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
     * @return the artista
     */
    public String getArtista() {
        return artista;
    }

    /**
     * @param artista the artista to set
     */
    public void setArtista(String artista) {
        this.artista = artista;
    }

    /**
     * @return the numeroDeReproducciones
     */
    public int getNumeroDeReproducciones() {
        return numeroDeReproducciones;
    }

    /**
     * @param numeroDeReproducciones the numeroDeReproducciones to set
     */
    public void setNumeroDeReproducciones(int numeroDeReproducciones) {
        this.numeroDeReproducciones = numeroDeReproducciones;
    }

    /**
     * @return the ano
     */
    public int getAno() {
        return ano;
    }

    /**
     * @param ano the ano to set
     */
    public void setAno(int ano) {
        this.ano = ano;
    }

    /**
     * @return the idioma
     */
    public String getIdioma() {
        return idioma;
    }

    /**
     * @param idioma the idioma to set
     */
    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

}
