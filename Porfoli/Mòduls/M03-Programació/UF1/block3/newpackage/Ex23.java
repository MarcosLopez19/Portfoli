package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex23 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        boolean espacio = true;

        System.out.println("intro frase");
        cadena1 = in.nextLine();

        int cont = 0, i = cadena1.length();

        while (i > cont) {
            System.out.print(cadena1.charAt(cont));

            if (cadena1.charAt(cont) == ' ') {
                System.out.println("");
            }
            cont++;
        }
        System.out.println("");
    }
}
