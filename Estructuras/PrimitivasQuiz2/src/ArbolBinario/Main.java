/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ArbolBinario;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArbolB ab = new ArbolB();
        ab.insertar(5, null, null);
        ab.insertar(2, 5, "left");
        ab.insertar(9, 5, "right");
        ab.insertar(1, 2, "left");
        ab.insertar(3, 2, "right");
        ab.insertar(4, 3, "right");
        ab.insertar(7, 9, "left");
        ab.insertar(11, 9, "right");
        ab.insertar(6, 7, "left");
        ab.insertar(8, 7, "right");
        ab.insertar(10, 1, "left");
        ab.insertar(12, 1, "right");
        
        
        ArbolB ab1 = new ArbolB();
        ab1.insertar(5, null, null);
        ab1.insertar(2, 5, "left");
        ab1.insertar(9, 5, "right");
        ab1.insertar(1, 2, "left");
        ab1.insertar(3, 2, "right");
        ab1.insertar(4, 3, "right");
        ab1.insertar(7, 9, "left");
        ab1.insertar(11, 9, "right");
        ab1.insertar(6, 7, "left");
        ab1.insertar(8, 7, "right");
        ab1.insertar(10, 1, "left");
        ab1.insertar(12, 1, "right");
        
        boolean a = ab1.sonIdenticosPreorden(ab);
        
        System.out.println(a);
        
        System.out.println("Preorden:");
        System.out.println(ab.preorden());
        
        System.out.println("Inorden:");
        System.out.println(ab.inorden());
        
        System.out.println("Postorden:");
        System.out.println(ab.postorden());
    }
    
}
