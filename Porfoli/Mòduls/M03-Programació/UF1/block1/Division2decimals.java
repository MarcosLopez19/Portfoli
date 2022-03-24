package block11;

import java.util.Scanner;

public class Division2decimals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float n1, n2, div;

        System.out.println("Intro primer número");
        n1 = in.nextFloat();
        System.out.println("Intro segon número");
        n2 = in.nextFloat();

        div = n1 / n2;

        System.out.printf(" La divició és %.2f", div);
    }

}
