package Ejercicio1;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            LineNumberReader ln = new LineNumberReader(new FileReader("./Ejercicio1/entrada.txt"));
            String linea;

            while ((linea = ln.readLine()) != null) {
                
                System.out.println("---------- Linea "+ln.getLineNumber()+" ---------- \n"+linea);
                int contPalabras = 0;
                int contNumeros = 0;

                //se crea un token que lea sobre la linea actual (StringReader), no sobre el archivo
                StreamTokenizer token = new StreamTokenizer(new StringReader(linea));

                while (token.nextToken() != StreamTokenizer.TT_EOF) {
                    if (token.ttype == StreamTokenizer.TT_WORD) {
                        contPalabras++;
                    }
                    if (token.ttype == StreamTokenizer.TT_NUMBER) {
                        contNumeros++;
                    }
                }

                System.out.println("Palabras: "+contPalabras+" | Numeros: "+contNumeros+"\n");
            }

            ln.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
