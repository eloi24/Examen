package app;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import app.funcions.*;
import app.usuari.Usuari;

public class App {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) throws Exception {

        HashMap<String, Usuari> users = new HashMap<>();
        loopa: while (true) {
            Funcio.menu();
            int eleccio = sc.nextInt();
            sc.nextLine();
            switch (eleccio) {
            case 1:
                System.out.println("Introdueix l'usuari");
                String nomusuari = sc.nextLine();
                if (Funcio.comprova(users, nomusuari)) {
                    System.out.println("Usuari existent");
                    break;
                } else {
                    System.out.println("Introdueix la contrasenya: ");
                    String contrasenya = sc.nextLine();
                    System.out.println("Introdueix la teva direcció: ");
                    String direccio = sc.nextLine();
                    System.out.println("Introdueix el telefon:");
                    String telefon = sc.nextLine();
                    users.put(nomusuari, Funcio.introusuari(nomusuari, telefon, direccio, contrasenya));
                    break;

                }
            case 2:
                System.out.println("Introdueix el nom d'usuari: ");
                nomusuari = sc.nextLine();
                if (Funcio.comprova(users, nomusuari)) {
                    System.out.println("Introdueix contrasnya ");
                    String contrasenya = sc.nextLine();
                    if (users.get(nomusuari).comprovacontrasenya(contrasenya)) {
                        users.get(nomusuari).mostrausuari();
                    } else {
                        System.out.println("Contrasenya incorrecte");
                    }
                } else {
                    System.out.println("Usuari inexistent");
                }

                break;
            case 3:
                break loopa;
            case 4:
                System.out.println("Introdueix el nom d'usuari: ");
                nomusuari = sc.nextLine();
                if (Funcio.comprova(users, nomusuari)) {
                    System.out.println("Introdueix contrasenya ");
                    String contrasenya = sc.nextLine();
                    if (users.get(nomusuari).comprovacontrasenya(contrasenya)) {
                        loopassos: while (true) {
                            Funcio.mostramodifica();
                            eleccio = sc.nextInt();
                            sc.nextLine();
                            switch (eleccio) {
                            case 1:
                            System.out.println("Introdueix el nom d'usuari nou");
                            String nomusuarinou = sc.nextLine();
                            if (Funcio.comprova(users, nomusuarinou)){
                                System.out.println("Usuari existent");
                            }else{
                            System.out.println("Introdueix contrasenya");
                            contrasenya = sc.nextLine();
                            if (Funcio.comprovausericontrasenya(users, nomusuari, contrasenya)){
                                users.get(nomusuari).setUsuari(nomusuarinou);
                                users.put(nomusuarinou,users.get(nomusuari));
                                users.remove(nomusuari);
                            }
                        }
                                break;
                            case 2:

                                break;
                            case 3:
                                break;
                            case 4:
                                break;
                            case 5:
                                break loopassos;
                            }
                        }
                    } else {
                        System.out.println("Contrasenya incorrecte");
                    }
                } else {
                    System.out.println("Usuari inexistent");
                }

                break;

            }
        }
    }

}