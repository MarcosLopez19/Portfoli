package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex18 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        String letra;
        int cont1 = 0, cont2 = 0, cont3 = 0, cont4 = 0, cont5 = 0;

        System.out.println("intro frase");
        cadena1 = in.nextLine();

        for (int i = 0; i < cadena1.length(); i++) {

            if (cadena1.charAt(i) == 'a') {
                cont1++;
            } else if (cadena1.charAt(i) == 'e') {
                cont2++;
            } else if (cadena1.charAt(i) == 'i') {
                cont3++;
            } else if (cadena1.charAt(i) == 'o') {
                cont4++;
            } else if (cadena1.charAt(i) == 'u') {
                cont5++;
            }
        }
        System.out.println("Hi han" + cont1 + "lletres" + 'a');
        System.out.println("Hi han" + cont2 + "lletres" + 'e');
        System.out.println("Hi han" + cont3 + "lletres" + 'i');
        System.out.println("Hi han" + cont4 + "lletres" + 'o');
        System.out.println("Hi han" + cont5 + "lletres" + 'u');
    }
}
