/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pack1;

/**
 *
 * @author Andres
 */
public class Preparaduria4 {

/* Archivos de texto
    
    PASOS PARA ESCRIBIR UN TXT
    
    1.Verificar que la EDD que vamos a trranscribir no este vacía.
    
    2.Escribir try-catch.
    
    3.Guardar toda la info en un String. 
    a)Seprar los atriburos mediante un ",".
    b)Separar los objetos con un salto de linea.
    c)Si ha más de una EDD se peude separa por títulos.
    
        Los archivos se pueden gaurdadr ocmo txt o como csv, csv solo se pueden poner 
        comas como separadores y abre en excel. En txt puedo separar conlo que quiera.
    
    4.Importar la clase PrintWriter y escoger un nombre para el archivo.
    PrintWriter pw = new PrintWriter("carpeta\\archivo");
    
    5.pw.print(COSA) =====> Sobreescribe
      pw.append(COSA) ====> Añade
    
    6.Cerrar el pw con pw.close()
    
    7.Se guarda en "Test package
   
    EJ en clase Funciones
    
    PASOS PARA LEER:
    
    1.Si al leer llenamos mas de una edd, poedemos crear una clase que tenfa como atributos a nuestra edd.
    
    2.Incializamos vacías nuestras edd.
    
    3.Creamos un String para guardar el cliente.txt
    
        String clietnes_txt = "";
        String path =  "test\\clientes.txt";
    
    4.Importamos File y le psamos nuestro path 
    
        File file = new File(path);
    
    5.Al leer debemos hacerlo dentro de un try-catch.
    
    6.Validamos si el atchivo exista.
    
        if (!file.exists()){
                file.createNewFile();
            }else{
            }
    
    7.Importamos FileReader(es pasamos el File) y BufferReader(le pasamos el FileReader)
    
        FileReader fr = new FileReader(file);
        BufferReader br = new BufferReader(fr);
    
    8.Leemos linea por linea
    
        while ((line = br.readLine()) != null){
            if (!line.isEmpty()){
                clientes_txt += line + "\n";
    
    9. Validar que el string anterior no este vacio
        
        if(!"".equals(clientes_txt)){
        }
    
    10. Hacemos .split() para separar los objetos.
    
    11.Cerramos BudderReader con close()
    
    br.close();:
    
    NOTAS:
    
    1.Si al abrir el archivo .csv en Excel no les separa por columnas.
    a)Datos > Ordenar Datos > Desde un archivo  Desde el texto > CSV
    b) Buscan el archivo.csv
    c)Seleciconan la coma y le dan a Load
    
    2.tener cuiidado si usan títulos en su archivo de texto al leerlo. Puden usar if para evitar tanto 
    aplicarl tantos .split() 
    
    3.Tener en cuenta el orden que se está extrayendo la información de su edd
    
    */
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
}
