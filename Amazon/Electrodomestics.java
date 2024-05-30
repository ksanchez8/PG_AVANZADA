package Amazon;

class Electrodomestic extends Producte {
    private int mesosGarantia;

    public Electrodomestic(int codi, String nom, double preu, int mesosGarantia) {
        super(codi, nom, preu);
        this.mesosGarantia = mesosGarantia;
    }

    @Override
    public double calcularPreuFinal() {
        if (mesosGarantia > 24) {
            return preu * 1.2; // 20% de recàrrec si la garantia és més de 24 mesos
        }
        return preu;
    }


}
