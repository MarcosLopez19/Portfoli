package block5;

import blockREPASO.*;
import java.util.Scanner;
import javax.imageio.plugins.tiff.ExifGPSTagSet;

public class ExamenEx2 {

    public static void main(String[] args) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        String num = "",caracter1 ="",
                caracter2 = "", caracter3 = "", caracter4 = "";
        int i, numeros, valormax = 0,suma=0,n1,n2,n3,n4;

        System.out.println("Intro numero de 8 xifres");
        num = instr.nextLine();
        for (i = 0; i < num.length(); i++) {
            if ((i == 0) || (i == 1)) {
                caracter1 = caracter1 + num.charAt(i);

                System.out.println(caracter1);
                
            } else if ((i == 2) || (i == 3)) {
                caracter2 = caracter2 + num.charAt(i);

               System.out.println(caracter2);
               
            } else if ((i == 4) || (i == 5)) {
                caracter3 = caracter3 + num.charAt(i);
               System.out.println(caracter3);  

               
            } else if ((i == 6) || (i == 71)) {
                caracter4= caracter4 + num.charAt(i);
                System.out.println(caracter4);

            }
        }
        System.out.println(suma=caracter1+caracter2+caracter3+caracter4);
    }

}
