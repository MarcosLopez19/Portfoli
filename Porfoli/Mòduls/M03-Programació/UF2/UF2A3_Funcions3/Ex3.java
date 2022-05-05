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
public class Ex3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        /*Selecion de la palabra secreta*/
        String palabra = selecioDeParaula();
        /*Array con la palabra dentro*/
        char[] Array = palabra.toCharArray();

        /*Palabra secreta sin mostrar*/
        String PalabraS = secreta(Array);
        char Letra;
        int fallos = 1;
        String igualar = "", cadenaletras = "";
        caseAorcado(fallos);
        int i = 0;
        boolean correcto = false;
        System.out.println(palabra);

        while ((fallos < 8) && (correcto == false)) {

            System.out.println("Palabra: " + PalabraS);

            System.out.println("Introduce una letra:");
            Letra = in.next().charAt(0);
            cadenaletras += Letra;

            igualar = PalabraS;
            for (int j = 0; j < Array.length; j++) {
                PalabraS = remplazo(Array[j], Letra, j, PalabraS, palabra);

                if (PalabraS.equals(palabra)) {
                    correcto = true;
                }
            }
            if (PalabraS.equals(igualar)) {
                System.out.println("ERRORRRRR FALLASTE");
                fallos++;
            } else {
            }
            i++;
            caseAorcado(fallos);
            System.out.println("Letras Introducidas: " + cadenaletras);
        }
        if (fallos == 8) {
            System.out.println("OOOOOoooohhhh! Has perdut!!");

        }
    }

    static String remplazo(char caracter, char Letra, int num, String PalabraS, String palabra) {

        for (int i = 0; i < PalabraS.length(); i++) {
            if (palabra.charAt(i) == Letra) {
                StringBuilder cadenaModi = new StringBuilder(PalabraS);//Creamos un builder a partir del String original
                cadenaModi.setCharAt(i, palabra.charAt(i));
                PalabraS = cadenaModi.toString();
            }
        }

        return PalabraS;
    }

    static String secreta(char[] Array) {
        String secreta = "";
        for (int i = 0; i < Array.length; i++) {
            secreta += "*";
        }
        return secreta;
    }

    static String selecioDeParaula() {
        int numAleatorio = (int) (Math.random() * 5);
        String palabra = "";
        switch (numAleatorio) {
            case 0:
                palabra = "jajabro";
                break;
            case 1:
                palabra = "patata";
                break;
            case 2:
                palabra = "marcos";
                break;
            case 3:
                palabra = "casco";
                break;
            case 4:
                palabra = "funda";
                break;
            case 5:
                palabra = "ordenador";
                break;
        }
        return palabra;
    }

    static void caseAorcado(int fallos) {
        switch (fallos) {
            case 1:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 2:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |     \n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 3:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |    |\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 4:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;

            case 5:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /|\n"
                        + "  |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 6:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /||\n"
                        + "  |    |\n"
                        + "  |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");

                break;
            case 7:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /||\n"
                        + "  |    |\n"
                        + "  |   / \n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
            case 8:
                System.out.println("   ____\n"
                        + "  |    |\n"
                        + "  |    o\n"
                        + "  |   /||\n"
                        + "  |    |\n"
                        + "  |   / |\n"
                        + " _|_\n"
                        + "|   |______\n"
                        + "|          |\n"
                        + "|__________|");
                break;
        }
    }

}
