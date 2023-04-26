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
public class Global {
    private static Contador counter = new Contador();

    /**
     * @return the counter
     */
    public static Contador getCounter() {
        return counter;
    }

    /**
     * @param aCounter the counter to set
     */
    public static void setCounter(Contador aCounter) {
        counter = aCounter;
    }
}
