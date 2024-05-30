import java.io.File;
import java.util.Scanner;

public class DirectoryCleaner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la ruta de la carpeta:");
        String directoryPath = scanner.nextLine();

        File directory = new File(directoryPath);

        if (!directory.exists() || !directory.isDirectory()) {
            System.out.println("La ruta especificada no és una carpeta vàlida.");
            return;
        }

        if (deleteDirectoryContents(directory)) {
            System.out.println("El contingut de la carpeta s'ha eliminat correctament.");
        } else {
            System.out.println("No s'ha pogut eliminar el contingut de la carpeta.");
        }

        scanner.close();
    }

    public static boolean deleteDirectoryContents(File directory) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    if (!deleteDirectoryContents(file)) {
                        return false;
                    }
                }

                if (!file.delete()) {
                    System.out.println("No s'ha pogut eliminar: " + file.getPath());
                    return false;
                }

