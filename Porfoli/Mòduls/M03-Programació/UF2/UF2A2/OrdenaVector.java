/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2A2;

import UF2A2_Ordenacio.*;
import UF2A3_Funcions3.*;
import java.util.*;
import java.util.Scanner;

/**
 *
 * @author marku
 */
public class OrdenaVector {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Numero de Elments?");
        int numElements = in.nextInt();
        generaVector(numElements);
        mostraVector(generaVector(numElements));
        ordenaSeleccio(generaVector(numElements));
        ordenaBombolla(generaVector(numElements));
        sort(numElements, generaVector(numElements));
    }

    public static int[] generaVector(int numElements) {
        int[] Array = new int[numElements];

        for (int i = 0; i < Array.length; i++) {
            Array[i] = numElements;
            numElements--;
        }
        return Array;
    }

    public static void mostraVector(int[] Array) {

        for (int i = 0; i < Array.length; i++) {
            System.out.print(Array[i] + ", ");
        }
        System.out.println("");
    }

    public static void ordenaSeleccio(int[] Array) {
        int aux;
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
        }
        mostraVector(Array);
    }
    
    public static void ordenaBombolla(int[] Array) {
        int aux;
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    aux = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = aux;
                }
            }
        }
        mostraVector(Array);
    }

    public static void sort(int numElements, int[] Array) {
        ArrayList<Integer> ArrayL = new ArrayList<Integer>();

        for (int i = 0; i < Array.length; i++) {
            ArrayL.add(Array[i]);
        }
        Collections.sort(ArrayL);
        System.out.println(ArrayL);
    }
}
