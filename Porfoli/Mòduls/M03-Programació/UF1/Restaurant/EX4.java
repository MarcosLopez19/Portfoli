/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import static Restaurant.Bloc3array2.CLIENTES;
import static Restaurant.Bloc3array2.PLATOS;
import java.util.Scanner;

/**
 *
 * @author marku
 */
public class EX4 {

    public static final int CLIENTES = 5;

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        ClassEx4[] Client = new ClassEx4[CLIENTES];

        Client[0] = new ClassEx4("Joan", "123456", "joan@joan.com", 125.25, 10);
        Client[1] = new ClassEx4("Joana", "158964", "joana@joan.com", 15.25, 10);
        Client[2] = new ClassEx4("Maria", "458263", "maria@joan.com", 25.25, 15);
        Client[3] = new ClassEx4("Luci", "123444", "luci@joan.com", 54.45, 15);
        Client[4] = new ClassEx4("Mario", "166456", "mario@joan.com", 75.00, 20);
        menu(Client, inNum, instr);
    }

    public static void menu(ClassEx4[] Clients,
            Scanner inNum, Scanner instr) {

        boolean salir = false;
        int i = 0, opcion;
        do {
            opcion = 0;
            System.out.println("1.Cerca client per NIF i mostra info del client");
            System.out.println("2.Calcula despesa feta global");
            System.out.println("3.Mostra client amb més despesa");
            System.out.println("4.Modifica correu");
            System.out.println("5.Modifica descompte");
            System.out.println("6.Sortir");
            System.out.println("7.Salir");
            System.out.println("Intro opcion");
            opcion = inNum.nextInt();

            if (opcion == 1) {

            } else if (opcion == 2) {

            } else if (opcion == 3) {

            } else if (opcion == 4) {

            } else if (opcion == 5) {

            } else if (opcion == 6) {

            } else if (opcion == 7) {
                salir = true;
            }
        } while (salir = false);
    }
}
