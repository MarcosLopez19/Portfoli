/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2A3_Funcions3;

import java.util.Scanner;
import org.w3c.dom.css.Counter;

/**
 *
 * @author marku
 */
public class Ex2 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Quantes taules de multiplicar vols mostrar?");

        int ntablas = in.nextInt();
        for (int x = 0; x < ntablas;) {
            System.out.println("");
            for (int j = 0; j < 10; j++) {
                System.out.println("");
                for (int i = 0; i < 4; i++) {

                    if (introduce(x, i, ntablas)) {
                        System.out.print(muntarLiniaTaulaMultiplicar(j, i, x));

                    }

                }

            }
            x = x + 4;
        }
    }

    static String muntarLiniaTaulaMultiplicar(int j, int i, int x) {
        String resultado = "";
        resultado = (( x +i + 1) + " x " + (j + 1) + " = " + ((x +i + 1) * (j + 1)) + "\t");
        return resultado;
    }

    static boolean introduce(int x, int i, int ntablas) {
        boolean introduce = false;
        if (x + i < ntablas) {
            introduce = true;
        }
        return introduce;
    }

}
