package Ejercicio5;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejercicio5 {
    public static void main(String[] args) {
        try {

            FileInputStream fis = new FileInputStream("./Ejercicio5/foto.jpg");
            FileOutputStream fos = new FileOutputStream("./Ejercicio5/fotoCopiaFile.jpg");

            int data;

            long inicio1 = System.currentTimeMillis();
            while ((data = fis.read())!= -1) {
                fos.write(data);
            }
            long fin1 = System.currentTimeMillis();


            System.out.println("FileInputStream: "+ (fin1-inicio1) + " ms");
            
            fos.close();
            fis.close();
            
        } catch (Exception e) {
            System.out.println("Error "+e.getMessage());
        }

        try {
            BufferedInputStream bis = new BufferedInputStream(new FileInputStream("./Ejercicio5/foto.jpg"));
            BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("./Ejercicio5/fotoCopiaBuffered.jpg"));

            //tamaño de los bloques que voy a leer
            byte[] buffer = new byte[4096];
            int bytesLeidos;

            long inicio2 = System.currentTimeMillis();

            while ((bytesLeidos = bis.read(buffer)) != -1) {
                // array donde se guardan / posicion en la que empieza a guardar / posicion en la que acaba de guardar
                bos.write(buffer, 0, bytesLeidos);
            }
            long fin2 = System.currentTimeMillis();
            
            System.out.println("BufferedInputStream: "+ (fin2 - inicio2) + " ms");
            bos.close();
            bis.close();
            
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
