package restaurant.B2;

import restaurant.*;
import java.util.Arrays;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class array2 {

    public static void main(String[] args) {

        String[] plats = {"Macarones", "Platanos", "Ensalada", "Sopa", "Pollo", "jamon"};
        int[] quantitat = new int[6];

        compte(plats, quantitat);

    }

    public static void compte(String[] Plats, int[] quantitat) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        String platpopular = "", platmeyspopular = "";

        int suma = 0, mespopular = 0, menyspopular = 0;
        boolean sortir = false;
        float percentatge = 0;

        for (int i = 0; i < Plats.length && sortir == false; i++) {

            quantitat[i] = (int) (Math.random() * 5) + 1;

            suma += quantitat[i];

            if ((mespopular == 0) || (mespopular < quantitat[mespopular])) {
                mespopular = i;

            } else if ((menyspopular == 0) || (menyspopular > quantitat[menyspopular])) {
                menyspopular = i;
            }
        }
        //System.out.println(Arrays.toString(quantitat));
        percentatge = (float) quantitat[mespopular] * 100 / suma;
        System.out.printf("El pecentatge del plat més popular és:" + "%.2f", percentatge);
        System.out.println("");
        System.out.println("En total s'han servit : " + suma + " plats ");
        System.out.println("El plat més popular: " + Plats[mespopular]);
        System.out.println("El plat menys popular: " + Plats[menyspopular]);
    }

}
