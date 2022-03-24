package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Ex5 {

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

            if ((notas[i] >= 7) && (notas[i] <= 8)) {
                suma++;
            } else {
            }
        }
        System.out.println("hay " + suma + "Notables ");
    }

}
