package clases;

import java.util.ArrayList;

public  abstract class Usuari{
    protected String nomusuari,passwd;
    protected ArrayList<Usuari> follows= new ArrayList<>();

    public Usuari(String nomusuari, String passwd) {
        this.nomusuari = nomusuari;
        this.passwd = passwd;
    }

    public String getNomusuari() {
        return nomusuari;
    }

    public void setNomusuari(String nomusuari) {
        this.nomusuari = nomusuari;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public ArrayList<Usuari> getFollows() {
        return follows;
    }

    public void setFollows(ArrayList<Usuari> follows) {
        this.follows = follows;
    }
    public abstract void MostraMenu();
    public abstract void CrearPost();
    public abstract void EliminarPost();
    public abstract void SeguirEditor();
    public abstract void VeureSegueixo();
    public abstract void MostrarMur();
    public abstract void ModificarLector();
    public abstract void LlistarEditors();
    public abstract void LlistarLectors();
    
}