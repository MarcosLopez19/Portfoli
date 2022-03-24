/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

import java.util.Scanner;

/**
 *
 * @author marku
 */
public class Bloc3array2 {

    public static final int CLIENTES = 5;
    public static final int PLATOS = 5;

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        String[] Plats = new String[PLATOS];
        String[] Client = new String[CLIENTES];
        int[][] Comptes = new int[CLIENTES][PLATOS];

        array1(Plats, inNum, instr);
        array2(Client, inNum, instr);
        array3(Comptes, Client, Plats, inNum, instr);

    }

    public static void array1(String[] Plats, Scanner inNum, Scanner instr) {

        for (int i = 0; i < Plats.length; i++) {
            Plats[0] = "Jamon";
            Plats[1] = "Lechuga";
            Plats[2] = "Pure";
            Plats[3] = "Sopa";
            Plats[4] = "BocataBacon";

        }

    }

    public static void array2(String[] Clientes, Scanner inNum, Scanner instr) {
        for (int i = 0; i < Clientes.length; i++) {
            Clientes[0] = "Juan";
            Clientes[1] = "Marcos";
            Clientes[2] = "Carlos";
            Clientes[3] = "Adam";
            Clientes[4] = "Samuel";

        }
    }

    public static void array3(int[][] Cuentas, String Client[], String Plats[],
            Scanner inNum, Scanner instr) {
        int j = 0;
        for (int i = 0; i < Cuentas.length; i++) {
            //clientes

            for (j = 0; j < Cuentas[i].length; j++) {
                //platos
                Cuentas[0][0] = 1;
                Cuentas[0][1] = 6;
                Cuentas[0][2] = 3;
                Cuentas[0][3] = 3;
                Cuentas[0][4] = 5;
                Cuentas[1][0] = 1;
                Cuentas[1][1] = 1;
                Cuentas[1][2] = 3;
                Cuentas[1][3] = 3;
                Cuentas[1][4] = 5;
                Cuentas[2][0] = 1;
                Cuentas[2][1] = 1;
                Cuentas[2][2] = 3;
                Cuentas[2][3] = 3;
                Cuentas[2][4] = 5;
                Cuentas[3][0] = 1;
                Cuentas[3][1] = 1;
                Cuentas[3][2] = 3;
                Cuentas[3][3] = 3;
                Cuentas[3][4] = 5;
                Cuentas[4][0] = 7;
                Cuentas[4][1] = 1;
                Cuentas[4][2] = 3;
                Cuentas[4][3] = 3;
                Cuentas[4][4] = 5;
                System.out.println("El Cliente " + Client[i]
                        + "ha pedido " + Cuentas[i][j] + " veces del plato de " + Plats[j]);
            }
        }
    }

}
