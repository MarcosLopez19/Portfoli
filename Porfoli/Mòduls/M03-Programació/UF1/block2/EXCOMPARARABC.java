package block2;

import java.util.Scanner;

public class EXCOMPARARABC {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int A = 5, B = 10, C = 8, mayor;

        if (A > B) {
            if (A > C) {
                mayor = A;

            } else {
                mayor = C;
            }

        } else if (B > C) {
            mayor = B;

        } else {
            mayor = C;
        }
        System.out.println("Mayor es " + mayor);
    }
}
