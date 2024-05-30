package Amazon;

class Electrodomestic extends Producte {
    private int mesosGarantia;

    public Electrodomestic(int codi, String nom, double preu, int mesosGarantia) {
        super(codi, nom, preu);
        this.mesosGarantia = mesosGarantia;
    }


}
