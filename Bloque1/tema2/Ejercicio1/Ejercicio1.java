package Ejercicio1;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            StreamTokenizer token = new StreamTokenizer(new FileReader("./Ejercicio1/entrada.txt"));
            int contPalabras = 0;
            int contNumeros = 0;
            LineNumberReader ln = new LineNumberReader(new FileReader("./Ejercicio1/entrada.txt"));

            while (token.nextToken() != StreamTokenizer.TT_EOF) {
                if (condition) {
                    
                }
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
