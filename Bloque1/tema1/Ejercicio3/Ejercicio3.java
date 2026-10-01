package Ejercicio3;

import java.io.FileWriter;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        try {
            String abecedario = "ABCDEFGHIJKLMNÑOPQRSETUVWXYZ";
            String fichero = "./Ejercicio3/abecedario.txt";
            FileWriter fw = new FileWriter(fichero, false);
            fw.write(abecedario);
            fw.close();

            Scanner sc = new Scanner(System.in);
            System.out.println("Indica la posicion");
            int pos = Integer.parseInt(sc.nextLine());

            System.out.println("Indica el caracter");
            char caracter = sc.nextLine().charAt(0);

            RandomAccessFile raf = new RandomAccessFile(fichero, "rw");
            raf.seek(pos);
            raf.write(caracter);

            raf.close();
            sc.close();

            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
