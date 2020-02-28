package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import functions.Funcions;

public class Editor extends Usuari {

  public Editor(String nomusuari, String passwd) {
    super(nomusuari, passwd);
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
    System.out.println("1 - Crear un post");
    System.out.println("2 - Seguir a un Editor nou");
    System.out.println("3 - Veure els editors que segueixo");
    System.out.println("4 - Mirar el teu mur");
    System.out.println("0 - Log Out");

  }

  @Override
  public void MostrarMur(ArrayList<Post> posts) {
    for (Post p : posts) {
      if (p.getUser().getClass().getSimpleName().equals("Admin")) {

          p.MostraPost();
      }
      
  }
    for (Usuari u : this.follows) {
      for (Post p : posts) {
        if (u.getNomusuari().equals(p.getUser().getNomusuari())){
       p.MostraPost();

       } 

      }

    }

  }

  @Override
  public void SeguirEditor(ArrayList<Usuari> usuaris) {
    Funcions.SeguirEditor(usuaris, follows);


  }

  @Override
  public void VeureSegueixo() {
    System.out.println("Editos seguits per " + this.nomusuari);
    System.out.println("------------------------------------");
    for (Usuari u : follows) {
      System.out.println(u.getNomusuari());

    }

  }

  @Override
  public void EliminarPost(ArrayList<Post> posts) {

  }

  public void CrearPost(ArrayList<Post> posts, Usuari user) {
    posts.add(Funcions.CrearPost(posts, user));
  }

  @Override
  public void MostrarMurTotal(ArrayList<Post> posts) {

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