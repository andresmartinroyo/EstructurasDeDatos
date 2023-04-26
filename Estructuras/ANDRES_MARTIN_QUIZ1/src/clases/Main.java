/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //leer el txt
        ListaSeries listaSeries = new ListaSeries();
        String line;
        String txt = "";
        String path = "test\\series.txt";
        File file = new File(path);
        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        txt += line + "\n";
                    }
                }
                if (!"".equals(txt) && !txt.isEmpty()) {
                    String[] txt_split = txt.split("%");
                    NodoSeries serie = new NodoSeries();
                    for (int i = 1; i < txt_split.length; i += 2) {
                        String[] datos = txt_split[i].split("/");
                        serie = new NodoSeries(datos[0], datos[1], datos[2]);
                        String[] datosCapitulos = txt_split[i + 1].split("\n");
                        NodoCapitulo capitulo = new NodoCapitulo();
                        for (int j = 1; j <datosCapitulos.length; j++) {
                            String[] capitulosSinBarra = datosCapitulos[j].split("/");
                            capitulo = new NodoCapitulo(capitulosSinBarra[0], capitulosSinBarra[1]);
                            serie.getCapitulos().agregarCapitulo(capitulo);
                        }
                        listaSeries.agregarSerie(serie);
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "lectura exitosa.");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error leyendo el archivo." + e);

        }
        VentanaPrincipal window = new VentanaPrincipal(listaSeries);
        window.setVisible(true);
    }
}
