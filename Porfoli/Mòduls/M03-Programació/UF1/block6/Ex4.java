package block6;

import Restaurant.ClassEx4;
import java.lang.invoke.MethodHandles;
import java.util.Scanner;
import repaso.classCotxe;

public class Ex4 {

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        ClassEx4[] Notas = new ClassEx4[4];
        array(Notas, inNum, instr);
        imprime(Notas);
        MediaAlumno(Notas, inNum, instr);
        MediaM0(Notas, inNum, instr);
    }

    public static void array(ClassEx4[] Notas, Scanner inNum, Scanner instr) {
        for (int i = 0; i < Notas.length; i++) {

            System.out.println("Intro Nota M01");
            int M01 = inNum.nextInt();
            System.out.println("Intro Nota M02 ");
            int M02 = inNum.nextInt();
            System.out.println("Intro Nota M03");
            int M03 = instr.nextInt();
            System.out.println("Intro Nota M04");
            int M04 = instr.nextInt();

            Notas[i] = new ClassEx4(M01, M02, M03, M04);
        }
    }

    public static void imprime(ClassEx4[] Notas) {
        for (int i = 0; i < Notas.length; i++) {
            Notas[i].imprimeix();
        }
    }

    public static void MediaAlumno(ClassEx4[] Notas, Scanner inNum, Scanner instr) {
        double suma;
        for (int i = 0; i < Notas.length; i++) {
            suma = 0;
            suma = suma + Notas[i].getM01()+Notas[i].getM02()+Notas[i].getM03()+Notas[i].getM04();

            System.out.println("La media del Alumno" + i + " és: " + (suma = suma / 4));
        }
    }

    public static void MediaM0(ClassEx4[] Notas, Scanner inNum, Scanner instr) {
        double media1 = 0, media2 = 0, media3 = 0, media4 = 0;

        for (int i = 0; i < Notas.length; i++) {
            media1 = media1 + Notas[i].getM01();
            media2 = media2 + Notas[i].getM02();
            media3 = media3 + Notas[i].getM03();
            media4 = media4 + Notas[i].getM04();

        }
        System.out.println("La media de La nota de M01 és: " + media1 / 4);
        System.out.println("La media de La nota de M02 és: " + media2 / 4);
        System.out.println("La media de La nota de M03 és: " + media3 / 4);
        System.out.println("La media de La nota de M04 és: " + media4 / 4);
    }
}
