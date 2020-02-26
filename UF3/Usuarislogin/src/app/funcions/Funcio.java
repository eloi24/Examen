package app.funcions;

import java.util.HashMap;
import java.util.Scanner;

import app.usuari.Usuari;

public class Funcio {
    public static Scanner sc = new Scanner(System.in);

    public static void menu() {
        System.out.println("1- Afegir Usuari");
        System.out.println("2- Fer Login");
        System.out.println("3- Sortir");
        System.out.println("4- Modificar dades");
    }

    public static Usuari introusuari(String nomusuari, String telefon, String direccio, String contrasenya) {
        Usuari user = new Usuari(nomusuari);
        user.setContrasenya(contrasenya);
        user.setDireccio(direccio);
        user.setTelefon(telefon);

        return user;

    }

    public static boolean comprova(HashMap<String, Usuari> users, String nomusuari) {
        if (users.containsKey(nomusuari)) {
            return true;
        } else {
            return false;
        }

    }

    public static void mostramodifica() {
        System.out.println("1- Usuari");
        System.out.println("2- Contrasenya");
        System.out.println("3- Població");
        System.out.println("4- telèfon");
        System.out.println("5- sortir");
    }

    public static boolean comprovausericontrasenya(HashMap<String, Usuari> users, String nomusuari, String contrasenya) {
            if (users.get(nomusuari).comprovacontrasenya(contrasenya)) {
                return true;
            } else {
                System.out.println("Contrasenya incorrecte");
                return false;
            }
        }

    }


