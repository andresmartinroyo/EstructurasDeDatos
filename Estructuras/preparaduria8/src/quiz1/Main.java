/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Main {

    public static void main(String[] args) {
        String line;
        Playlist playlistUsuario = new Playlist();
        String musica_txt = "";
        String path = "test\\musica_txt";
        File file = new File(path);

        try {
            if (!file.exists()) {
                file.createNewFile();
            } else {
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr);
                while ((line = br.readLine()) != null) {
                    if (!line.isEmpty()) {
                        musica_txt += line + "\n";
                        if (!"".equals(musica_txt)) {
                            String[] musica_split = musica_txt.split("\n");
                            for (int i = 0; i < musica_split.length; i++) {
                                String[] cancion = musica_split[i].split(",");
                                Cancion musica = new Cancion(Integer.parseInt(cancion[0]), cancion[1], cancion[2], Integer.parseInt(cancion[3]), Integer.parseInt(cancion[4]), cancion[5]);
                                Nodo nodito = new Nodo(musica);
                                playlistUsuario.addToQueue(nodito);
                            }
                        }

                    }
                }
                    br.close();
                    JOptionPane.showMessageDialog(null,"Lectura exitosa!");
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error: \n" + e);
        }
        
        MenuPrincipal newVentana = new MenuPrincipal(playlistUsuario);
        newVentana.setVisible(true);
        
        
    }
    
    

}
