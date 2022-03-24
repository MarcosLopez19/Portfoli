package block5;

import block5.ExPrueba2;
import java.util.Arrays;
import java.util.Scanner;

public class plantillaArray2d {
        public static final int vendedors = 10;
        public static final int productes = 50;
    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        String cadena = "Cadena per fer proves";
        int num, suma,sum;
        int[][] prova2d = new int[10][50];
        // Arrays.fill(prova2d[i], 0);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < prova2d.length; i++) {
            num = i;
            sum = 0;
            for (int j = 0; j < prova2d[i].length; j++) {
             
                //muestra array
                //System.out.print(prova2d[i][j] + " ");
            }        
            //espacio entre filas
            //System.out.println("");
        }
        int i = 0;
        for (int j = 0; j < prova2d[0].length; j++) {
            num = i;
            suma = 0;

            for (i = 0; i < prova2d.length; i++) {
                //System.out.print(prova2d[i][j] + " ");

            }
            //System.out.println("");

        }

    }
}
