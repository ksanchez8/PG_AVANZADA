package figures;

public abstract class Figura2D implements FiguraGeometrica {
    protected String nom;

    public Figura2D(String nom) {
        this.nom = nom;
    }

    public String getNom() {
        return nom;
    }
}
