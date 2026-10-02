package Ejemplos;

import java.io.FileReader;
import java.io.LineNumberInputStream;
import java.io.LineNumberReader;

public class Ejemplo2 {
    public static void main(String[] args) {
        try {
            LineNumberReader ln = new LineNumberReader(new FileReader("./Ejemplos/datos.txt"));
            String linea;
            while ((linea = ln.readLine()) != null) {
                System.out.println("Contenido de la linea: "+ln.getLineNumber());
                System.out.println(linea);
            }
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
