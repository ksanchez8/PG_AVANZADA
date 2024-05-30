package GestiodeBiblioteca;

public class GestioBiblioteca {
    private static final String DB_URL = "jdbc:mysql://localhost:3306/biblioteca";
    private static final String USER = "root";
    private static final String PASS = "password";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS)) {
            System.out.println("Connexió a la base de dades establerta.");

            inserirAutor(conn, "Isaac", "Asimov");
            inserirLlibre(conn, "Foundation", 1951, 4);

