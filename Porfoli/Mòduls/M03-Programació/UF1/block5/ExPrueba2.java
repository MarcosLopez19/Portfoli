package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ExPrueba2 {

    public static void main(String[] args) {

        int[] numeros = new int[10];

        numeros(numeros);
        sumanum(numeros);

    }

    public static void numeros(int[] relleno) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        for (int i = 0; i < relleno.length; i++) {
            System.out.println("intro num");
            relleno[i] = innum.nextInt();
        }
    }

    public static void sumanum(int[] relleno) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int sumapar = 0, sumaimpar = 0;

        for (int i = 0; i < relleno.length; i++) {

            if (i % 2 == 0) {
                sumapar += relleno[i];
            } else {
                sumaimpar += relleno[i];
            }
        }
        System.out.println(" suma par " + sumapar);
        System.out.println(" suma impar " + sumaimpar);
    }
}
