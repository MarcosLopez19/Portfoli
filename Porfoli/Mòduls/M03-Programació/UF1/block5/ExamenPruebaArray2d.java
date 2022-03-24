package block5;

import block5.ExPrueba2;
import java.util.Arrays;
import java.util.Scanner;

public class ExamenPruebaArray2d {

    //public static final int Alumnes = 10;
    public static final int Notes = 3;

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        boolean Aprovat = false;
        int num, suma, sum, Alumnes = 0, Nota = 0, media = 0, n;

        // Arrays.fill(prova2d[i], 0);
        System.out.println("Cuantos Alumnos han echo el examen");
        Alumnes = innum.nextInt();
        int[][] Alumnos = new int[Alumnes][Notes];

        int NotamAlt = 0, NotamBaj = 0, A = 0, S = 0;
        for (int i = 0; i < Alumnos.length; i++) {
            Nota = 0;
            sum = 0;
            n = 0;
            Aprovat = false;
            for (int j = 0; j < Alumnos[i].length; j++) {
                //Intro Notas, Suma Notas
                n++;
                System.out.println("Intro Nota");
                Nota = innum.nextInt();
                sum += Nota;
                System.out.println("Alumne" + i + ",Nota " + n + " Tiene" + Nota);
            }
            //decir si esta arobat
            if (sum >= 5) {
                A++;
                Aprovat = true;
            } else {
                S++;
            }
            if (Aprovat == true) {

                System.out.println("El Alumne" + i + " Esta Aprobat");
            }
            if (Aprovat == false) {
                System.out.println("El Alumne" + i + " Esta suspes");
            }

            //nota mas alta y pequeña de examen
            if (NotamAlt == 0) {
                NotamAlt = sum;
            } else if (NotamBaj == 0) {
                NotamBaj = sum;
            }
            if (NotamBaj > sum) {
                NotamBaj = sum;
            }
            if (NotamAlt < sum) {
                NotamAlt = sum;
            }

        }

        int i = 0;
        double sumex1 = 0, sumex2 = 0, sumex3 = 0, media1, media2, media3;
        for (int j = 0; j < Alumnos[0].length; j++) {
            media1 = 0;
            sumex1 = 0;
            for (i = 0; i < Alumnos.length; i++) {

            }
            sumex1 += Alumnos[i][j];
            media1 = sumex1 / Alumnes;
            System.out.println("Media Ex" + j + " Es" + media1);
        }

        double prcAprov = (double) A / Alumnes * 100;
        System.out.println("Nota Mas Alta=" + NotamAlt);
        System.out.println("Nota Mas Baja=" + NotamBaj);
        System.out.println("P% d'Aprovats=" + prcAprov + "%");

    }
}
