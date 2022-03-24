package blockREPASO;

import java.util.Scanner;

public class ExRP2 {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int impares = 0, cont = 1, valormax = 10, i = 0, multiplicacion = 0;

        while (valormax > i) {
            i++;
            if (i % 2 == 0) {
                for (int mult = 0; mult < 10; mult++) {

                    System.out.println(i + "*" + mult + "=" + (mult * i));
                }
            } else {

            }
        }

    }

}
