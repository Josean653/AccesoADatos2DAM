package Ejemplos;

import java.io.File;

public class Ejemplo3 {
    public static void main(String[] args) {
        String nombreCarpeta = "NuevaCarpeta";
        File carpeta = new File("./Ejemplos", nombreCarpeta);

        if (carpeta.exists()) {                                                     //Comprobar que la carpeta existe
            System.out.println("La carpeta "+carpeta.getName()+" ya existe");
        }else{
            carpeta.mkdirs();
            System.out.println("La carpeta "+carpeta.getName()+" se ha creado");    //Obtener el nombre de la carpeta
            System.out.println("Ruta absoluta: "+carpeta.getAbsolutePath());        //Obtener la ruta absoluta
            System.out.println("Ruta relativa: "+carpeta.getPath());                //Obtener la ruta relativa
            System.out.println("Carpeta padre: "+carpeta.getParent());              //Obtener carpeta padre

        }
    }
}
