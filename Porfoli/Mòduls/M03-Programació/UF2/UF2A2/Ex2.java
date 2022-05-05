package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex2 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int valor = in.nextInt();
        float Array[] = generaVector(valor, in);
        ordenaSeleccio2(Array);
    }

    public static float[] generaVector(int valor, Scanner in) {
        float temp = 0;
        float[] Array = new float[valor];
        for (int i = 0; i < Array.length; i++) {
            temp = in.nextFloat();
            Array[i] = temp;

        }
        return Array;
    }

    public static void mostraVector(float[] Array) {
        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + " ");
        }
        System.out.println("");
    }

    public static void ordenaSeleccio2(float[] Array) {
        float aux;
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[minimo]) {
                    minimo = j;
                }
                count++;
            }
            aux = Array[i];
            Array[i] = Array[minimo];
            Array[minimo] = aux;
        }
        mostraVector(Array);
        System.out.println("Total passades: " + count);
    }
}
