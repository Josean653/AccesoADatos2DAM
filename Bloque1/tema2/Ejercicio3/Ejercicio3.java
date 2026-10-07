package Ejercicio3;

import java.io.InputStream;
import java.io.StreamTokenizer;
import java.io.StringReader;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            String lista = "Pan 1.5 Leche 1 Huevos 2.25";
            double totalPrecio = 0;
    
            StreamTokenizer token = new StreamTokenizer(new StringReader(lista));
    
            while (token.nextToken() != StreamTokenizer.TT_EOF) {
                if (token.ttype == StreamTokenizer.TT_WORD) {
                    System.out.print(token.sval+": ");
                }
                if (token.ttype == StreamTokenizer.TT_NUMBER) {
                    System.out.println(token.nval);
                    totalPrecio += token.nval;
                }
            }

            System.out.println("TOTAL: "+totalPrecio);
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
