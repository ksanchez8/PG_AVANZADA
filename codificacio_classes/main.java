import media.media;

public class Main {
    public static void main(String[] args) {
        Media mitjana = new Media();

        mitjana.setNom("Títol de la Mitjana");
        mitjana.setAutor("Nom de l'Autor");
        mitjana.setDurada(120);

        System.out.println("Nom de la mitjana: " + mitjana.getNom());
        System.out.println("Autor de la mitjana: " + mitjana.getAutor());
        System.out.println("Durada de la mitjana (en segons): " + mitjana.getDurada());
    }
}
