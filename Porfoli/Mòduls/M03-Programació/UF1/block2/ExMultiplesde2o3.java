package block2;

import java.util.Scanner;

public class ExMultiplesde2o3 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numero;

        System.out.println("Intro año");
        numero = in.nextInt();

        if ((numero % 2 == 0) && (numero % 3 == 0)) {
            System.out.println("El numero " + numero + " SI es multiple de 2 y 3");
        } else if (numero % 2 == 0) {
            System.out.println("El numero " + numero + " NO multiple de 2 ");
        } else if (numero % 3 == 0) {
            System.out.println("El numero " + numero + " Es multiple de 3 ");
        }else 
          System.out.println("El numero " + numero + " NO Es multiple de 3 ");    
      }     
    }

