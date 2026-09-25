package Ejemplos;
import java.io.File;

public class Ejemplo1 {
    public static void main(String[] args) {

        try {
            File fichero = new File("./Ejemplos/crearFichero.txt");
            if (fichero.createNewFile()) {
                System.out.println("Fichero creado: " + fichero.getName());
            } else {
                System.out.println("Error al crear el fichero");
            }

        } catch (Exception e) {
            System.out.println("Se ha roto || " + e.getMessage());
        }
    }
}
