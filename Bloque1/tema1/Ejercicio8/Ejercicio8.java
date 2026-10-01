package Ejercicio8;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("----- Gestor de Matriculación -----\n[1] Guardar\n[2] Imprimir");
        int eleccion = Integer.parseInt(sc.nextLine());
        if (eleccion == 1) {
            System.out.println("Nombre y apellidos:");
            String nombre = sc.nextLine();
            System.out.println("Email:");
            String email = sc.nextLine();
            System.out.println("Fecha de nacimiento:");
            String fecha = sc.nextLine();
            System.out.println("Genero:");
            String genero = sc.nextLine();
            System.out.println("Titulacion de Acceso:");
            String titulacion = sc.nextLine();
            System.out.println("Observaciones:");
            String observaciones = sc.nextLine();
            String texto = "----- Formulario de Matriculacion -----" +
                    "\nNombre y Apellidos: " + nombre +
                    "\nEmail: " + email +
                    "\nFecha de nacimiento: " + fecha +
                    "\nGenero: " + genero +
                    "\nTitulacion de Acceso: " + titulacion +
                    "\nObservaciones: " + observaciones +
                    "\n---------------------------------------";

            try {
                BufferedWriter bw = new BufferedWriter(new FileWriter("./Ejercicio8/matriculas.txt", true));
                bw.write(texto);
                bw.close();

            } catch (Exception e) {
                System.out.println("Error en la escritura | " + e.getMessage());
            }
        } else if (eleccion == 2) {
            try {
                BufferedReader br = new BufferedReader(new FileReader("./Ejercicio8/matriculas.txt"));

                String linea;

                while ((linea = br.readLine()) != null) {
                    System.out.println(linea);
                }

                br.close();
            } catch (Exception e) {
                // TODO: handle exception
            }
        }
    }
}
