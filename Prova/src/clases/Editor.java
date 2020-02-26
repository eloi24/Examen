package clases;

import java.time.LocalDateTime;
import java.util.ArrayList;

import functions.Funcions;

public class Editor extends Usuari {

    public Editor(String nomusuari, String passwd) {
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
}