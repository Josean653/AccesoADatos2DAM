package Ejercicio2;

import java.io.File;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

public class Ejercicio2 {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            factory.setValidating(true);
            factory.setIgnoringElementContentWhitespace(true);

            DocumentBuilder builder = factory.newDocumentBuilder();
            File file = new File("./Ejercicio2/jugadores.xml");

            Document doc = builder.parse(file);
            doc.getDocumentElement().normalize();

            //guardar todos los equipos
            NodeList listaEquipos = doc.getElementsByTagName("team");

            for (int i = 0; i < listaEquipos.getLength(); i++) {
                Node nodoTeam = listaEquipos.item(i);

                if (nodoTeam.getNodeType() == Node.ELEMENT_NODE) {
                    Element elementoTeam = (Element) nodoTeam;

                    //datos de cada equipo
                    String ciudad = elementoTeam.getAttribute("city");
                    String nombreEquipo = elementoTeam.getElementsByTagName("name").item(0).getTextContent();

                    System.out.println("Equipo: " + nombreEquipo + " (" + ciudad + ")");

                    //guardar los jugadores del equipo actual
                    NodeList listaJugadores = elementoTeam.getElementsByTagName("player");

                    for (int j = 0; j < listaJugadores.getLength(); j++) {
                        Element jugador = (Element) listaJugadores.item(j);

                        //datos de cada jugador
                        String nombreJugador = jugador.getElementsByTagName("playerName").item(0).getTextContent();
                        String posicion = jugador.getElementsByTagName("position").item(0).getTextContent();
                        String dorsal = jugador.getElementsByTagName("number").item(0).getTextContent();

                        System.out.println(" - " + nombreJugador + " (" + posicion + ", Dorsal: " + dorsal + ")");
                    }

                    //contar cuantos jugadores tiene el equipo
                    System.out.println("Total de jugadores: " + listaJugadores.getLength()+"\n");
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
