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
public class Helpers {

    public static int validarDato(String numS) {
        int num;
        try {
            num = Integer.parseInt(numS);
            return num;
        } catch (Exception e) {
            System.out.println("Error");
        }
        return 0;
    }
}
