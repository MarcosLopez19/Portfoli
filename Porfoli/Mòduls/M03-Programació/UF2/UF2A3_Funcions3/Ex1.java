/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2A3_Funcions3;

import java.util.Scanner;

/**
 *
 * @author marku
 */
public class Ex1 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[20];
        arrayA(A);
        arrayB(B);
        arrayC(A, B, C);

    }

    public static void arrayA(int[] A) {
        int n = 1;
        for (int i = 0; i < A.length; i++) {

            A[i] = (int) (Math.random() * 10);
            System.out.print(A[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayB(int[] B) {
        for (int i = 0; i < B.length; i++) {
            B[i] = (int) (Math.random() * (999 - 100)) + 100;
            System.out.print(B[i] + " ");
        }
        System.out.println("");
    }

    public static void arrayC(int[] A, int[] B, int[] C) {
        for (int i = 0; i < C.length; i++) {
            if (i % 2 == 0) {
                C[i] = A[i / 2];
            } else {
                C[i] = B[i / 2];
            }
            System.out.print(C[i] + " ");
        }

    }
}
