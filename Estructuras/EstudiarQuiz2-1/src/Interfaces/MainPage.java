/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import estudiarquiz2.pkg1.Global;

/**
 *
 * @author Andres
 */
public class MainPage extends javax.swing.JPanel {

    /**
     * Creates new form MainPage
     */
    public MainPage() {
        initComponents();
        this.textBox.setEnabled(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        botonCargarArbol = new javax.swing.JButton();
        BotonCargarRecorrido = new javax.swing.JButton();
        botonComparar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        textBox = new javax.swing.JTextArea();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        botonCargarArbol.setText("Cargar Arbol");
        botonCargarArbol.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCargarArbolActionPerformed(evt);
            }
        });
        add(botonCargarArbol, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, -1, -1));

        BotonCargarRecorrido.setText("Cargar Recorrido");
        BotonCargarRecorrido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCargarRecorridoActionPerformed(evt);
            }
        });
        add(BotonCargarRecorrido, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 50, -1, -1));

        botonComparar.setText("Comparar");
        botonComparar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonCompararActionPerformed(evt);
            }
        });
        add(botonComparar, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 140, -1, -1));

        textBox.setColumns(20);
        textBox.setRows(5);
        jScrollPane1.setViewportView(textBox);

        add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, 710, 260));
    }// </editor-fold>//GEN-END:initComponents

    private void botonCompararActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCompararActionPerformed
        String texto = "";
        textBox.setText(texto);

        if ((Global.arbol != null) && (Global.arbolLeido != null)) {
            texto = "El recorrido del arbol es ";
            Global.comparar();
            if (Global.arbolInorden.equals(Global.arbolLeido)) {
                texto += "en inorden.";
            }
            if (Global.arbolPreorden.equals(Global.arbolLeido)) {
                texto += "en preorden.";
            }
            if (Global.arbolPostorden.equals(Global.arbolLeido)) {
                texto += "en postorden.";
            }
            if (texto.equals("El recorrido del arbol es ")) {
                texto += "diferente el del arbol introducido.";
            }
            texto += "\nLos recorridos del arbol son: \nPreorden:\n"
                    + Global.arbolPreorden + "\nInorden: \n" + Global.arbolInorden
                    + "\nInorden: \n" + Global.arbolInorden;
        } else if (Global.arbol == null) {
            texto = "No se leido todavia ningun arbol.";
        } else if (Global.arbolLeido.equals("")) {
            texto = "No se leido todavia ningun recorrido.";
        }
        textBox.setText(texto);


    }//GEN-LAST:event_botonCompararActionPerformed

    private void botonCargarArbolActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonCargarArbolActionPerformed
        Global.cargarArbol();
    }//GEN-LAST:event_botonCargarArbolActionPerformed

    private void BotonCargarRecorridoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCargarRecorridoActionPerformed
        Global.cargarlectura();
    }//GEN-LAST:event_BotonCargarRecorridoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonCargarRecorrido;
    private javax.swing.JButton botonCargarArbol;
    private javax.swing.JButton botonComparar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea textBox;
    // End of variables declaration//GEN-END:variables
}
