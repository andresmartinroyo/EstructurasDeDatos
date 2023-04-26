/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparaduria3;

/**
 *
 * @author Andres
 */
public class Contador {
    private int numero;
    
    public Contador(){
        this.numero = 0;
    }
    public Contador(int numero){
        this.numero = numero;
    }

    public void sumar(int num){
        numero += num;
    }

    public void restar(int num){
        numero -= num;
    }

    public void multiplicar(int num){
        numero = num*numero;
    }
    
    public void dividir(int num){
        numero = numero/num;
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
    
}
