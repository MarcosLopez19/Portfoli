package block5;

import block5.ExPrueba2;
import java.util.Arrays;
import java.util.Scanner;

public class Ex31Marcos {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        String cadena = "Cadena per fer proves";
        int num, suma, suma3, mayorv = 0, pmasv = 0, v = 0, NumProdu = 0, sumcont = 0, producto = 0, maxi = 0, maxj = 0;
        int[][] prova2d = new int[10][50];
        // Arrays.fill(prova2d[i], 0);
        System.out.println("");
        System.out.println("");
        System.out.println("");

        for (int i = 0; i < prova2d.length; i++) {
            num = i;
            suma3 = 0;
            System.out.println("Intro num de producto ");
            NumProdu = innum.nextInt();
            for (int j = 0; j < prova2d[i].length; j++) {
                //llenar array
                prova2d[i][j] = (int) (Math.random() * 100);
                //suma productos vendidos por el vendedor
                suma3 = suma3 + prova2d[i][j];

                // determine cuántas unidades han sido vendidos por cada vendedor
                if (NumProdu == prova2d[i][j]) {
                    sumcont++;

                }
                //Determinar cuál es el producto más vendido.
                if ((i== 0)&&(j==0)) {
                    pmasv = prova2d[i][j];
                    maxi = i;
                    maxj = j;
                } else if (pmasv < prova2d[i][j]) {
                    pmasv = prova2d[i][j];
                    maxi = i;
                    maxj = j;
                }
                //muestra array
                //System.out.print(prova2d[i][j] + " ");
            }
            // mayor vendedor
            //System.out.println("El vendedor:" + i + " ha vendido:" + suma3);
            if (mayorv == 0) {
                mayorv = suma3;
                v = i;
            } else if (mayorv < suma3) {
                mayorv = suma3;
                v = i;
            }
            //espacio entre filas
            //System.out.println("");
            System.out.println("El vendedor" + i + " ha vendido=" + sumcont + " vecces el producto");

        }

        System.out.println("");
        System.out.println("");
        System.out.println("");

        int i = 0;
        for (int j = 0; j < prova2d[0].length; j++) {
            num = i;
            suma = 0;

            for (i = 0; i < prova2d.length; i++) {
                //System.out.print(prova2d[i][j] + " ");

            }
            //System.out.println("");

        }
        System.out.println("vendedor ha vendido más unidades és = " + "vendedor:" + v + "Con:" + mayorv);
        System.out.println("El producto mas vendido és:" + maxi +","+ maxj + "  con unas ventas de:" + pmasv);
    }
}
