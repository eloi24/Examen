package functions;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.util.ArrayList;
import java.util.Scanner;

import clases.Admin;
import clases.Editor;
import clases.Lector;
import clases.Post;
import clases.Usuari;

public class Funcions {
    public static Scanner sc = new Scanner(System.in);

    public static boolean comprovapasswd(String passwd, String passwd1) {

        if (passwd.equals(passwd1)) {
            return true;
        } else {
            System.out.println("Les contrasenyes no coincideixen.. Torna-hi..");
            return false;
        }

    }

    public static void Menu() {
        System.out.println();
        System.out.println("******************************");
        System.out.println("* 1 - Login                  *");
        System.out.println("* 2 - Registre com a Lector  *");
        System.out.println("* 3 - Sortir                 *");
        System.out.println("******************************");
        System.out.println();
    }

    public static boolean ComprovaUser(ArrayList<Usuari> usuaris, String username) {

        for (Usuari u : usuaris) {
            if (u.getNomusuari().equals(username)) {
                return true;
            }

        }
        return false;
    }

    private static Usuari usuariretorna;

    public static Usuari BuscaUser(ArrayList<Usuari> users, String user) {

        for (Usuari u : users) {
            if (u.getNomusuari().equals(user)) {
                usuariretorna = u;
            }

        }
        return usuariretorna;
    }

    public static void mostraposts(ArrayList<Post> posts) {
        System.out.println("*********************************************************");
        for (Post p : posts) {
            System.out.println(posts.indexOf(p) + 1 + p.MostraPost2());

        }
        System.out.println("*********************************************************");
        System.out.println();
    }

    public static void MostraUsuaris(String tipus, ArrayList<Usuari> usuaris) {
        System.out.println("Llistat d'usuaris amb rol de " + tipus);
        System.out.println("---------------------------------------");
        for (Usuari u : usuaris) {
            if (u.getClass().getSimpleName().equals(tipus)) {
                System.out.println(u.getNomusuari());

            }

        }
        System.out.println("---------------------------------------");
        System.out.println();

    }

    public static int[] arrayDeStringAInt(String[] dia) {
        int[] dies = new int[3];
        for (int i = 0; i < 3; i++) {
            dies[i] = Integer.parseInt(dia[i]);
        }
        return dies;
    }

    public static LocalDate IntaDate(int[] dies) {

        return LocalDate.of(dies[2], dies[1], dies[0]);

    }

    public static boolean ComprovaSiEsMajor(String data) {
        Period edat = Period.between(Funcions.IntaDate(Funcions.arrayDeStringAInt(data.split("/"))), LocalDate.now());
        System.out.println("Edat: " + edat.getYears());
        if (edat.getYears() >= 18) {
            return true;
        } else {
            return false;
        }
    }

    public static Lector setLector(ArrayList<Usuari> usuaris, String nomusuari, String passwd, String data) {

        return new Lector(nomusuari, passwd, Funcions.ComprovaSiEsMajor(data));

    }

    public static void setAdmin(String nomusuari, String passwd, ArrayList<Usuari> usuaris) {

        usuaris.add(new Admin(nomusuari, passwd));
    }

    public static void LectorAEditor(ArrayList<Usuari> usuaris, Usuari user) {
        int posicio = usuaris.indexOf(user);
        Usuari nou= new Editor(user.getNomusuari(), user.getPasswd());
nou.setFollows(user.getFollows());
        usuaris.add(nou);
        if (posicio < 0) {

        } else {
            usuaris.remove(posicio);
        }

    }

    public static String MostraSegueixEditors(ArrayList<Usuari> usuaris, String tipus) {
        String resultat=null;
        System.out.println(
                "Introdueix el nom d'usuari d'un " + tipus + " (intro per veure un llistat de tots els lectors)");
        String lector = Funcions.sc.nextLine();
        if (lector.isEmpty()) {
            Funcions.MostraUsuaris(tipus, usuaris);
            System.out.println("Escriu el userName del " + tipus + ": ");
            String nomusuari = Funcions.sc.nextLine();
            if (Funcions.ComprovaUser(usuaris, nomusuari)) {
                resultat=nomusuari;
            } else {
                System.out.println("Usuari no existent");
            }

        } else if (Funcions.ComprovaUser(usuaris, lector)) {
            resultat= lector;

        }
return resultat;
    }
    public static Post CrearPost(ArrayList<Post>posts,Usuari user){
        System.out.println("Introdueix el títol: ");
        String titol = Funcions.sc.nextLine();
        System.out.println("Introdueix el contingut");
        String contingut = Funcions.sc.nextLine();
        System.out.println("El contingut és per a majors de 18? (S/N)");
        String resultat = Funcions.sc.nextLine();
        boolean majors = false;
        if (resultat.equalsIgnoreCase("s")) {
            majors = true;
        }
        return new Post(contingut, titol, LocalDateTime.now(), user, majors);
    }
    public static void SeguirEditor(ArrayList<Usuari> usuaris,ArrayList<Usuari> follows){
System.out.println("Introdueix el nom d'usuari d'un Editor (Intro per veure un llista de tots els lectors)");
String usuari=Funcions.sc.nextLine();
if (usuari.isBlank() && Funcions.ComprovaUser(usuaris, usuari)){
    if (Funcions.BuscaUser(usuaris, usuari).getClass().getSimpleName().equals("Editor")){
        if (Funcions.ComprovaUser(follows, usuari)){
            follows.remove(Funcions.BuscaUser(follows, usuari));
        }else{
            Funcions.BuscaUser(usuaris, usuari).LlistarEditors(usuaris);
            usuari=sc.nextLine();
            follows.add(Funcions.BuscaUser(usuaris, usuari));
        }
    }System.out.println("Lúsuari no és editor");
}else if (Funcions.ComprovaUser(usuaris, usuari)){
    if(Funcions.BuscaUser(usuaris, usuari).getClass().getSimpleName().equals("Editor")){
        if (Funcions.ComprovaUser(follows, usuari)){
            follows.remove(Funcions.BuscaUser(follows, usuari));
        }else{
            follows.add(Funcions.BuscaUser(usuaris, usuari));
        }
    }else{
        System.out.println("L'usuari no és editor");
    }
    
    

}else{
    System.out.println("Usuari no existent");
} 
    }
}