package block2;

import java.util.Scanner;

public class EXSegundos1 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int seg, seg1, horas, horas1, dias, dias1, min, min1, ano1, ano;

        System.out.println("Intro segundos");
        seg = in.nextInt();

        min = seg / 60;
        seg1 = seg % 60;
        System.out.println(" min= " + min + "," + seg1);
        horas = min / 60;
        min1 = min % 60;
        System.out.println(" horas= " + horas + "," + min1);
        dias = horas / 24;
        horas1 = horas % 24;
        System.out.println(" dias= " + dias + "," + horas1);
        ano = dias / 365;
        dias1 = dias % 365;
        System.out.println(" años= " + ano + "," + dias1);
        

    }
}
