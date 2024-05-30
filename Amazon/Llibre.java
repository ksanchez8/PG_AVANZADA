package Amazon;

class Llibre extends Producte {
    private String autor;
    private int numPagines;  

    public Llibre(int codi, String nom, double preu, String autor, int numPagines) {
        super(codi, nom, preu);
        this.autor = autor;
        this.numPagines = numPagines;
    }

    @Override
    public double calcularPreuFinal() {
        if (numPagines > 500) {
            return preu * 1.1; // 10% de recàrrec si té més de 500 pàgines
        }
        return preu;
    }


}
