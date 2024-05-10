package juego;

import javax.xml.parsers.*;
import org.w3c.dom.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestorJuego {
    public static List<Personaje> cargarPersonajesDesdeXML(String rutaArchivo) {
        List<Personaje> personajes = new ArrayList<>();

        try {

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document document = builder.parse(new File(rutaArchivo));
            document.getDocumentElement().normalize();

            NodeList nodeList = document.getElementsByTagName("personaje");

            for (int i = 0; i < nodeList.getLength(); i++) {
                Element element = (Element) nodeList.item(i);
                String nombre = element.getElementsByTagName("nombre").item(0).getTextContent();
                int nivel = Integer.parseInt(element.getElementsByTagName("nivel").item(0).getTextContent());
                int puntosDeVida = Integer.parseInt(element.getElementsByTagName("puntosDeVida").item(0).getTextContent());
                int puntosDeMana = Integer.parseInt(element.getElementsByTagName("puntosDeMana").item(0).getTextContent());




}