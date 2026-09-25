package Ejemplos;
import java.io.RandomAccessFile;

public class Ejemplo6 {
    public static void main(String[] args) {

        try {

            //crear el acceso directo a un archivo
            RandomAccessFile file = new RandomAccessFile("./abecedario.txt", "rw");

            //posicionar el cursor en un caracter
            file.seek(5);

            //ver donde esta el puntero
            System.out.println("Puntero antes de leer: "+ file.getFilePointer()); //escribe 5
            
            //leer el primer byte
            int unbyte = file.read();
            
            //ver donde esta el puntero
            System.out.println("Puntero despues de leer: "+ file.getFilePointer()); //escribe 6

            //mostramos el contenido del byte leido
            System.out.println((char)unbyte);

            //Escribir en el byte
            file.write('0');

            //ver donde esta el puntero
            System.out.println("Puntero despues de leer: "+ file.getFilePointer()); //escribe 7



        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
