package block2;

import java.util.Scanner;

public class EX3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1;

        System.out.println("Intro primer número");
        n1 = in.nextInt();

        if (n1 > 0) {
            System.out.println("El" + n1 + "es positivo");

        } else if (n1 < 0) {
            System.out.println("El" + n1 + " es negativo");

        }
    }
}
