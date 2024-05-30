package Gestioempleats;

import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        GestionEmpleados gestio = new GestionEmpleados();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Tria una opció:");
            System.out.println("1. Afegir nou empleat");
            System.out.println("2. Buscar empleat per nom");
            System.out.println("3. Llistar tots els empleats");
            System.out.println("4. Sortir");
            int opcio = scanner.nextInt();
            scanner.nextLine();

            switch (opcio) {
                case 1:
                    System.out.println("Introdueix el nom:");
                    String nom = scanner.nextLine();
                    System.out.println("Introdueix el cognom:");
                    String cognom = scanner.nextLine();
                    System.out.println("Introdueix l'edat:");
                    int edat = scanner.nextInt();
                    gestio.afegirEmpleat(nom, cognom, edat);
                    break;
                    
                case 2:
                    System.out.println("Introdueix el nom:");
                    String buscarNom = scanner.nextLine();
                    List<String> empleats = gestio.buscarEmpleat(buscarNom);
                    if (empleats.isEmpty()) {
                        System.out.println("No s'ha trobat cap empleat amb aquest nom.");
                    } else {
                        for (String empleat : empleats) {
                            System.out.println(empleat);
                        }
                    }
                    break;
    
}
