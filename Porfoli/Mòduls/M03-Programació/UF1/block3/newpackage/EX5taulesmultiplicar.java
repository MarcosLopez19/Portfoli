package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class EX5taulesmultiplicar {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        int oper;

        for (int num = 2; num <= 10; num++) {

            for (int mult = 0; mult <= 10; mult++) {

                oper = num * mult;
                System.out.println(num+" * "+mult +" = "+ oper);
            }
        }
    }
}
