/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2A2_Ordenacio;

import static UF2A2.Ex1.mostraVector;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Nomsicognoms {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        generaNoms(5);
        ordenaBombolla(args);
        cercaBinaria(args, in);
    }

    public static String[] generaNoms(int limite) {
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

    public static void mostraNoms(String[] Array) {
        System.out.print("Llista de noms:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println("1."+Array[i]);
        }
        System.out.println("");
    }

    public static void cercaBinaria(String[] args, Scanner in) {
        Arrays.sort(args);

        int hight = args.length - 1, low = 0, i = 0, posicion = 0;
        boolean encontrado = false;
        System.out.println("Introdueix un nom: ");
        String x = in.nextLine();
        while ((low <= hight) && (!encontrado)) {

            int mid = (hight + low) / 2;

            if (args[mid].equals(x)) {
                encontrado = true;
                posicion = mid;
            } else if (args[hight].compareTo(x) > 0) {
                hight = mid - 1;
            } else {
                low = mid + 1;
            }
            i++;

        }
        if (encontrado) {
            System.out.println("El nom" + x + " s'ha trobat a la posició" + posicion + "de la llista ordenada.");

        } else {
            System.out.println("El nom " + x + " no s'ha trobat a la llista.");
        }
    }
}
