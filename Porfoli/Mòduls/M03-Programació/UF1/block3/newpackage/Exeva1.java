package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Exeva1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = "eva Evaristo Lucia Genoveva eva Luis eva";
        boolean eva = false;

        //System.out.println("intro frase");
        // frase = in.nextLine();
        int i = frase.length() - 1, cont = 0, v = frase.length() - 1;
        while (i < cont) {
            if ((frase.charAt(i) == 'e') && (frase.charAt(i) + 1 == 'v') && (frase.charAt(i) + 2 == 'a')) {

                if ((frase.charAt(i) == 0) && (frase.charAt(i) + 3 == ' ')) {
                    eva = true;
                }
                if ((frase.charAt(i) - 1 == ' ') && (frase.charAt(i) + 3 == ' ')) {
                    eva = true;
                }
                if (frase.charAt(v) - 3 == 'e') {
                    eva = true;
                }
                if (eva == true) {
                    frase.substring(0,i);
                    eva = false;

                }
            }
        }
        if (eva == true) {
        }
        System.out.println(frase);
    }
}
