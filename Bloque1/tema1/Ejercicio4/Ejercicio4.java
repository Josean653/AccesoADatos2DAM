package Ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio4 {
    public static void main(String[] args) {

        try {

            int contador = 0;

            int bufferSize = 1024;
            byte[] buffer = new byte[bufferSize];
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("./Ejercicio4/foto.jpg"));

            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("./Ejercicio4/fotoCopia.jpg"));

            int bytesLeidos;

            while ((bytesLeidos = entrada.read(buffer)) != -1){
                salida.write(buffer, 0, bytesLeidos);
                contador++;
            }

            entrada.close();
            salida.close();
            System.out.println(contador);
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

        
    }
}
