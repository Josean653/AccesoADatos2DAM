import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class excepcionesTryCatch {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("./Ejemplos/archivo.txt");
            int linea;

            while ((linea = fr.read())!=-1) {
                System.out.print((char)linea);
            }
            
            fr.close();

        } catch(FileNotFoundException fnfe){
            System.out.println("No se encuentra el archivo");

        } catch (IOException ioe) {
            System.out.println("Sa roto el reader");
            
        }finally{
            System.out.println("Esto se ejecuta siempre");
        }
    }
}
