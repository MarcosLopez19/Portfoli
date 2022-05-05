package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex1_REPASO {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        ordenaBombolla(generaVector(in.nextInt()));
    }

    public static String[] generaVector(int limite) {
        in.nextLine();
        String x = "";
        String[] Array = new String[limite];

        for (int i = 0; i < limite; i++) {
            x = in.nextLine();
            Array[i] = x;
        }
        return Array;
    }

    public static void ordenaBombolla(String[] Array) {
        int count=0;
        String aux = "";
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j].compareTo(Array[j + 1]) > 0) {
                    aux = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = aux;
                }
            }
            count++;
        }
        mostraVector(Array);
        System.out.println(count+"veces");
    }

    public static void mostraVector(String[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
    }
}
