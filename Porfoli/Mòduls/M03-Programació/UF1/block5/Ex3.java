package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Ex3 {

    public static void main(String[] args) {

        int[] numer = new int[100];
        
        contador(numer);
        multiplicacion(numer);

    }

    public static void contador(int[] numeros) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("intro num");
            numeros[i] = innum.nextInt();
        }
    }

    public static void multiplicacion(int[] numeros) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int suma = 0;

        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 3 == 0) {
                suma += numeros[i];
            } else {

            }

        }
        System.out.println(" resultado= " + suma);
    }
}
