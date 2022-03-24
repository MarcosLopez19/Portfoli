package block2;

import java.util.Scanner;

public class Expiedras {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int piedras, PedresPerFila = 0;
        int pedresPosades = 0;
        System.out.println("Intro numero");
        piedras = in.nextInt();
        while (pedresPosades <= piedras) {
            PedresPerFila++;
            pedresPosades = pedresPosades + PedresPerFila;
        }
        System.out.println("El El triangle es de " + (PedresPerFila - 1));
        System.out.println(" Sobren " + (piedras - (pedresPosades - PedresPerFila)));

    }
}
