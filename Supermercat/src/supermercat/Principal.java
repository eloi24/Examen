package supermercat;

import java.time.LocalDate;
import java.util.ArrayList;

import supermercat.templates.ProdAmbCaducitat;
import supermercat.templates.*;

public class Principal{
    public static void main(String[] args) {
        ArrayList<Producte> alp = new ArrayList<>();
        alp.add(new Producte("Producte 1", 3.3f));
        alp.add(new ProdAmbCaducitat("Producte 2", 3.3f, LocalDate.of(2020, 2, 22)));
        alp.add(new ProdSenseCaducitat("Producte 3", 3.3f, "Moble"));



float preufinal=0;
        for (Producte pr : alp) {
        preufinal+=pr.calcular(10);
        }

    }
    
}