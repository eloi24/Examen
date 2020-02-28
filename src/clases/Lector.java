package clases;

import java.util.ArrayList;

import functions.Funcions;

public class Lector extends Usuari {
    boolean major;

    public boolean isMajor() {
        return major;
    }

    public void setMajor(boolean major) {
        this.major = major;
    }

    public Lector(String nomusuari, String passwd, boolean major) {
        super(nomusuari, passwd);
        this.major = major;
    }

    @Override
    public void LlistarEditors(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void LlistarLectors(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void ModificarLector(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void MostraMenu() {
        System.out.println("1 - SEguir a un Editor nou");
        System.out.println("2 - Veure els editors que segueixo ");
        System.out.println("3 - Mirar el teu mur ");
        System.out.println("0 - Sortir");
    }

    @Override
    public void MostrarMur(ArrayList<Post> posts) {

    }

    @Override
    public void SeguirEditor(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void VeureSegueixoLector() {
        System.out.println("Editos seguits per " + this.nomusuari);
        System.out.println("------------------------------------");
        for (Usuari u : this.follows) {
            System.out.println(u.getNomusuari());

        }
    }

    @Override
    public void EliminarPost(ArrayList<Post> posts) {

    }

    @Override
    public void CrearPost(ArrayList<Post> posts, Usuari user) {

    }

    @Override
    public void MostrarMurTotal(ArrayList<Post> posts) {

    }

    @Override
    public void SeguirEditorLector(ArrayList<Usuari> usuaris) {
       Funcions.SeguirEditor(usuaris, follows);

    }

    @Override
    public void MostrarMurLector(ArrayList<Post> posts,ArrayList<Usuari>usuaris) {
        for (Post p : posts) {
            if (p.getUser().getClass().getSimpleName().equals("Admin")) {
                if(p.majors==true){
                    if(this.major==true){
                       p.MostraPost();

                    }else{
                       System.out.println("Contingut restringit a menors");
                    }
                }else if(p.majors==false){
                    p.MostraPost();
                }            }
            
        }
        
        for (Usuari u : this.follows) {
            for (Post p : posts) {
                 if (u.getNomusuari().equals(p.getUser().getNomusuari())){
                 if(p.majors==true){
                     if(this.major==true){
                         
                        p.MostraPost();

                     }else{
                        System.out.println("Contingut restringit a menors");
                     }
                 }else if(p.majors==false){
                     p.MostraPost();
                 }
                     
                 

                 } 
                    
                }

            }

        }
    

    @Override
    public void VeureSegueixo() {

    }
    
}