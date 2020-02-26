package supermercat.templates;

import java.time.LocalDate;

import supermercat.generic.Support;

public class ProdAmbCaducitat extends Producte{
    private LocalDate datacaducitat;

    public ProdAmbCaducitat(String nom, float preu, LocalDate datacaducitat) {
        super(nom, preu);
        this.datacaducitat = datacaducitat;
    }

    @Override
    public String toString() {
        return super.toString()+ " data de caducitat:" + datacaducitat;
    }

    public LocalDate getDatacaducitat() {
        return datacaducitat;
    }

    public void setDatacaducitat(LocalDate datacaducitat) {
        this.datacaducitat = datacaducitat;
    }
   @Override
    public float calcular (int quantitat){
        float preFinal=super.calcular(quantitat);
        int diescaducitat=Support.calcularDies(this.datacaducitat);
        switch(diescaducitat){
            case 1:
            preFinal-= (preFinal*0.75f);
            System.out.println("Descompte: 75%");
            break;
            case 2:
            preFinal-= (preFinal*0.5f);
            System.out.println("Descompte: 50%");
            break;
            case 3:
            preFinal-= (preFinal*0.25f);
            System.out.println("Descompte: 25%");
            break;
            case 4:
            preFinal-= (preFinal*0.10f);
            System.out.println("Descompte: 10%");
            break;
        }
System.out.println("Preu articles:" +preFinal);
return preFinal;
    }
    
}