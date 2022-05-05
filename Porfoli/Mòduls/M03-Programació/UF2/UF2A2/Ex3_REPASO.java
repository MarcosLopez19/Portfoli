package UF2A2;

import java.util.*;
import java.util.Scanner;

public class Ex3_REPASO {

    public static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {

        sort(generaVector(in.nextInt()));
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

   public static void sort( String[] Array) {
        ArrayList<String> ArrayL = new ArrayList<String>();

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
