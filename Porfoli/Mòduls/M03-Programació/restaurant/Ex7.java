package restaurant;

import restaurant.*;
import java.util.Scanner;

public class Ex7 {

    public static void main(String[] args) {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        boolean Salir = false;
        String votacion = "";
        String cadenaTaula = "";
        String agua = "agua";
        String cerveza = "cerveza";
        String vino = "vino";
        String caracter = "";
        double precio1 = 2.55, precio2 = 3, precio3 = 4.55;

        System.out.println("intro productos");
        cadenaTaula = instr.nextLine();
        cadenaTaula = cadenaTaula + ' ';
        //System.out.println("intro precio producto1");
        // precio1 = innum.nextInt();

        for (int i = 0; i < cadenaTaula.length(); i++) {

            if (cadenaTaula.charAt(i) != ' ') {
                caracter.valueOf(cadenaTaula.charAt(i));
                caracter = caracter + cadenaTaula.charAt(i);

            } else {

                if (caracter != " ") {
                    if (caracter.equals("cerveza")) {
                        System.out.print(caracter);
                        System.out.print(">>");
                        System.out.println(" " + precio1);
                        caracter = "";
                    } else if (caracter.equals("aigua")) {
                        System.out.print(caracter);
                        System.out.print(">>");
                        System.out.println(" " + precio2);
                        caracter = "";
                    } else if (caracter.equals("calamar")) {
                        System.out.print(caracter);
                        System.out.print(">>");
                        System.out.println(" " + precio3);
                        caracter = "";
                    } else if ((caracter != "calamar") | (caracter != "aigua") | (caracter != "cerveza")) {
                        System.out.print(">>");

                        System.out.println("El producto  " + caracter + " invalido");
                        caracter = "";
                    }

                }
            }

        }

    }
}
