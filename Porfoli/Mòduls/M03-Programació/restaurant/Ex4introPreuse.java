package restaurant;

import restaurant.*;
import java.util.Scanner;

public class Ex4introPreuse {

    public static final double IVA = 0.05;
    public static final double descompte = 0.05;

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        double preutotal = 0, preutotaliva = 0, descnoiva = 0, desciva = 0, plats = 0, votacio = 0;

        do {
            System.out.println("intro preu plat, peru demoment:" + preutotal);
            plats = innum.nextInt();
            preutotal = plats + preutotal;

        } while (plats != 0);

        System.out.println("Es client fidel SI=1");
        System.out.println("Es client fidel NO=0");
        votacio = innum.nextInt();

        if (votacio == 1) {// fidel
            preutotaliva = (preutotal * IVA / 100) + preutotal;
            desciva = preutotaliva - (preutotaliva * (1 + descompte) / 100);
            System.out.println("El preu total amb iva: " + preutotaliva);
            System.out.println("El preu amb descompte és: " + desciva);

        } else {//No fidel
            preutotaliva = (preutotal * (1 + IVA) / 100) + preutotal;
            System.out.println("El preu total amb iva: " + preutotaliva);

        }

    }

}
