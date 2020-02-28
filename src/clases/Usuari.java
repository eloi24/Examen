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
    public abstract void CrearPost(ArrayList<Post>posts,Usuari user);
    public abstract void EliminarPost(ArrayList<Post>posts);
    public abstract void SeguirEditor(ArrayList<Usuari>usuaris);
    public abstract void VeureSegueixo();
    public abstract void VeureSegueixoLector();
    public abstract void MostrarMur(ArrayList<Post>posts);
    public abstract void ModificarLector(ArrayList<Usuari> usuaris);
    public abstract void LlistarEditors(ArrayList<Usuari>usuaris);
    public abstract void LlistarLectors(ArrayList<Usuari>usuaris);
    public abstract void MostrarMurTotal(ArrayList<Post>posts);
    public abstract void SeguirEditorLector(ArrayList<Usuari>usuaris);
    public abstract void MostrarMurLector(ArrayList<Post>posts,ArrayList<Usuari>usuaris);
    

    
}