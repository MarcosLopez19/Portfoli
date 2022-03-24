package block2;

import java.util.Scanner;

public class EXmenu {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int opcion, n1, n2;
        System.out.println("Intro operación: 1 Suma, 2 Resta, 3 producto,4 divison");
        opcion = in.nextInt();
        System.out.println("Intro numero 1 ");
        n1 = in.nextInt();
        System.out.println("Intro numero 2 ");
        n2 = in.nextInt();

        if (opcion == 1) {
            opcion = n1 + n2;
        } else if (opcion == 2) {
            opcion = n1 - n2;
        } else if (opcion == 3) {
            opcion = n1 * n2;
        } else if (opcion == 4) {
            opcion = n1 / n2;
        }else
        System.out.println(" El resultat de la operació és: " + opcion);
    }
}
