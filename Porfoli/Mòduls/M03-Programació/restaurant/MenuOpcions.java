package restaurant;

import restaurant.*;
import java.util.Scanner;

public class MenuOpcions {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String usuari = "";
        String passwd = "";
        boolean a = false;
        int opcio = 0;
        System.out.println("1.Reserva taula");
        System.out.println("2.Carta");
        System.out.println("3.Fes el compte");
        System.out.println("4.Pla “Clients fidels”");
        System.out.println("5.Receptari");
        System.out.println("6.Inventari de cuina");
        System.out.println("Que opción quieres");
        opcio = in.nextInt();

        if ((opcio > 0) && (opcio < 7)) {
            if (opcio == 1) {
                System.out.println("Estas en la opción 1");
            } else if (opcio == 2) {
                System.out.println("Estas en la opción 2");
            } else if (opcio == 3) {
                System.out.println("Estas en la opción 3");
            } else if (opcio == 4) {
                System.out.println("Estas en la opción 4");
            } else if (opcio == 5) {
                System.out.println("Estas en la opción 5");
            } else if (opcio == 6) {
                System.out.println("Estas en la opción 6");
            }
        } else {
            System.out.println("Selecione una opción valida");
        }
    }
}
