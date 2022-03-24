package block2;

import java.util.Scanner;

public class EXNOTAS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float nota;

        System.out.println("Intro Nota");
        nota = in.nextFloat();

        if (nota < 5) {
            System.out.println("tu nota és Suspendido");
        } else if (nota == 5) {
            System.out.println("tu nota és Aprobado");
        } else if (nota <= 6) {
            System.out.println("tu nota és Bé");
        } else if (nota <= 7) {
            System.out.println("tu nota és Notable");
        } else if (nota <= 8) {
            System.out.println("tu nota és Notable");
        } else {
            System.out.println("tu nota és Exelent");
        }

    }
}
