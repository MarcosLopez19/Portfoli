package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class EX4segundos {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int hores, minuts, segons;
        
        do {
            System.out.println("Intro hores");
            hores = in.nextInt();
            System.out.println("Intro minuts");
            minuts = in.nextInt();
            System.out.println("Intro segons");
            segons = in.nextInt();
            segons = segons + 1;

        } while ((segons > 60)&&(minuts>60));
        if (segons >= 60) {
            minuts = minuts + 1;
            segons = segons - 60;
            if (minuts >= 60) {
                minuts = minuts - 60;
                hores = hores + 1;

            }
        } else {

        }
        System.out.println(" El resultat és " + hores + "hores " + minuts + "minuts " + segons + "segons");
    }
}
