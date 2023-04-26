/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Funciones {
    
    public void escribir_txt(Playlist lista){
        String musica_actual = "";
        if (!lista.isEmpty()){
            Nodo temp = lista.getPrimero();
            for (int i = 0; i < lista.getSize(); i++) {
                musica_actual += Integer.toString(temp.getCancion().getNumero())+","+temp.getCancion().getNombre()+","+temp.getCancion().getArtista()
                    +","+Integer.toString(temp.getCancion().getNumeroDeReproducciones())+","+Integer.toString(temp.getCancion().getAno())+","+temp.getCancion().getIdioma()+"\n";
                temp=temp.getSiguiente();
        }
            try{
                PrintWriter pw = new PrintWriter("test\\musica_txt");
                pw.print(musica_actual);
                pw.close();
                JOptionPane.showMessageDialog(null, "Guardado exitoso.");
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Ocurrió un error al escrubir lista: "+e);
            }
    }
    
}
}