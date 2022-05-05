package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex2_REPASO {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ordenaSeleccio(generaVector(in.nextInt()));
    }

    public static float[] generaVector(int limite) {
        float x = 0;
        float[] Array = new float[limite];

        for (int i = 0; i < limite; i++) {
            x = in.nextFloat();
            Array[i] = x;
        }
        return Array;
    }

    public static void ordenaSeleccio(float[] Array) {
        float aux;
        int count = 0;
        for (int i = 0; i < Array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[minimo]) {
                    minimo = j;
                }
            }
            aux = Array[i];
            Array[i] = Array[minimo];
            Array[minimo] = aux;
            count++;
        }
        System.out.println("Total passades= "+ count);
        mostraVector(Array);
    }

    public static void mostraVector(float[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
