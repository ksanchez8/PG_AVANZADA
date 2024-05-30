import java.io.File;
import java.util.Scanner;

public class DirectoryCleaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la ruta de la carpeta:");
        String directoryPath = scanner.nextLine();