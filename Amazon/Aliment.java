package Amazon;
import java.time.LocalDate;


class Aliment extends Producte {
    private LocalDate dataCaducitat;

    public Aliment(int codi, String nom, double preu, LocalDate dataCaducitat) {
        super(codi, nom, preu);
        this.dataCaducitat = dataCaducitat;
    }


}
