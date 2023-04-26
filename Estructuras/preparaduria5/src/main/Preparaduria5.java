/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author Andres
 */
public class Preparaduria5 {
    
    /*
    Listas implenentadas con arreglos
    
    Se susituye el uso de apuntadores y en su lugar se usan arreglos
    
    
    */
    
    public static void main(String[] args) {
        Lista nuevaListaDeArreglos = new Lista(10);
        
        nuevaListaDeArreglos.insertOrdered("Jose");
        nuevaListaDeArreglos.insertOrdered("Luis");
        nuevaListaDeArreglos.insertOrdered("David");
        nuevaListaDeArreglos.insertOrdered("Maria");
        nuevaListaDeArreglos.insertOrdered("Rata");
        nuevaListaDeArreglos.insertOrdered("Alberto");
        
        System.out.println(nuevaListaDeArreglos.printList());
        
        System.out.println(nuevaListaDeArreglos.isFull());
        System.out.println(nuevaListaDeArreglos.isEmpty());
    }
    
}
