/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiarquiz2.pkg1;

import ArbolBinarioDeBusqueda.ABB;

/**
 *
 * @author Andres
 */
public class Global {
    
    public static ABB arbol;
    public static String arbolLeido;
    public static String arbolPreorden;
    public static String arbolInorden;
    public static String arbolPostorden;
    
    public static void comparar(){
        Functions f = new Functions(); 
        arbolPreorden = arbol.preorden();
        arbolInorden = arbol.inorden();
        arbolPostorden = arbol.postorden();
    }
    
    public static void cargarArbol(){
        Functions f = new Functions(); 
        arbol = f.leerArchivoDelArbol();
    }
    public static void cargarlectura(){
        Functions f = new Functions(); 
        arbolLeido = f.leerArchivoDelArbolLeido();
    }
    
}
