package block11;

import java.util.Scanner;

public class CalculateTheAddition {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n1, n2, suma;

        System.out.println("Intro primer número");
        n1 = in.nextInt();
        System.out.println("Intro segon número");
        n2 = in.nextInt();
        
        suma = n1 + n2;

        System.out.println("La suma és" + suma);
    }

}
