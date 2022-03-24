package block5;

import block5.ExPrueba2;
import java.util.Arrays;
import java.util.Scanner;

public class Ex32Marcos1 {

    public static final int vendedors = 10;
    public static final int productes = 50;

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int num, suma, suma3, numero = 0, mayorv = 0, pmasv = 0, v = 0, NumProdu = 0, sumcont = 0, producto = 0, maxi = 0, maxj = 0;
        int[][] prova2d = new int[vendedors][productes];
        double[] preus = new double[productes];
        // Arrays.fill(prova2d[i], 0);
        for (int i = 0; i < vendedors; i++) {
            for (int j = 0; j < productes; j++) {
                //llenar array
                prova2d[i][j] = (int) (Math.random() * 10);
                //muestra array
                //System.out.print(prova2d[i][j] + " ");  
            }
            //System.out.println("");
        }
        int maxVendedor = 0;
        double sum, maxVendes = 0;
        for (int i = 0; i < vendedors; i++) {
            sum = 0;
            for (int j = 0; j < productes; j++) {
                sum = sum + prova2d[vendedors][productes] * preus[j];
            }
            System.out.printf("Vendedor %d: %.2f\n", i, sum);
            if (maxVendes == 0) {
                maxVendes = sum;
            } else if (maxVendes < sum) {
                maxVendes = sum;

            }
        }
        System.out.println("MaxVendes és:" + maxVendes);

    }
}
