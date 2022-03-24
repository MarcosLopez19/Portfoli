package block11;

import java.util.Scanner;

public class CircumferenceLength {

    public static final double PI = 3.141592;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double radi, resultat;

        System.out.println("Intro primer número");
        radi = in.nextDouble();

        resultat = 2 * Math.PI * radi;

        System.out.printf(" El resultado és: %.2f ", resultat);
    }

}
