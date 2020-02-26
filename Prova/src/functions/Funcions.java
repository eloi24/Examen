package functions;

import java.util.ArrayList;
import java.util.Scanner;

import clases.Usuari;

public class Funcions{
    public static Scanner sc = new Scanner(System.in);
    public static boolean comprovapasswd(String passwd,String passwd1){
     
      if(passwd.equals(passwd1)){
          return true;
      }else{
        System.out.println("Les contrasenyes no coincideixen.. Torna-hi..");
          return false;
      }


    }
    public static void Menu(){
        System.out.println();
        System.out.println("******************************");
        System.out.println("* 1 - Login                  *");
        System.out.println("* 2 - Registre com a Lector  *");
        System.out.println("* 3 - Sortir                 *");
        System.out.println("******************************");
        System.out.println();
    }
    public static boolean ComprovaUser(ArrayList<Usuari>users,String user){
        boolean comprova = false;
        for (Usuari u : users) {
            if (u.getNomusuari().equals(user)){
                comprova=true;
            }
            else{
                comprova= false;
            }
            
        }
return comprova;
    }
    private static Usuari usuariretorna;
    public static Usuari BuscaUser(ArrayList<Usuari>users,String user){
        
        for (Usuari u : users) {
            if (u.getNomusuari().equals(user)){
                 usuariretorna=u ;
            }
            
        }
        return usuariretorna;
    }
}