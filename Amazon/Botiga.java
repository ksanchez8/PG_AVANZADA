package Amazon;

import java.util.ArrayList;
import java.util.List;

class Botiga {
    private List<Producte> productes;

    public Botiga() {
        this.productes = new ArrayList<>();
    }

    public void afegirProducte(Producte producte) {
        productes.add(producte);
    }

}
