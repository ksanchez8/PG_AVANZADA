package gestio_de_notes_dels_alumnes;

public class CalculadoraEstadistiques {
    public static double calcularMitjana(double[] notes) {
        double suma = 0.0;
        for (double nota : notes) {
            suma += nota;
        }
        return suma / notes.length;
    }
}
