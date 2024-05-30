package GestiodeBiblioteca;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class GestioBiblioteca {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connexió a la base de dades establerta.");

            inserirAutor(conn, "Isaac", "Asimov");
            inserirLlibre(conn, "Foundation", 1951, 4);

       obtenirLlibresAutor(conn, 4);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }     

    public static void inserirAutor(Connection conn, String nom, String cognom) {
        String sql = "INSERT INTO Autor (nom, cognom) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            pstmt.executeUpdate();
            System.out.println("Autor inserit correctament.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirLlibre(Connection conn, String titol, int anyPublicacio, int autorId) {
        String sql = "INSERT INTO Llibre (titol, anyPublicacio, autorId) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titol);
            pstmt.setInt(2, anyPublicacio);
            pstmt.setInt(3, autorId);
            pstmt.executeUpdate();
            System.out.println("Llibre inserit correctament.");
        } catch (SQLException e) {
            e.printStackTrace();
        }

    }

    public static void obtenirLlibresAutor(Connection conn, int autorId) {
        String sql = "SELECT * FROM Llibre WHERE autorId = ?";
}
