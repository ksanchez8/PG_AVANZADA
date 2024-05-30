import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {
    public void afegirEmpleat(String nom, String cognom, int edat) {
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("empleats.txt", true))) {
            bw.write(nom + "," + cognom + "," + edat);
            bw.newLine();
        } catch (IOException e) {
            System.out.println("Error afegint empleat: " + e.getMessage());
        }
    }

    public List<String> buscarEmpleat(String nom) {
        List<String> empleats = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader("empleats.txt"))) {
            String linia;
            while ((linia = br.readLine()) != null) {
                if (linia.startsWith(nom + ",")) {
                    empleats.add(linia);
                }
            }
        } catch (IOException e) {
            System.out.println("Error buscant empleat: " + e.getMessage());
        }
        return empleats;
    }

