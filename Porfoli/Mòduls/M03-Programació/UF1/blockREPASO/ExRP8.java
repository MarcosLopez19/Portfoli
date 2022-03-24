package blockREPASO;

import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ExRP8 {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        boolean perfecto = false;
        int numero = 0, cont = 0, divisiores = 0, valormax = 0, suma = 0;

        System.out.println("intro numero");
        numero = innum.nextInt();
        while (perfecto == false) {
            while (numero > suma) {
                divisiores++;
                if (numero % divisiores == 0) {
                    suma = divisiores + suma;
                } else {
                }
            }
            if (numero == suma) {
                System.out.println(numero + " És un numero perfecto");
                perfecto=true;
            } else {
                System.out.println(numero + " No és un numero perfecto");
                perfecto=true;
            }
        }

    }

}
