package UF2A2;

import java.util.*;
import java.util.Scanner;
public class Ex3 {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        int numElements = in.nextInt() + 1;
        String Array[] = generaVector(numElements, in);
        sort(numElements, Array);
    }

    public static String[] generaVector(int numElements, Scanner in) {
        String paises = "";
        String[] Array = new String[numElements];
        for (int i = 0; i < Array.length; i++) {
            paises = in.nextLine();
            Array[i] = paises;

        }
        return Array;
    }

    public static void sort(int numElements, String[] Array) {
        ArrayList<String> ArrayL = new ArrayList<String>();
        String a="";
        for (int i = 0; i < Array.length; i++) {
            ArrayL.add(Array[i]);
        }
        Collections.sort(ArrayL);
         Iterator itr = ArrayL.iterator();
        System.out.print("Països ordenats:");
        while (itr.hasNext()) {
            System.out.println(itr.next());
    }
    }
}
