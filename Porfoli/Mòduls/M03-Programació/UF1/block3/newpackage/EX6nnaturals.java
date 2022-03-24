package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class EX6nnaturals {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int valormax = 100, suma = 0;

        for (int cont=0; cont <= valormax;cont++) {
           
            suma = cont + suma;

        }
        System.out.println(" El resultat és " + suma );
    }
}
