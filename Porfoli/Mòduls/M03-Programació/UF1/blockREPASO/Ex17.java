package blockREPASO;

import java.util.Arrays;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class Ex17 {

    public static void main(String[] args) {

        double[] numeros = new double[1000];

        compte(numeros);

    }

    public static void compte(double[] numeros) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        double suma = 0, ngrande = 0, npequeño = 0, mediana = 0, numeroacutal = 0, numeroplats = 0;
        int clientsAvui=0;

        boolean sortir=false;
        for (int i = 0; i < numeros.length && sortir==false; i++) {
            System.out.printf("intro coste del plato");
            numeros[i]= innum.nextFloat();
            clientsAvui++;
            if (numeros[i] == -1) {
                sortir=true;}

            suma += numeros[i];

            numeroacutal = numeros[i];

            if ((ngrande == 0) | (ngrande < numeroacutal)) {
                ngrande = numeroacutal;
            } else if ((npequeño == 0) | (npequeño > numeroacutal)) {
                npequeño = numeroacutal;
            }
            //System.out.println(numeros[i]);

        }
        

    }

}
