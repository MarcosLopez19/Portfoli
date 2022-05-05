package UF2A2_Ordenacio;

import static java.lang.Math.random;
import java.util.*;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.MatchResult;

public class JocDeTaula {

    public static final int files = 8;
    public static final int columnes = 8;
    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int[][] arrayTest = arrayRandom();

        mostraVector(arrayTest, files, columnes);

        int intents = 0;
        int a = 0, b = 0, introducidas = 1;
        while ((intents < 10) || (introducidas < 6)) {
            System.out.println("Intent +" + introducidas + ":");
            System.out.println("Fila:");
            a = in.nextInt();
            System.out.println("Columna");
            b = in.nextInt();
            for (int i = 0; i < files; i++) {
                for (int j = 0; j < columnes; j++) {
                    if (!tocaVora(a, b)) {
                        if (existeixFitxa(arrayTest[a][b])) {
                            introducidas++;
                            intents++;
                            arrayTest[a][b] = 2;
                        } else {
                            System.out.println("No és vàlida. Ja hi ha una fitxa!");
                            intents++;
                        }
                    } else {
                        System.out.println("No és vàlida. Toca la vora!");
                        intents++;
                    }
                }
            }
        }
    }

    public static boolean tocaVora(int a, int b) {
        if ((a == 0) || (a == 7) || (b == 0) || (b == 7)) {
            return true;
        }
        return false;
    }

    public static void mostraVector(int[][] Array, int files, int columnes) {
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                System.out.print(Array[i][j]);
            }
            System.out.println("");
        }
    }

    public static boolean existeixFitxa(int num) {
        if (num == 0) {
            return false;
        } else {
            return true;
        }
    }
    
    public static int[][] arrayRandom() {
        int[][] arrayTest = new int[files][columnes];
        int cont = 0, i = 0, j = 0;
        while (cont < 20) {
            i = (int) (Math.random() * files);
            j = (int) (Math.random() * columnes);
            if (!existeixFitxa(arrayTest[i][j])) {
                arrayTest[i][j] = 1;
                cont++;
            }
        }
        return arrayTest;
    }

}
