package gestio_de_notes_dels_alumnes;

public class Principal {
    public static void main(String[] args) {

        GestorNotes gestor = new GestorNotes();

        gestor.registrarNotes("Joan", new double[] { 8.5, 7.2, 9.0 });
        gestor.registrarNotes("Maria", new double[] { 6.0, 5.5, 8.0 });
        gestor.registrarNotes("Pere", new double[] { 9.5, 8.5, 7.0 });
    
        double[] notesJoan = gestor.obtenirNotes("Joan");
        System.out.println("Notes de Joan:");
        for (double nota : notesJoan) {
            System.out.print(nota + " ");
        }
        System.out.println();
    }

}
