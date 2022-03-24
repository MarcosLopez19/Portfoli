package block11;

import java.util.Scanner;

public class multiplication {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, mult;

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segon número");
        n2 = in.nextInt();

        mult = n1 * n2;

        System.out.println("La multiplicació és" + mult);
    }

}
