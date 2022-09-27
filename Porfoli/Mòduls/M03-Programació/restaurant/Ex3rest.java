package restaurant;

import restaurant.*;
import java.util.Scanner;

public class Ex3rest {

    public static final double IVA = 0.05;
    public static final double descompte = 0.05;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        login();
    }

    public static void login() {
        Scanner in = new Scanner(System.in);
        String usuari = "";
        String passwd = "";
        boolean validacio = false;
        int i = 3, funcio = 0;
        while ((i > 0) && (validacio == false)) {

            System.out.println("intro USUARIO");
            usuari = in.nextLine();
            System.out.println("intro CONTRASEÑA");
            passwd = in.nextLine();

            if (usuari.equals("MarcosLopez")) {
                if (passwd.equals("123")) {
                    validacio = true;
                }
            } else {
                i--;
                System.out.println("ERROR usuario o contraseña incorrecto");
                System.out.println("Tienes " + i + " intentos");
            }
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("");
        }
        if (validacio) {
            System.out.println("Sesión iniciada");
            menu();

        } else {
            System.out.println("ErrorMaximo de intentos permitidos");
        }

    }

    public static void menu() {
        Scanner in = new Scanner(System.in);
        boolean menu = false;
        int opcio = 0;
        while (opcio != 7) {
            System.out.println("1.Reserva taula");
            System.out.println("2.Carta");
            System.out.println("3.Fes el compte");
            System.out.println("4.Pla “Clients fidels”");
            System.out.println("5.Receptari");
            System.out.println("6.Inventari de cuina");
            System.out.println("7.Salir");
            System.out.println("");
            System.out.println("Que opción quieres");
            opcio = in.nextInt();

            if ((opcio > 0) && (opcio < 7)) {
                if (opcio == 1) {
                    System.out.println("Estas en la opción 1");
                }
                if (opcio == 2) {
                    System.out.println("Estas en la opción 2");
                }
                if (opcio == 3) {
                    FesElCompte();
                }
                if (opcio == 4) {
                    System.out.println("Estas en la opción 4");
                }
                if (opcio == 5) {
                    System.out.println("Estas en la opción 5");
                }
                if (opcio == 6) {
                    InventariDeCuina();
                }
                if (opcio == 7) {
                    System.out.println("salir");

                }
            } else {
                System.out.println("Selecione una opción valida");
            }
        }

    }

    public static void FesElCompte() {
        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        String productes = "";
        double preutotal = 0, preutotaliva = 0, descnoiva = 0, desciva = 0, plats, votacio = 0, cantitat;

        do {
            plats = 0;
            cantitat = 0;
            System.out.println("intro preu plat, peru demoment:" + preutotal);
            plats = innum.nextInt();
            System.out.println("intro quantitat del plat");
            cantitat = innum.nextInt();
            plats = cantitat * plats;
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

    public static void InventariDeCuina() {

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
            System.out.println("intro cantidad  de "+  producto1);
            producte1 = innum.nextInt();
            System.out.println("intro cantidad minima del producto1");
            minimp1 = innum.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("intro nombre producto2");
            producto2 = instr.nextLine();
            System.out.println("intro cantidad  de "+  producto2);
            producte2 = innum.nextInt();
            System.out.println("intro cantidad minima del producto2");
            minimp2 = innum.nextInt();
            System.out.println("");
            System.out.println("");
            System.out.println("");

            System.out.println("intro nombre producto3");
            producto3 = instr.nextLine();
            System.out.println("intro cantidad  de "+  producto3);
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
