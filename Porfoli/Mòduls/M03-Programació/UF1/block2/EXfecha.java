package block2;

import java.util.Scanner;

public class EXfecha {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int dian, mesn, anyon, diaa, mesa, anyoa, edad, resultat;

        System.out.println("Intro dia de nacimiento");
        dian = in.nextInt();
        System.out.println("Intro mes de nacimiento");
        mesn = in.nextInt();
        System.out.println("Intro año de nacimiento");
        anyon = in.nextInt();
        System.out.println("Intro dia actual");
        diaa = in.nextInt();
        System.out.println("Intro mes actual");
        mesa = in.nextInt();
        System.out.println("Intro año actual");
        anyoa = in.nextInt();
        edad = (anyoa - anyon);

        if (mesn == mesa) {
            if (dian > diaa) {
                resultat = (edad - 1);
                System.out.println(" Tienes" + resultat);
            } else {
                System.out.println(" Tienes " + edad);
            }
        } else if (mesn > mesa) {
            resultat = (edad - 1);
            System.out.println(" Tienes " + resultat);
        } else if (mesn < mesa) {
            System.out.println(" Tienes " + edad);
        } 
    }
}
