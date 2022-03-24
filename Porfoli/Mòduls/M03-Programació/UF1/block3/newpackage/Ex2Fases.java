package block3.newpackage;

import block2.*;
import java.util.Scanner;
import javax.swing.text.AbstractDocument;

public class Ex2Fases {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int cont, comptaPrimers = 0, num = 0;
        boolean esPrimer = true;

        while (comptaPrimers < 30) {
            esPrimer = true;
            num++;
            cont = 2;
            while ((cont <= num / 2) && (esPrimer == true)) {
                if (num % cont == 0) {
                    esPrimer = false;
                }
                cont++;
            }
            if (esPrimer == true) {
                System.out.println(num);
                comptaPrimers++;
            }
            num++;
            esPrimer = true;

        }
    }
}
