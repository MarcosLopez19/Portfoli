package restaurant;

import restaurant.*;
import java.util.Scanner;

public class usuaripasswd {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String usuari = "";
        String passwd = "";
        boolean validacio = false;
        int i = 3;
        while ((i > 0) && (validacio == false)) {
            
            System.out.println("intro USUARIO");
            usuari = in.nextLine();
            System.out.println("intro CONTRASEÑA");
            passwd = in.nextLine();
            
            if (usuari.equals("MarcosLopez")) {
                if (passwd.equals("123")) {
                    validacio = true;
                   
                }
            } else {
                i--;
                System.out.println("ERROR usuario o contraseña incorrecto");
                System.out.println("Tienes " + i + " intentos");
            }
        }
        if (validacio) {
            System.out.println("Sesión iniciada");
        } else {
            System.out.println("ErrorMaximo de intentos permitidos");
        }
    }
}
