package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Ex4 {

    public static void main(String[] args) {

        int[] numeros = new int[20];

        contador(numeros);

    }

    public static void contador(int[] notas) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        int suma = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.println("intro nota");
            notas[i] = innum.nextInt();
            suma += notas[i];
        }
        media(notas, suma);
    }

    public static void media(int[] notas1, int suma1) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        float media = 0;

        media = (float) suma1 / notas1.length;
        System.out.println("la media de las notas és: " + media);
    }
}
