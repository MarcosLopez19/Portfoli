package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class EX8posituisnegatius {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int valor = 0, numero, positiu = 0, negatiu = 0;

        do {
            System.out.println("Intro numero");
            numero = in.nextInt();

            if ((numero > 0)&&(numero!=0)) {
                positiu = positiu + 1;

            } else if ((numero < 0)&&(numero!=0)) {
                negatiu = negatiu + 1;
            }
        } while ((numero > valor) | (numero < valor));
        System.out.println(" Hi han  " + positiu + " numeros positius,i " + negatiu + " numeros negatius ");
    }
}
