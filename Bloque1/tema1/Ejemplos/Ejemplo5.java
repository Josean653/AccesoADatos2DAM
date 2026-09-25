package Ejemplos;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Ejemplo5 {
    public static void main(String[] args) {
        try {
            FileInputStream foto = new FileInputStream("./Ejemplos/foto1.png");
            int data;
            FileOutputStream foto2 = new FileOutputStream("./Ejemplos/copiaFoto.png");

            while ((data = foto.read()) != -1) {
                foto2.write(data);
            
            }

            System.out.println("Imagen copiada correctamente");
            foto.close();
            foto2.close();
        } catch (Exception e) {
            
            e.getMessage();
        }
    }
}
