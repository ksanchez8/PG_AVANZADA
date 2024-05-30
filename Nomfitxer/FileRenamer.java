import java.io.File;
import java.util.Scanner;

public class FileRenamer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Introdueix la ruta del fitxer:");
        String filePath = scanner.nextLine();

        File file = new File(filePath);

        if (!file.exists()) {
            System.out.println("El fitxer especificat no existeix.");
            return;
        }

        String fileName = file.getName();
        int lastDotIndex = fileName.lastIndexOf('.');
        String newFileName = (lastDotIndex == -1) ? fileName : fileName.substring(0, lastDotIndex);

        String fileDir = file.getParent();

        File newFile = new File(fileDir, newFileName);

        if (file.renameTo(newFile)) {
            System.out.println("El fitxer s'ha reanomenat correctament a: " + newFile.getPath());
        } else {
            System.out.println("No s'ha pogut reanomenar el fitxer.");
        }

        scanner.close();
    }
}