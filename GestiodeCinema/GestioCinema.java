import java.sql.*;

public class GestioCinema {

    private static final String DB_URL = "jdbc:mysql://localhost:3306/cinema";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {
        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connexió a la base de dades establerta.");

            // Inserir un nou director
            inserirDirector(conn, "James", "Cameron");

            // Inserir una nova pel·lícula
            inserirPelicula(conn, "Avatar", 2009, 4);

            // Recuperar pel·lícules d'un director
            obtenirPeliculesDirector(conn, 4);

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirDirector(Connection conn, String nom, String cognom) {
        String sql = "INSERT INTO Director (nom, cognom) VALUES (?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, nom);
            pstmt.setString(2, cognom);
            pstmt.executeUpdate();
            System.out.println("Director inserit correctament.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void inserirPelicula(Connection conn, String titol, int anyEstrena, int directorId) {
        String sql = "INSERT INTO Pelicula (titol, anyEstrena, directorId) VALUES (?, ?, ?)";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(1, titol);
            pstmt.setInt(2, anyEstrena);
            pstmt.setInt(3, directorId);
            pstmt.executeUpdate();
            System.out.println("Pel·lícula inserida correctament.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void obtenirPeliculesDirector(Connection conn, int directorId) {
        String sql = "SELECT * FROM Pelicula WHERE directorId = ?";

        try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, directorId);
            ResultSet rs = pstmt.executeQuery();

            while (rs.next()) {
                int id = rs.getInt("id");
                String titol = rs.getString("titol");
                int anyEstrena = rs.getInt("anyEstrena");
                System.out.println("ID: " + id + ", Títol: " + titol + ", Any d'estrena: " + anyEstrena);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}