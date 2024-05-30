package Amazon;
import java.time.LocalDate;


class Aliment extends Producte {
    private LocalDate dataCaducitat;

    public Aliment(int codi, String nom, double preu, LocalDate dataCaducitat) {
        super(codi, nom, preu);
        this.dataCaducitat = dataCaducitat;
    }

    @Override
    public double calcularPreuFinal() {
        LocalDate avui = LocalDate.now();
        long diesRestants = java.time.temporal.ChronoUnit.DAYS.between(avui, dataCaducitat);
        if (diesRestants < 10) {
            return preu * 0.5; 
        }
        return preu;
    }




}
