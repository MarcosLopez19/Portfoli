package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex21 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        boolean palindromo = true;

        System.out.println("intro frase");
        cadena1 = in.nextLine();
        //cadena1=cadena1.replace(" ","");//
        String reverse = cadena1;

        int cont = 0, i = reverse.length() - 1;

        while ((i > cont) && (palindromo = true)) {
            if (cadena1.charAt(i) == ' ') {
                i--;
            }
            if (reverse.charAt(cont) == ' ') {
                cont++;
            }
            if (cadena1.charAt(i) == reverse.charAt(cont)) {
                palindromo = true;
            } else {
                palindromo = false;
            }
            i--;
            cont++;
        }
        if (palindromo == true) {
            System.out.println(cadena1 + " es un palindrom");
        } else {
            System.out.println(cadena1 + " No es un palindrom");
        }

    }
}
