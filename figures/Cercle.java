package figures;

public class Cercle {
    private double radi;

    public Cercle(String nom, double radi) {
        super(nom);
        this.radi = radi;
    }

    public double calcularArea() {
        return Math.PI * radi * radi;
    }

    public double calcularPerimetre() {
        return 2 * Math.PI * radi;
    }
}
}
