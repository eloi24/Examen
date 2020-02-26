package clases;

import java.util.ArrayList;

public class Lector extends Usuari {
    boolean major;

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    public Lector(String nomusuari, String passwd) {
        super(nomusuari, passwd);
    }

   

    @Override
    public void LlistarEditors() {
        // TODO Auto-generated method stub

    }

    @Override
    public void LlistarLectors() {
        // TODO Auto-generated method stub

    }

    @Override
    public void ModificarLector() {
        // TODO Auto-generated method stub

    }

    @Override
    public void MostraMenu() {
        // TODO Auto-generated method stub

    }

    @Override
    public void MostrarMur(ArrayList<Post>posts) {
        // TODO Auto-generated method stub

    }

    @Override
    public void SeguirEditor() {
        // TODO Auto-generated method stub

    }

    @Override
    public void VeureSegueixo() {
        // TODO Auto-generated method stub

    }

    @Override
    public void EliminarPost(ArrayList<Post>posts) {
        // TODO Auto-generated method stub

    }

    @Override
    public Post CrearPost(Usuari user) {
        // TODO Auto-generated method stub
        return null;
    }

    
}