/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ejercicio12Libro;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ListaClientes lista = new ListaClientes();

        while (true) {
            switch (JOptionPane.showInputDialog("Enter the option you want to do:\n1.Register client.\n2.Delete client\n3.Show clients.")) {
                case "1" -> {
                    try {
                        
                        //id
                        int id = Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s id"));
                        
                        //age
                        int age = Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s age"));
                        
                        //sex
                        int sexI;
                        do {
                            sexI = Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s sex:\n1.M.\n2.F."));
                        } while (sexI != 1 && sexI != 2);
                        String sexS = (sexI == 1) ? "M" : "F";
                        
                        //I.S.
                        int insuranceStatusI;
                        do {
                            insuranceStatusI = Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s I.S.:\n1.T.\n2.F."));
                        } while (insuranceStatusI != 1 && insuranceStatusI != 2);
                        boolean insuranceStatusB = (insuranceStatusI == 1);
                        
                        //study and amount
                        int studyI;
                        do {
                            studyI = Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s syudy: \n1.Ultrasonido.\n2.Tomografía.\n3.Resonancia"));
                        } while (studyI != 1 && studyI != 2 && studyI != 3);
                        String studyS = "";
                        int amount = 0;
                        switch (studyI) {
                            case 1 -> {
                                studyS = "U";
                                amount = 100;
                            }
                            case 2 -> {
                                studyS = "T";
                                amount = 130;
                            }
                            case 3 -> {
                                studyS = "R";
                                amount = 160;
                            }
                                
                                
                        }
                        
                        Cliente nuevo_cliente = new Cliente(id, age, sexS, insuranceStatusB, studyS, amount);
                        
                        lista.append(nuevo_cliente);
                        nuevo_cliente.receipt();
                        
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Ocurrió un error: " + e);
                        
                    }
                }
                    
                    
                case "2" -> lista.deleteID(Integer.parseInt(JOptionPane.showInputDialog("Introduce the client`s id")));
                    
                    
                case "3" -> lista.showClients();
            }

        }

    }

}
