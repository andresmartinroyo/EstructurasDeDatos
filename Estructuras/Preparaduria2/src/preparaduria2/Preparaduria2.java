/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package preparaduria2;

import javax.swing.JOptionPane;

/**
 *
 * @author Andres
 */
public class Preparaduria2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        //Try-catch
//        try {
//            
//            int x = Integer.parseInt(JOptionPane.showInputDialog("Introduce un numero: "));
//            System.out.println("Funciono: " + x);
//            
//        }catch (Exception e) {
//            
//           //Puedo poner mas de un catch para que me muestre los distintos errores
//            
//            System.out.println(e);
//        }
        //Procediminetos
//        Functions function = new Functions();
//        function.imprimir("hola");
        //Metodos
//        Functions function = new Functions();
//        System.out.println(function.multiplicarPorTres(8));
        //Lista
//        Lista mylist = new Lista();
//        
//        mylist.AppendToLast(7);
//        mylist.AppendToLast(8);
//        mylist.AppendToLast(9);
//        mylist.AppendToLast(10);
//        mylist.AppendToLast(11);
//        mylist.AppendToLast(12);
//        
//        mylist.PrintList();
//        System.out.println("");
//       
//        mylist.DeleteFirst();
//        mylist.PrintList();
//        Lista listica = new Lista();
//
//        listica.Insertar_Inicio(5);
//        listica.Insertar_Inicio(4);
//        listica.Insertar_Inicio(3);
//        listica.Insertar_Inicio(2);
//        listica.Insertar_Inicio(1);
//
//        listica.Imprimir();
//        System.out.println("");
//
//        listica.Eliminar_Final();
//        listica.Imprimir();
//        System.out.println("");
//        
//        listica.Eliminar_Inicio();
//        listica.Imprimir();
//        System.out.println("");

        String texto = "%The Umbrella Academy/ La muerte de su padre reúne a unos hermanos distanciados y con extraordinarios poderes que descubren impactantes secretos y una amenaza que se cierne sobre la humanidad/infantil%\n" +
"Solo nos vemos en los casamientos o velorios/ Tras saltar a la fama como jóvenes superhéroes que luchan contra el crimen, los hermanos Hargreeves se reencuentran tras la muerte de su padre\n" +
"Run Boy Run/ Tras compartir la historia de su viaje en el tiempo con Vanya Cinco busca a la persona que perdio una protesis ocular, pero dos asesinos misteriosos le pisan los talones\n" +
"Extra Ordinaria/ Luther y Allison sospechan de su madre y convocan una reunión familiar Por su parte, Cha-Cha y Hazel tienen una gran oportunidad mientras buscan a Cinco\n" +
"%Heartstopper/ Los adolescentes Charlie y Nick descubren que su improbable amistad podría ser algo más mientras navegan por la escuela y el amor juvenil./adulto%";
        String[] series_split = texto.split("%");
        System.out.println(series_split[2]);
        
        
    }

}
