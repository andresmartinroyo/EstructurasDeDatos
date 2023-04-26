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
public class main {


    /*Recursividad
    
    Todo metodo que se llama a si mismo.
    
    Cuando se hace una llamada recursica, se crea un nuevo espacio en la pila de ejecución para almacenar los nuevos
    valores que van a tomar las variables propias del método.
    
    Vamos a llamar ambientes a las nuievas ejecuciones de la pila.
    
    Hay que hacerun punto de quierbe para que se haga una condición de salida.
    
    
    */
    
    
    public static void main(String[] args) {
        Funciones f = new Funciones();
//        f.count(0);
        int[] array = {19,20,13,25,16,24};
        f.orderDescArray(array, 0);
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
}
