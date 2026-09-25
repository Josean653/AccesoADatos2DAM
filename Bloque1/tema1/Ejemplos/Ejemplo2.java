package Ejemplos;

import java.io.File;

public class Ejemplo2 {
    public static void main(String[] args) {
        File ficheroO = new File("./Ejemplos/crearFichero.txt");             //Selecciona un archivo existente
        File carpeta = new File("./Ejemplos", "backup");
        carpeta.mkdirs();                                                             //Crear carpeta

        File destino = new File("./Ejemplos/backup/ficheroMovido.txt");     //creamos el archivo de destino

        if (ficheroO.renameTo(destino)) {
            System.out.println("Archivo movido correctamente");
        }else{
            System.out.println("El fichero no se ha movido");
        }
    }
}
