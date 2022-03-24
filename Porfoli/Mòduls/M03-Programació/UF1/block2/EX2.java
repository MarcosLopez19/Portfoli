package block2;

import java.util.Scanner;

public class EX2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2;

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro primer número");
        n2 = in.nextInt();

        if (n1 == n2) {
            System.out.println("El" + n1 + " es igual que" + n2);

        } else if (n1 > n2) {
            System.out.println("El" + n1 + " es mayor que" + n2);

        } else {
            System.out.println("El" + n1 + " es menor que" + n2);
        }
    }

}
