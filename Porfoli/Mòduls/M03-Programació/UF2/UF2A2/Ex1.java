package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex1 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numElements = in.nextInt() + 1;
        String Array[] = generaVector(numElements, in);
        ordenaBombolla(Array);
    }

    public static String[] generaVector(int numElements, Scanner in) {
        String paises = "";
        String[] Array = new String[numElements];
        for (int i = 0; i < Array.length; i++) {
            paises = in.nextLine();
            Array[i] = paises;

        }
        return Array;
    }

    public static void mostraVector(String[] Array) {
        System.out.print("Països ordenats:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("");
    }

    public static void ordenaBombolla(String[] Array) {
        String aux;
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j].compareTo(Array[j + 1]) > 0) {
                    aux = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = aux;
                }
            }
        }
        mostraVector(Array);
    }
}
