import java.io.FileReader;
import java.io.IOException;

public class excepcionesThrows {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("./Ejemplos/archivo.txt");
        int linea;

            while ((linea = fr.read())!=-1) {
                System.out.print((char)linea);
            }
    }
}
