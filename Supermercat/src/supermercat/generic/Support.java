package supermercat.generic;

import java.time.LocalDate;
import java.time.Period;

public class Support{

public static int calcularDies(LocalDate ld){

    Period p = Period.between(LocalDate.now(), ld);
    System.out.println("Dies perquè caduqui: "+p.getDays());
    return p.getDays();
}


}