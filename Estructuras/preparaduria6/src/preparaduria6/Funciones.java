/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparaduria6;

/**
 *
 * @author Andres
 */
public class Funciones {

    public void count(int i) {
        if (i < 11) {
            System.out.println(i);
            this.count(i + 1);
            //inverso
            //this.count(i+1);
            //System.out.println(i);
        }
    }

    public int[] orderDescArray(int[] array, int i) {
        if (i < array.length) {
            int higher = array[0];
            int k = 0;
            for (int j = 1; j < array.length; j++) {
                if (higher < array[j]) {
                    higher = array[j];
                    k = j;
                }
            }
            array[k] = -1;
            array = orderDescArray(array, i + 1);
            array[i] = higher;
            return array;
        }
        return array;
    }
}


