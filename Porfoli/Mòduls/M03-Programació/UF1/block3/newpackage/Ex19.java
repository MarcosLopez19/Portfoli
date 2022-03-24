package block3.newpackage;

import block2.*;
import java.util.Scanner;
import java.lang.Math;

public class Ex19 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        double m = 0, n = 0;
        System.out.println("intro n1");
        m = in.nextDouble();
        System.out.println("intro n2");
        n = in.nextDouble();
        
        double pot=Math.pow(m, n);
         System.out.println("la potencia és " + pot);
        pot=1;
        for(int i=1; i<=n; i++);
            pot=pot*m;

        System.out.println("La potencia és" + pot);

    }
}
