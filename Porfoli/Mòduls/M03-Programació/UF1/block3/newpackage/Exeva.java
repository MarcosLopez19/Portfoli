package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Exeva {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String frase = "";
        boolean eva = true;

        System.out.println("intro frase");
        frase = in.nextLine();
        while ((frase.contains(" eva ")) && (frase.contains(" eva")) && (frase.contains("eva "))) {
            frase = frase.replaceAll(frase, " " + frase + " ");
            frase = frase.replace(" eva ", " Eva ");
        }
        System.out.println(frase.trim());
    }
}
