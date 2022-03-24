package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Ex2Empresa {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        double hores = 0, pagament = 0, preu = 0, horesEx = 0, preuf = 0, calcul = 0;
        boolean seguim=true;
        for (int i = 10; i > 0; i--) {
            System.out.println("Intro numero de € que pages per hores");
            preu = in.nextInt();

            System.out.println("Intro numero de hores que ha fet el treballador");
            hores = in.nextInt();
            horesEx = hores - 40;
            if (hores > 40) {
                preuf = (hores * preu) + (horesEx * preu * 1.5);
            } else {
                preuf = hores * preu;

            }
            System.out.println("sou" + preuf + "hora pagada" + preu + "€/h");
        }

    }
}
