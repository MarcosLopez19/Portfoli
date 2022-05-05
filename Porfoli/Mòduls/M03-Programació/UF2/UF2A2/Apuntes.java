/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UF2A2;

import java.util.*;
import java.util.Arrays;
import java.util.Scanner;

public class Apuntes {
    public static Scanner in = new Scanner(System.in);
    public static final int files = 5;
    public static final int columnes = 5;
    public static void main(String[] args) {

        cercaBinariaSTR(generaVector(in.nextInt()), in);
        mostraVector(args);
        
        String str = "geekss@for@geekss";
        String[] arrystr = str.split("@", 2);

        for (String a : arrystr) {
            System.out.print(a + " ");
        }
        //El split parte el string en la posicion indicada hasta el limite que le pongamos
        //str.split(caracter, limite);
        
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
    public static int[][] arrayRandom() {
        int[][] arrayTest = new int[files][columnes];
        for (int i = 0; i < files; i++) {
            for (int j = 0; j < columnes; j++) {
                arrayTest[i][j] = ((int) ((Math.random() * 2)) - 1);
            }
        }
        return arrayTest;
    }
    public static void ordenaSeleccio(int[] Array) {
        int aux;
        for (int i = 0; i < Array.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < Array.length; j++) {
                if (Array[j] < Array[minimo]) {
                    minimo = j;
                }
            }
            aux = Array[i];
            Array[i] = Array[minimo];
            Array[minimo] = aux;
        }
        mostraVector(Array);
    }
    public static void ordenaBombolla(int[] Array) {
        int aux;
        for (int i = 0; i < Array.length - 1; i++) {
            for (int j = 0; j < Array.length - i - 1; j++) {
                if (Array[j] > Array[j + 1]) {
                    aux = Array[j];
                    Array[j] = Array[j + 1];
                    Array[j + 1] = aux;
                }
            }
        }
        mostraVector(Array);
    }
    public static void cercaBinariaSTR(String[] args, Scanner in) {        
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
    public static void cercabinariaINT(int[] array, int tamanyoArry, Scanner in) {
        Arrays.sort(array);
        int i = 0;
        int low = 0;
        int mid;
        int hight = array.length - 1;
        boolean numeroencontrado = false;

        System.out.println("Quen numero quieres buscar?");
        int x = in.nextInt();

        while ((low<=hight)&&(numeroencontrado == false)) {
            mid = (low + hight) / 2;

            if (array[mid] == x) {
                numeroencontrado = true;
                System.out.println("Esta en la posicion" + mid);
            } else if (array[mid] > x) {
                hight = mid - 1;

            } else if (array[mid] < x) {
                low = mid + 1;
            }

            i++;
        }
        System.out.println("N0 de vueltas=" + i);
        if (numeroencontrado) {
            System.out.println("El numero " + x + " Se ha encotrado");
        }
    }
    public static void sort(int numElements, int[] Array) {
        ArrayList<Integer> ArrayL = new ArrayList<Integer>();

        for (int i = 0; i < Array.length; i++) {
            ArrayL.add(Array[i]);
        }
        Collections.sort(ArrayL);
        System.out.println(ArrayL);
    }
    public static void trim(String str) {
        String sCadena = " Esto Es Una Cadena";
        System.out.println(sCadena.trim());  //El trim quita los espacios que hay al inicio y al final
    }  
}
