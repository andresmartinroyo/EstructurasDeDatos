/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioCalculadora;

/**
 *
 * @author Andres
 */
public class Calculadora extends javax.swing.JPanel {

    /**
     * Creates new form Calculadora
     */
    public Calculadora() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        five = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        six = new javax.swing.JButton();
        two = new javax.swing.JButton();
        three = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        minus = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        plus = new javax.swing.JButton();
        multiplication = new javax.swing.JButton();
        division = new javax.swing.JButton();
        dot = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        console = new javax.swing.JLabel();

        setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        four.setText("4");
        add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 120, -1, -1));

        one.setText("1");
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, -1, -1));

        seven.setText("7");
        add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 160, -1, -1));

        eight.setText("8");
        add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 160, -1, -1));

        five.setText("5");
        add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 120, -1, -1));

        nine.setText("9");
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 160, -1, -1));

        six.setText("6");
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 120, -1, -1));

        two.setText("2");
        add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 80, -1, -1));

        three.setText("3");
        add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 80, -1, -1));

        equals.setText("=");
        add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 200, -1, -1));

        minus.setText("-");
        add(minus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, 40, -1));

        zero.setText("0");
        add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 200, -1, -1));

        plus.setText("+");
        add(plus, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 80, 40, -1));

        multiplication.setText("x");
        add(multiplication, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 160, 40, -1));

        division.setText("/");
        add(division, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, 40, -1));

        dot.setText(".");
        add(dot, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 340, -1, -1));

        console.setBackground(new java.awt.Color(255, 255, 255));
        console.setForeground(new java.awt.Color(51, 51, 51));
        console.setOpaque(true);
        add(console, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 40, 190, 30));
    }// </editor-fold>//GEN-END:initComponents

    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_sixActionPerformed

    //El 9
    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if (console.getText().isEmpty()) {
            console.setText("9");
        } else {
            Consola actual = new Consola(console.getText());
            actual.addDigit("9");
            console.setText(actual.toString());
    }//GEN-LAST:event_nineActionPerformed

    }

    //El 1
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
        if (console.getText().isEmpty()) {
            console.setText("1");
        } else {
            Consola actual = new Consola(console.getText());
            actual.addDigit("1");
            console.setText(actual.toString());
        }
    }//GEN-LAST:event_oneActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel console;
    private javax.swing.JButton division;
    private javax.swing.JButton dot;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton minus;
    private javax.swing.JButton multiplication;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton plus;
    private javax.swing.JButton seven;
    private javax.swing.JButton six;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
