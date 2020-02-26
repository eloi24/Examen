import java.util.ArrayList;
import java.util.Scanner;

import clases.*;

public class Blog{
    public static void main(String[] args) {
     ArrayList<Usuari> usuaris = new ArrayList<>();
     ArrayList<Post> posts = new ArrayList<>();
     Scanner sc = new Scanner(System.in);
     System.out.println("*********************************");
     System.out.println("* Benvingut a CirvSocialNetwork *");
     System.out.println("*********************************");
     System.out.println("Introdueix el nom de l'usuari que tindrà el rol d'administrador: ");
     String nomusuari=sc.nextLine();
     usuaris.add(new Admin(nomusuari, passwd))
    }
}