package Ejercicio6;

import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //pideo el numero del asiento que quiere
        System.out.println("Elige tu numero de asiento (0-19)");
        int asiento = Integer.parseInt(sc.nextLine());
        if (asiento>=0 && asiento<=19) {
            try {

                //me dirijo al archivo
                RandomAccessFile file = new RandomAccessFile("./Ejercicio6/asientos.txt", "rw");

                //situo el puntero en el asiento elegido
                file.seek(asiento);

                //leo el contenido de esa posicion
                int letra = file.read();

                //si esta libre, vuelvo a poner le puntero en la posicion (porque se habra movio al leer) y escribo
                if ((char)letra == 'L') {
                    System.out.println("Asiento asignado correctamente");
                    file.seek(asiento);
                    file.write('C');
                }else{
                    System.out.println("Este asiento ya está ocupado");
                }

                file.close();

            } catch (Exception e) {
                // TODO: handle exception
            }
        }else{
            System.out.println("El asiento "+asiento+" no está disponible");
        }

    }
}
