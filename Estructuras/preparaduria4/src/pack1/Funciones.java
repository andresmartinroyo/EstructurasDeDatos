/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.PrintWriter;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Funciones {
    
    public void escribir_txt(Lista clientes){
        String clientesActuales = "";
        if (!clientes.isEmpty()){
            Nodo temp = clientes.getpFirst();
            for (int i = 0; i < clientes.getSize(); i++) {
                clientesActuales = temp.getNombre() + ","  + temp.getCedula() + "\n";
                temp = temp.getpNext();
                
            }
        }
        try {
            PrintWriter pw = new PrintWriter("test\\clientes.txt");
            pw.print(clientesActuales);
            pw.append("Samuel,2323");
            pw.append("\n");
            pw.append("Jorge,23213");
            pw.close();
            JOptionPane.showMessageDialog(null, "Guardado exctoso.");
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
    public Lista leer_txt(){
        Lista clientes = new Lista();
        String line;
        String clientes_txt="";
        String path = "test\\clientes.txt";
        File file = new File(path);
        try{
            if (!file.exists()){
                file.createNewFile();
            }else{
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null){
                    if (!line.isEmpty()){
                        clientes_txt += line + "\n";
                        
                    }
                }
                if (!"".equals(clientes_txt)){
                    String[] clientes_split = clientes_txt.split("\n");
                    for (int i = 0; i < clientes_split.length; i++) {
                        String[] cliente = clientes_split[i].split("");
                        clientes.appendizar(cliente[0], cliente[1]);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "Lectura exitosa.");
                
            }
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e);
        }return clientes;
    }
   
}
