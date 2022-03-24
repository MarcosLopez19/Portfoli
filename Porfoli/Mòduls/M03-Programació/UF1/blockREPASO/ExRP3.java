package blockREPASO;

import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ExRP3 {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int impares = 0, cont = 1, valormax = 3,
                numero = 0, sum = 0, i = 0, media = 0, Vgran = 0, Vpeque = 1000;

        while (valormax > i) {
            i++;
            System.out.println("intro numero");
            numero = innum.nextInt();
            sum = numero + sum;
            if (Vgran < numero) {
                Vgran = numero;
            } else if (Vpeque > numero) {
                Vpeque = numero;
            }
        }
        media = sum / i;
        System.out.println("La media és" + media);
        System.out.println("El numero más pequeño" + Vpeque);
        System.out.println("El numero más grande" + Vgran);
    }

}
