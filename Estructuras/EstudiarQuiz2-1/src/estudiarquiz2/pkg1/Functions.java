/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudiarquiz2.pkg1;

import ArbolBinarioDeBusqueda.ABB;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;

/**
 *
 * @author Andres
 */
public class Functions {

    public ABB leerArchivoDelArbol() {

        ABB arbol = new ABB();
        JFileChooser fc = new JFileChooser();
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("",".txt","txt");
        int seleccion = fc.showOpenDialog(fc);
        String path = fc.getSelectedFile().getAbsolutePath();
        String arbolS = "";
  
        try {

            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            
            while ((linea=br.readLine()) != null){
                if (!linea.isEmpty()){
                    arbolS += linea + "\n";
                }
            }
            
            String[] arbolA = arbolS.split("\n");
            
            for (int i = 0; i < arbolA.length; i++) {
                arbol.insertar(Integer.parseInt(arbolA[i]));
            }
            

        br.close();
        JOptionPane.showMessageDialog(null, "Lectura exitosa.");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error leyendo: " + e);

        }
        return arbol;
    }
    
    
    
    public String leerArchivoDelArbolLeido() {

        JFileChooser fc = new JFileChooser();
        String recorrido = "";
        FileNameExtensionFilter filtro = new FileNameExtensionFilter("",".txt","txt");
        int seleccion = fc.showOpenDialog(fc);
        String path = fc.getSelectedFile().getAbsolutePath();
        String arbolS = "";
  
        try {

            File f = new File(path);
            FileReader fr = new FileReader(f);
            BufferedReader br = new BufferedReader(fr);
            String linea = "";
            
            while ((linea=br.readLine()) != null){
                if (!linea.isEmpty()){
                    arbolS += linea;
                }
            }
            String[] recorridoA = arbolS.split(",");
            for (int i = 0; i < 10; i++) {
                recorrido += recorridoA[i];
            }
            
            

        br.close();
        JOptionPane.showMessageDialog(null, "Lectura exitosa.");
        
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null,"Ocurrio un error leyendo: " + e);
        }
        return recorrido;
    }

}
        