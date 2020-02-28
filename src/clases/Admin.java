package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import functions.Funcions;

public class Admin extends Usuari {

    public Admin(String nomusuari, String passwd) {
        super(nomusuari, passwd);
    }

    @Override
    public void MostraMenu() {
        System.out.println("1 - Crear un post");
        System.out.println("2 - Llistar tots els posts");
        System.out.println("3 - Eliminar un post");
        System.out.println("4 - Modificar un Lector a Editor");
        System.out.println("5 - Llistar Editors");
        System.out.println("6 - Llistar Lectors");
        System.out.println("0 - Log Out");
    }

    @Override
    public void CrearPost(ArrayList<Post> posts, Usuari user) {
        posts.add(Funcions.CrearPost(posts, user));
    }

    @Override
    public void LlistarEditors(ArrayList<Usuari> usuaris) {
        Funcions.MostraUsuaris("Editor", usuaris);
    }

    @Override
    public void LlistarLectors(ArrayList<Usuari> usuaris) {
        Funcions.MostraUsuaris("Lector", usuaris);

    }

    @Override
    public void ModificarLector(ArrayList<Usuari> usuaris) {
        String nomusuari = Funcions.MostraSegueixEditors(usuaris, "Lector");
        if (this.nomusuari.equals(nomusuari)) {
            System.out.println("L'administrador no pot perdre el rol");
        } else {
            Funcions.LectorAEditor(usuaris, Funcions.BuscaUser(usuaris, nomusuari));
        }
    }

    @Override
    public void MostrarMurTotal(ArrayList<Post> posts) {
        for (Post p : posts) {
           System.out.println("Post nº "+ posts.indexOf(p)+1);
            p.MostraPost();
        }

    }

    @Override
    public void SeguirEditor(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void VeureSegueixo() {

    }

    @Override
    public void EliminarPost(ArrayList<Post> posts) {
        Funcions.mostraposts(posts);
        int eleccio = Funcions.sc.nextInt() - 1;
        Funcions.sc.nextLine();
        posts.remove(eleccio);
        Funcions.mostraposts(posts);
        System.out.println();
    }

    @Override
    public void MostrarMur(ArrayList<Post> posts) {

    }

    @Override
    public void SeguirEditorLector(ArrayList<Usuari> usuaris) {

    }

    @Override
    public void MostrarMurLector(ArrayList<Post> posts,ArrayList<Usuari>usuaris) {

    }

    @Override
    public void VeureSegueixoLector() {

    }

    
   
    
}