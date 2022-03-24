package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Ex3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        double i = 0, salari;
        System.out.println("Intro numero de treballadors");
        i = in.nextInt();

        while (i > 0) {
            System.out.println("Intro salari del treballador");
            salari = in.nextInt();
            if (salari <= 9000) {
                salari = salari * 1.2;
                System.out.println("SALARI " + salari + "€");
            } else if (salari <= 15000) {
                salari = salari * 1.1;
                System.out.println("SALARI " + salari + "€");
            } else if (salari <= 20000) {
                salari = salari * 1.05;
                System.out.println("SALARI " + salari + "€");
            } else {
                System.out.println("SALARI " + salari + "€");
            }

            i--;
        }
    }
}
