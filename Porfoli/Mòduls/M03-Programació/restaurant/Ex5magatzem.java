package restaurant;

import restaurant.*;
import java.util.Scanner;

public class Ex5magatzem {

    public static void main(String[] args) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        boolean Salir = false;
        String votacion = "";
        String producto1 = "";
        String producto2 = "";
        String producto3 = "";
        String equals1 = "";

        int producte1 = 0, producte2 = 0, producte3 = 0, minimp1 = 0, minimp2 = 0, minimp3 = 0, pn1 = 0, pn2 = 0, pn3 = 0;

        while (Salir == false) {
            System.out.println("intro nombre producto1");
            producto1 = instr.nextLine();
            System.out.println("intro cantidad producto1");
            producte1 = innum.nextInt();
            System.out.println("intro cantidad minima del producto1");
            minimp1 = innum.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("intro nombre producto2");
            producto2 = instr.nextLine();
            System.out.println("intro cantidad producto2");
            producte2 = innum.nextInt();
            System.out.println("intro cantidad minima del producto2");
            minimp2 = innum.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("intro nombre producto3");
            producto3 = instr.nextLine();
            System.out.println("intro cantidad producto3");
            producte3 = innum.nextInt();
            System.out.println("intro cantidad minima del producto3");
            minimp3 = innum.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("(intro nombre del producto) para saber su cantidad necesaria");
            equals1 = instr.nextLine();
            System.out.println("");
            System.out.println("");

            if (producto1.equalsIgnoreCase(equals1)) {
                if (producte1 >= minimp1) {
                    System.out.println("La cantidad del " + producto1 + " es correcta y sobran " + (producte1 - minimp1) + " Kg");
                } else {
                    System.out.println("Tiens que pedir" + (producte1 - minimp1) + " Kg " + producto1);
                }
            }
            if (producto2.equalsIgnoreCase(equals1)) {
                if (producte2 >= minimp2) {
                    System.out.println("La cantidad del " + producto2 + " es correcta y sobran " + (producte2 - minimp2) + " Kg");
                } else {
                    System.out.println("Tiens que pedir" + (producte2 - minimp2) + " Kg " + producto2);
                }
            }
            if (producto3.equalsIgnoreCase(equals1)) {
                if (producte3 >= minimp3) {
                    System.out.println("La cantidad del " + producto3 + " es correcta y sobran " + (producte3 - minimp3) + " Kg");
                } else {
                    System.out.println("Tiens que pedir" + (producte3 - minimp3) + " Kg " + producto2);
                }
            }
            System.out.println("Quires salir?(S/N)");
            votacion = instr.nextLine();

            if (votacion.equalsIgnoreCase("S")) {
                Salir = true;
            } else {
            }
        }
    }

}
