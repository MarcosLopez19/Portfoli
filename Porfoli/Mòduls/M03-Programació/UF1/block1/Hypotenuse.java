package block11;

import static java.lang.Math.sqrt;
import java.util.Scanner;

public class Hypotenuse {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double cat1, cat2, hypotenuse;

        System.out.println("Intro primer número");
        cat1 = in.nextDouble();
        System.out.println("Intro primer número");
        cat2 = in.nextDouble();

        hypotenuse = sqrt((cat1 * cat1) + (cat2 * cat2));

        System.out.printf(" El resultado és: %.2f ", hypotenuse);
    }

}
