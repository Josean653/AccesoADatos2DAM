package Ejercicio4;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio4 {
    public static void main(String[] args) {

        try {

            int bufferSize = 4*1024;
            byte[] buffer = new byte[bufferSize];
            BufferedInputStream entrada = new BufferedInputStream(new FileInputStream("./Ejercicio4/foto.jpg"), bufferSize);

            BufferedOutputStream salida = new BufferedOutputStream(new FileOutputStream("./Ejercicio4/fotoCopia.jpg"), bufferSize);

            int bytesLeidos = entrada.read(buffer);

            while (bytesLeidos != -1){
                salida.write(buffer, 0, bytesLeidos);
                bytesLeidos = entrada.read(buffer);
            }

            entrada.close();
            salida.close();
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }
    }
}
