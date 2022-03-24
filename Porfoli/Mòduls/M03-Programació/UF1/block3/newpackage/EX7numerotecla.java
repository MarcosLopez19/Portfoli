package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class EX7numerotecla {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int valor = 0, numero, suma = 0;

        do {
            System.out.println("Intro numero");
            numero = in.nextInt();

            if (numero % 2 == 0) {
                suma = suma + 1;

            } else {
            }

        } while (numero > valor);
        System.out.println(" Hi han  " + suma + "numeros parells");
    }
}
