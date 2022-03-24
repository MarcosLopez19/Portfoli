package block2;

import java.util.Scanner;

public class EXporcentage {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float preu, descuento;

        System.out.println("Intro Preu");
        preu = in.nextFloat();

        if (preu > 10000) {
            descuento = preu * 10 / 100;

        } else {
            descuento = preu * 5 / 100;

        }
        preu = preu - descuento;
        System.out.println("Preu final és " + preu);

    }
}
