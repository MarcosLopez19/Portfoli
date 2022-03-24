package block11;

import java.util.Scanner;

public class UF1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, suma, resta;

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segon número");
        n2 = in.nextInt();

        suma = n1 + n2;
        System.out.println("La suma és" + suma);

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segon número");
        n2 = in.nextInt();

        resta = n1 - n2;

        System.out.println("La resta és" + resta);

    }

}
