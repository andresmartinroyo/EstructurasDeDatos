/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplication;

import Primitivas.ABB;
import Primitivas.Lista;
import Primitivas.NodoGeneral;
import Primitivas.Rechazados;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Funciones {

    public ABB crearArbol(int tamano) {
        ABB arbolC = new ABB();
        int array[] = new int[tamano];
        for (int i = 0; i < tamano; i++) {
            array[i] = (int) (Math.random() * 10);
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]){
                    i--;
                }
            }
        }
        
        for (int i = 0; i < tamano; i++) {
            arbolC.insertar(array[i]);
        }

        return arbolC;
    }

    public void agregarArbol(int tamano){
        if (tamano > 1000 && tamano < 1){
            JOptionPane.showMessageDialog(null, "No se puede crear un arbol de este tamaño.");
        }else{
            ABB arbolC = crearArbol(tamano);
            NodoGeneral<ABB> nodoB = new NodoGeneral<>(arbolC);
            Global.agregarArbol(nodoB);
        }
        
    }
    
    public String leerRechazados(){
        String texto = "";
        NodoGeneral<Rechazados> pAux = Global.valoresRechazados.getpFirst();
        for (int i = 0; i < Global.valoresRechazados.getSize(); i++) {
            texto += pAux.getDato().getDato() + "(" + pAux.getDato().getArbol() + ")" + "," ;
            pAux = pAux.getpNext();

                
            
        }
        return texto;
    }
    
    

    
}
