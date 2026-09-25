package Ejemplos;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Ejemplo4 {
    public static void main(String[] args) {
        try {
            FileReader lector = new FileReader("./Ejemplos/prueba.txt");    //creo el lector
            int data;                                                                //creo la variable donde se guardan los caracteres
            FileWriter fw = new FileWriter("./Ejemplos/escritura.txt");     //creo el escritor

            while ((data = lector.read()) != -1) { // lee hasta que se acaba el archivo
                fw.write((char) data);              //escribe el contenido en otro archivo

            }
            System.out.println("Texto copiado correctamente");
            lector.close();
            fw.close();
        } catch (IOException e) {
            e.getMessage();
        }

    }
}
