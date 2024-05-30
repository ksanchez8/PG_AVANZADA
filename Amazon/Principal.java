package Amazon;

import java.time.LocalDate;


public class Principal {
    public static void main(String[] args) {
        Botiga botiga = new Botiga();

        Aliment aliment = new Aliment(1, "Pa", 1.0, LocalDate.now().plusDays(5));
        Electrodomestic electrodomestic = new Electrodomestic(2, "Nevera", 500.0, 36);
        Llibre llibre = new Llibre(3, "El Senyor dels Anells", 30.0, "J.R.R. Tolkien", 1200);


