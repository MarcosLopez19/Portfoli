package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex22 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String correo = "";
        boolean arroba = false;

        System.out.println("intro frase");
        correo = in.nextLine();

        int i = correo.length() - 1, cont = 0;
        while ((i > cont) && (arroba == false)) {
 
            correo.charAt(cont);

            if (correo.charAt(cont) == '@') {
                arroba = true;
            }
            cont++;
        }
        if (arroba) {
            System.out.println("El texto" + correo + "si contiene @");
        } else {
            System.out.println("El texto" + correo + "no contiene @");
        }

    }
}
