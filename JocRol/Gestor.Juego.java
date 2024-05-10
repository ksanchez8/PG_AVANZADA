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



}