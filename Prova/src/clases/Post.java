package clases;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Post {
    String contingut, titol;
    LocalDateTime data;
    Usuari user;
    boolean majors;
    static DateTimeFormatter dtf2 = DateTimeFormatter.ofPattern("dd/MM/yyyy - HH:mm");

    public String getContingut() {
        return contingut;
    }

    public void setContingut(String contingut) {
        this.contingut = contingut;
    }

    public String getTitol() {
        return titol;
    }

    public void setTitol(String titol) {
        this.titol = titol;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public Usuari getUser() {
        return user;
    }

    public void setUser(Usuari user) {
        this.user = user;
    }

    public boolean isMajors() {
        return majors;
    }

    public void setMajors(boolean majors) {
        this.majors = majors;
    }

    public Post(String contingut, String titol, LocalDateTime data, Usuari user, boolean majors) {
        this.contingut = contingut;
        this.titol = titol;
        this.data = data;
        this.user = user;
        this.majors = majors;
    }

    public void MostraPost() {
        System.out.println("*****************************************");
        System.out.println("Data: " + dtf2.format(this.data));
        System.out.println("Autor: " + this.getUser().getNomusuari());
        System.out.println("+ 18 ? " + this.majors);
        System.out.println("Títol: " + this.titol);
        System.out.println("Contingut: " + this.contingut);
        System.out.println("*****************************************");
        System.out.println();
    }
    public String MostraPost2(){
        return(" - Data: " + dtf2.format(this.data)+ " - "+"Autor: "+this.getUser().getNomusuari()+" - "+" Títol: "+this.titol);
    }

}