package block5;

import block5.ExPrueba2;
import java.util.Arrays;
import java.util.Scanner;

public class ExExamen21 {

    //public static final int Alumnes = 10;
    public static final int Animals = 5;
    public static final int dias = 31;

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int temp = 0;

        // Arrays.fill(prova2d[i], 0);
        int[][] ani = new int[Animals][dias];
        
        int suma = 0, tempA = 0, diaA = 0, Animal = 0, tempB = 0;
        double media, mediaA = 0;
        
        
        for (int i = 0; i < ani.length; i++) {
            suma = 0;
            media = 0;
            for (int j = 0; j < ani[i].length; j++) {
                //rellenamos array
                ani[i][j] = (int) (Math.random() * 50);

                //suma temperaturas
                suma += ani[i][j];

                //temperatura más alta y más baja 
                if (i == 0) {
                    tempA = ani[i][j];
                    diaA = j;
                    Animal = i;
                    tempB = ani[i][j];
                } else if (tempA < ani[i][j]) {
                    tempA = ani[i][j];
                    diaA = j;
                    Animal = i;
                }
                if (tempB > ani[i][j]) {
                    tempB = ani[i][j];
                }
            }
            //temperatura media animales
            media = suma / dias;
            System.out.println("La temperatura media del animal" + i + " és:" + media);

            //media más alta
            if (mediaA == 0) {
                mediaA = media;
            } else if (mediaA < media) {
                mediaA = media;
            }

            //desvia maxima y minima
            System.out.println("Se desiva con la maxima:" + (tempA - media) + "grados");
            System.out.println("Se desiva con la minima:" + (media - tempB) + "grados");

        }
        //temperatura dels altres animals
        for (int i = 0; i < ani.length; i++) {
            for (int j = 0; j < ani[i].length; j++) {

                if (diaA == j) {
                    System.out.println("Animal" + i + " Tiene una temperatura de " + ani[i][j]);
                }
            }
        }

        System.out.println("El animal con la temperatura más alta ha sido el animal" + Animal + "Amb "
                + "la temperatura de" + tempA + " El día " + diaA);

    }
}
