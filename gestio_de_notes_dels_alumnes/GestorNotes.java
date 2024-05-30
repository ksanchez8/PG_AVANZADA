package gestio_de_notes_dels_alumnes;

import java.util.HashMap;
import java.util.Map;

public class GestorNotes {
    private Map<String, double[]> registreNotes;

    public GestorNotes() {
        this.registreNotes = new HashMap<>();
    }

    public void registrarNotes(String nomAlumne, double[] notes) {
        registreNotes.put(nomAlumne, notes);
    }
