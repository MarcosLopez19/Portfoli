package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ExPrueba {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        float media = 0;
        float[] notes = new float[11];

        for (int i = 0; i < notes.length; i++) {
            System.out.println("intro num");
            notes[i] = innum.nextInt();
            media += notes[i];
        }
        media = media / notes.length;
        System.out.println("La media10 és" + media);
        //System.out.println("El numero más pequeño" + Vpeque);
        //System.out.println("El numero más grande" + Vgran);
    }

}
