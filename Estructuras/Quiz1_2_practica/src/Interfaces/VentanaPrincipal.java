/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import javax.swing.JOptionPane;
import Clases.AsosiacionVecinos;
import Clases.ListaApartamentos;
import Clases.ListaEdificios;
import Clases.ListaHabitantes;
import Clases.ListaVecinos;
import Clases.NodoApartamento;
import Clases.NodoEdificio;
import Clases.NodoVecino;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Andres
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public static AsosiacionVecinos av;

    /**
     * Creates new form VentanaPrincipal
     */
    public VentanaPrincipal() {
        initComponents();
        av = new AsosiacionVecinos();
        this.setLocationRelativeTo(null);
//        leer_txt();
        this.setVisible(true);
    }

    public void leer_txt() throws IOException {
        String line;
        String txt = "";
        String path = "test\\asociacion_vecinos.txt";
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
                    String[] txt_split = txt.split("\n");
                    NodoEdificio edificio = null;
                    for (int i = 0; i < txt_split.length; i++) {
                        if ((!txt_split[i].contains(",")) && (!txt_split[i].isEmpty())) {
                            edificio = new NodoEdificio(txt_split[i]);
                            av.getListaDeEdificios().agregarEdificio(edificio);
                        } else if ((txt_split[i].contains(",")) && (!txt_split[i].isEmpty())) {
                            String[] apartamento_split = txt_split[i].split(",");
                            NodoApartamento apartamento = new NodoApartamento(apartamento_split[0]);
                            if (edificio.getApartamentos().getSize() == 0) {
                                apartamento.setNombreEdificio(edificio.getNombre());
                                edificio.getApartamentos().agregarApartamento(apartamento);
                            } else {
                                edificio.getApartamentos().agregarApartamento(apartamento);
                            }
                            for (int j = 0; j < apartamento_split.length; j++) {
                                if (apartamento_split[j].contains("/")) {
                                    String[] vecino_split = apartamento_split[j].split("/");
                                    NodoVecino vecino = new NodoVecino(vecino_split[0], Integer.parseInt(vecino_split[1]), vecino_split[2]);
                                    av.getListaDeVecinos().agregarVecino(vecino);
                                    if (apartamento.getHabitantes().getSize() == 0) {
                                        vecino.setApartamento(apartamento);
                                        apartamento.getHabitantes().agregarHabitante(vecino);
                                    } else {
                                        apartamento.getHabitantes().agregarHabitante(vecino);
                                    }

                                }
                            }

                        }
                    }
                }
                br.close();
                JOptionPane.showMessageDialog(null, "lectura exitosa.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Ocurrió un error leyendo el archivo." + e);

        }
    }
    
    public void escribir_txt(){
        String asociacion_vecinos ="";
        if (!av.getListaDeEdificios().esVacio()){
            NodoEdificio edificio = av.getListaDeEdificios().getpFirst();
            for (int i = 0; i < av.getListaDeEdificios().getSize(); i++) {
                asociacion_vecinos += edificio.getNombre() + "\n";
                NodoApartamento apartamento = edificio.getApartamentos().getpFirst();
                for (int j = 0; j < edificio.getApartamentos().getSize(); j++) {
                    asociacion_vecinos += apartamento.getNumeroApartamento() +",";
                    NodoVecino habitantes = apartamento.getHabitantes().getpFirst();
                    if (apartamento.getHabitantes().getSize()==0){
                        asociacion_vecinos += "APARTAMENTO LIBRE";
                    }else{
                        for (int k = 0; k < apartamento.getHabitantes().getSize(); k++) {
                            asociacion_vecinos += habitantes.getNombre() + "/" + habitantes.getCedula() + "/" +habitantes.getTelefono();
                            habitantes = habitantes.getpNextHabitante();
                        }
                        asociacion_vecinos += "\n";
                        apartamento = apartamento.getpNext();
                    }
                    edificio = edificio.getpNext();
                    
                }
            }
            try{
                PrintWriter pw = new PrintWriter("test\\asociacion_vecinos.txt");
                pw.print(asociacion_vecinos);
                pw.close();
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,"Error.");
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        cedulaBox = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setText("Introduce la cédula de un vecino:");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 110, -1, -1));
        getContentPane().add(cedulaBox, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 180, -1));

        jButton1.setText("Buscar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            int cedula = Integer.parseInt(cedulaBox.getText());
            leer_txt();
            String texto = av.direccionVecino(cedula);
            if (!texto.isEmpty()) {
                JOptionPane.showMessageDialog(null, texto);
            } else {
                JOptionPane.showMessageDialog(null, "No se ha encontrado al vecino.");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Por favor, solo ingresar números: " + e);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cedulaBox;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
