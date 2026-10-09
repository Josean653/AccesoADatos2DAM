package Ejercicio1;
import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ejercicio1 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File("./Ejemplos/fichero.xml");

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            // obtener todas las bibliotecas
            NodeList listaBibliotecas = doc.getElementsByTagName("library");

            for (int i = 0; i < listaBibliotecas.getLength(); i++) {
                Node nodoLib = listaBibliotecas.item(i);

                if (nodoLib.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoLib = (Element) nodoLib;

                    // obtener nombre y ubicacion
                    String ubicacion = elementoLib.getAttribute("location");
                    String nombre = elementoLib.getElementsByTagName("name").item(0).getTextContent();

                    System.out.println("Biblioteca: " + nombre + " (" + ubicacion + ")");

                    // obtener libros de la biblioteca
                    NodeList listaLibros = elementoLib.getElementsByTagName("book");

                    for (int j = 0; j < listaLibros.getLength(); j++) {
                        Element libro = (Element) listaLibros.item(j);

                        String titulo = libro.getElementsByTagName("title").item(0).getTextContent();
                        String autor = libro.getElementsByTagName("author").item(0).getTextContent();
                        String anio = libro.getElementsByTagName("year").item(0).getTextContent();

                        System.out.println(" - " + titulo + " (" + autor + ", " + anio + ")");
                    }

                    // total de libros
                    System.out.println("Total de libros: " + listaLibros.getLength()+"\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}