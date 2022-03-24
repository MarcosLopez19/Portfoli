package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex15 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";

        cadena1 = in.nextLine();
        char caracter1 = cadena1.charAt(3);
        cadena1.length();
        System.out.println("El 3r caracter és " + cadena1.charAt(3));
        System.out.println(cadena1 + "Hola");
        System.out.println("Tine estos caracteres:" + cadena1.length());
        System.out.println(cadena1.toUpperCase());
        cadena1.toUpperCase();
        System.out.println(cadena1.toLowerCase());
        cadena1.toLowerCase();
        System.out.println("intro nombre");
        cadena2 = in.nextLine();

        if (cadena1.equals(cadena2)) {
            System.out.println("Son iguales");

        } else {
            System.out.println("NO Son iguales");
        }

    }
}
