import java.util.ArrayList;
import java.util.Scanner;

import clases.*;
import functions.Funcions;

public class Blog {
    public static void main(String[] args) {
        ArrayList<Usuari> usuaris = new ArrayList<Usuari>();
        ArrayList<Post> posts = new ArrayList<Post>();
        Scanner sc = new Scanner(System.in);
        System.out.println("*********************************");
        System.out.println("* Benvingut a CirvSocialNetwork *");
        System.out.println("*********************************");
        System.out.println("Introdueix el nom de l'usuari que tindrà el rol d'administrador: ");
        String nomusuari = sc.nextLine();
        System.out.println("Introdueix el password: ");
        String passwd = sc.nextLine();
        String passwd1;

        do {
            System.out.println("Torna a introduir el password: ");
            passwd1 = sc.nextLine();
        } while (!Funcions.comprovapasswd(passwd, passwd1));
        System.out.println("Usuari administrador creat, ja pot començar a utilitzar la aplicació...");
        Funcions.setAdmin(nomusuari, passwd, usuaris);

        loopsos: while (true) {
            Funcions.Menu();
            int eleccio = sc.nextInt();
            sc.nextLine();
            switch (eleccio) {
                case 1:
                    System.out.println("Introdueix el teu username: ");
                    String username = sc.nextLine();
                    if (Funcions.ComprovaUser(usuaris, username)) {
                        Usuari userlogin = Funcions.BuscaUser(usuaris, username);
                        System.out.println("Introdueix la teva password: ");
                        passwd1 = sc.nextLine();
                        if (Funcions.comprovapasswd(userlogin.getPasswd(), passwd1)) {
                            System.out.println();
                            System.out.println("Usuari Autenticat amb èxit");
                            System.out.println(
                                    "El rol assignat per el teu usuari és: " + userlogin.getClass().getSimpleName());
                            loopasso: while (true) {
                                userlogin.MostraMenu();
                                int choice = sc.nextInt();
                                sc.nextLine();
                                switch (choice) {
                                    case 1:
                                    userlogin.CrearPost(posts, userlogin);
                                        userlogin.SeguirEditorLector(usuaris);
                                        break;
                                    case 2:
                                        userlogin.MostrarMurTotal(posts);
                                        userlogin.SeguirEditor(usuaris);
                                        userlogin.VeureSegueixoLector();

                                        break;
                                    case 3:
                                        userlogin.EliminarPost(posts);
                                        userlogin.VeureSegueixo();
                                        userlogin.MostrarMurLector(posts,usuaris);

                                        break;
                                    case 4:
                                        userlogin.ModificarLector(usuaris);
                                        userlogin.MostrarMur(posts);
                                        break;
                                    case 5:
                                        userlogin.LlistarEditors(usuaris);
                                        break;
                                    case 6:
                                        userlogin.LlistarLectors(usuaris);
                                        break;
                                    case 0:
                                        break loopasso;
                                }

                            }

                        } else {
                            System.out.println("Contrasenya incorrecte!");
                        }
                    } else {
                        System.out.println("Usuari inexistent!");
                    }

                    break;
                case 2:
                    System.out.println("Introdueix un nom d'usuari: ");
                    nomusuari = sc.nextLine();
                    System.out.println("Introdueix la contrasenya:  ");
                    passwd = sc.nextLine();
                    System.out.println("Introdueix la teva data de Naixament (dd/mm/yyyy)");
                    String data = sc.nextLine();
                    usuaris.add(Funcions.setLector(usuaris, nomusuari, passwd, data));
                    break;
                case 3:
                    break loopsos;
            }

        }

    }

}
