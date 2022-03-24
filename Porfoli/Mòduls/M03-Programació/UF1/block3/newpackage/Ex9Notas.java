package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Ex9Notas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        float nota, suspendido = 0, aprobado = 0, suficiente = 0, notable = 0, excelente = 0, nnotas = 0, be = 0;

        for (int alumnes = 10; alumnes > nnotas; alumnes--) {

            System.out.println("Intro numero");
            nota = in.nextInt();
            if (nota > 0 && nota <= 10) {
                if (nota >= 9) {
                    excelente = excelente + 1;
                    aprobado = aprobado + 1;

                } else if (nota >= 7) {
                    aprobado = aprobado + 1;
                    notable = notable + 1;
                } else if (nota >= 6) {
                    be++;
                    aprobado = aprobado + 1;
                } else if (nota >= 5) {
                    aprobado = aprobado + 1;
                    suficiente = suficiente + 1;
                } else {
                    suspendido = suspendido + 1;
                }
            } else {
                nota--;
                System.out.println("Nota no valida");
            }
        }

        System.out.println("Hi han: " + aprobado + " aprobados," + suspendido + " suspendidos," + suficiente + " suficientes," + be + " bé, " + notable + " Notable, " + excelente + " Excelente.");
    }
}
