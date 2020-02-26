package clases;

import java.time.LocalDateTime;

public class Post{
    String contingut,titol;
    LocalDateTime data;
    Usuari user;
    boolean majors;

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
    
    
}