package Ejercicio2;

import java.io.FileReader;
import java.io.LineNumberReader;
import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            LineNumberReader ln = new LineNumberReader(new FileReader("./Ejercicio2/entrada.txt"));
            String linea;

            System.out.println("Introduce la linea que quieres leer (1 - 4)");
            int eleccion = Integer.parseInt(sc.nextLine());

            System.out.println("Has elegido la linea "+eleccion);
            System.out.println("El contenido de la linea es:");

            if (eleccion>=1 && eleccion<=4) {
                while ((linea = ln.readLine()) != null) {
                    if (ln.getLineNumber() == eleccion) {
                        System.out.println(linea);
                    }
                }
            }else{
                System.out.println("Esa linea no existe en el archivo");
            }

            ln.close();
            sc.close();


        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
