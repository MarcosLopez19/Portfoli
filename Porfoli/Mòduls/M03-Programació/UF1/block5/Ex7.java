package bloc5;

import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {

        char[] letras = {'a', 'b', 'c', 'd', 'e', 'f'};
        contador(letras);

    }

    public static void contador(char[] letrass) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        boolean si = false, salir = false;

        System.out.println("intro palabra");
        String palabra = instr.nextLine();

        for (int i = 0; i <= palabra.length()-1; i++) {

            si = false;
            for (int j = 0; j < letrass.length; j++) {

                if (letrass[j] == palabra.charAt(i)) {
                    si = true;
                }
            }
            if (si == false) {
                salir = true;
            }
        }

        if (salir != true) {
            System.out.println("letra coincide");
        } else {
            System.out.println("no coincide");
            salir = true;
        }
    }
}
