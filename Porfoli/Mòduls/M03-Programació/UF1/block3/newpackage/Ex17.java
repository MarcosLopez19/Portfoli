package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex17 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String cadena1 = "";
        String cadena2 = "";
        int cont = 0;
        System.out.println("intro frase");
        cadena1 = in.nextLine();
        for (int i = 0; i < cadena1.length(); i++) {
            if (cadena1.charAt(i) == 'a') {
                cont++;
            } 
        }
         System.out.println("Hi ha" + cont + "lletres" + 'a');
    }
}
