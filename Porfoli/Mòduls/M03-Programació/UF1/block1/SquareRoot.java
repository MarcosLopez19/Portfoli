package block11;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class SquareRoot {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double n1, square;

        System.out.println("Intro primer número");
        n1 = in.nextInt();

        square = Math.sqrt(n1);

        System.out.printf(" El resultado és: %.2f ", square);
    }

}
