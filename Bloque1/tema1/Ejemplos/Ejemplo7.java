package Ejemplos;

import java.io.RandomAccessFile;

public class Ejemplo7 {

    public static void main(String[] args) {
        try {
            //creo el objeto del archivo
            RandomAccessFile file = new RandomAccessFile("./Ejemplos/abecedario.txt", "r");

            //me posiciono en la posicion 5 del archivo
            file.seek(5);

            //creo un array para guardar los bytes
            byte[] arrayBytes = new byte[3];

            //leo los bytes y los guardo en el array (empieza en la posicon 0 del array y voy a guardar 3 datos)
            file.read(arrayBytes, 0, 3);

            //Comprobaciones
            System.out.println("Bytes leidos: " + arrayBytes.length);

            System.out.println("Puntero despues del read: " + file.getFilePointer());

            System.out.println("\nContenido del array: ");

            for (int i = 0; i < arrayBytes.length; i++) {
                System.out.println("  arrayBytes[" + i + "] = " + arrayBytes[i] + " -> '" + (char) arrayBytes[i] + "'");
            }

        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}