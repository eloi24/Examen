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
        System.out.println("7 - Log Out");
    }

    @Override
    public Post CrearPost(Usuari user) {
        System.out.println("Introdueix el títol: ");
      String titol=Funcions.sc.nextLine();
      System.out.println("Introdueix el contingut");
      String contingut=Funcions.sc.nextLine();
      System.out.println("El contingut és per a majors de 18? (S/N)");
      String resultat=Funcions.sc.nextLine();
      boolean majors=false;
      if (resultat.equalsIgnoreCase("s")){
        majors=true;
      }
      return  new Post(contingut, titol, LocalDateTime.now(),user, majors);


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
    public void MostrarMur(ArrayList<Post> posts) {
      for (Post p : posts) {
          p.MostraPost();
      }

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
       Funcions.mostraposts(posts);
       int eleccio=Funcions.sc.nextInt()-1;
       Funcions.sc.nextLine();
       posts.remove(eleccio);
       Funcions.mostraposts(posts);
       System.out.println();
    }

    
   
    
}