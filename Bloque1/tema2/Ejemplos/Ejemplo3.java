package Ejemplos;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Ejemplo3 {
    public static void main(String[] args) {
        try {

            //escribir elementos segun su tipo
            DataOutputStream dps = new DataOutputStream(new FileOutputStream("./Ejemplos/salida.txt"));

            dps.writeInt(123);
            dps.writeDouble(123.5);
            dps.writeLong(2341435);
            dps.writeFloat(342.44F);
            dps.close();
            System.out.println("elementos escritos en el archivo");


            //leer elementos 
            DataInputStream dis = new DataInputStream(new FileInputStream("./Ejemplos/salida.txt"));
            int entero = dis.readInt();
            double decimial1 = dis.readDouble();
            long largo = dis.readLong();
            float decimal3 = dis.readFloat();
            dis.close();

            System.out.println("el numero entero es "+entero);


        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
