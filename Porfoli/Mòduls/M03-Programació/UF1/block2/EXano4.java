package block2;

import java.util.Scanner;

public class EXano4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int ano;

        System.out.println("Intro año");
        ano = in.nextInt();

        if (ano % 4 == 0) {
            if (ano % 100 == 0) {
                if (ano % 400 == 0) {
                    System.out.println("El" + ano + " es un añobisiesto ");
                } else {
                    System.out.println(" El " + ano + " No es un añobisiesto ");
                }
            } else {
                System.out.println("El" + ano + " es un añobisiesto ");
            }
        } else {
            System.out.println(" El " + ano + " No es un añobisiesto ");
        }
    }
}
