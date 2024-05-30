package Amazon;

abstract class Producte {
    protected int codi;
    protected String nom;
    protected double preu;


    public Producte(int codi, String nom, double preu) {
        this.codi = codi;
        this.nom = nom;
        this.preu = preu;
    }

    public abstract double calcularPreuFinal();

    @Override
    public String toString() {
        return "Codi: " + codi + ", Nom: " + nom + ", Preu: " + preu;
    }




}