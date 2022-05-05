package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex4_REPASO {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        cercaBinaria(generaVector(in.nextInt()), in);
    }

    public static String[] generaVector(int limite) {
        in.nextLine();
        String x = "";
        String[] Array = new String[limite];

        for (int i = 0; i < limite; i++) {
            x = in.nextLine();
            Array[i] = x;
        }
        return Array;

    }

    public static void mostraVector(String[] Array) {
        System.out.print("Països ordenats:");
        for (int i = 0; i < Array.length; i++) {
            System.out.println(Array[i]);
        }
        System.out.println("");
    }

    public static void cercaBinaria(String[] args, Scanner in) {        
        Arrays.sort(args);
        
        int hight= args.length - 1, low=0,i=0;
        boolean encontrado = false;
        String x = in.nextLine();
        while ((low <= hight) && (!encontrado)) {

            int mid = (hight + low) / 2;

            if (args[mid].equals(x)) {
                encontrado=true;
                
            } else if (args[hight].compareTo(x)>0) {
                /*Se devuelve un valor menor que 0 si la cadena
                es menor que la otra cadena (menos caracteres) y 
                un valor mayor que 0 si la cadena es mayor que la 
                otra cadena (más caracteres).*/
                hight=mid-1;
            } else {
                low=mid+1;
            }
            i++;
        }
        if(encontrado){
            System.out.println("Se ha encontrado");
        
        }else{
            System.out.println("No se ha encotrado");
        }
        System.out.println("Numero de vueltas="+i);
    }

}
