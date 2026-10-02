package Ejemplos;

import java.io.FileReader;
import java.io.StreamTokenizer;

public class Ejemplo1 {
    public static void main(String[] args) {
        try {
            StreamTokenizer streamTokenizer = new StreamTokenizer(new FileReader("./Ejemplos/datos.txt"));

            //detecta los saltos de linea que haya en el archivo
            streamTokenizer.eolIsSignificant(true);

            int contadorPalabras = 0;
            int contadorNumeros = 0;

            //recorre el archivo que se ha dato en el streamTokenizer hasta el final del archivo
            while (streamTokenizer.nextToken() != StreamTokenizer.TT_EOF) {

                //si el tipo del token es texto
                if (streamTokenizer.ttype == StreamTokenizer.TT_WORD) {
                                                    //valor del token
                    System.out.println(streamTokenizer.sval);                       // token de tipo palabra
                    contadorPalabras++;

                    //si el tipo del token es numero
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println(streamTokenizer.nval);                       // token de tipo número
                    contadorNumeros++;

                    //si es la ultima linea
                } else if (streamTokenizer.ttype == StreamTokenizer.TT_EOL) {
                    System.out.println();                                                       // fin de línea
                }
            }

            System.out.println("Palabras: "+contadorPalabras+"\nNumeros: "+contadorNumeros);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
