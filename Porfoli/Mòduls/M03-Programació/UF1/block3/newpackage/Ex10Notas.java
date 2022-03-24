package block3.newpackage;

import block2.*;
import java.util.Scanner;

public class Ex10Notas {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Esto es un bucle, este en especifico se utiliza cuando sabemos las veces que se va a repetir
        float nota, suspendido = 0, aprobado = 0, suficiente = 0, notable = 0, excelente = 0, nnotas = 0, mapro = 0, msus = 0, papro = 0, psus = 0, sumasus = 0, sumaapro = 0;

        for (int alumnes = 10; alumnes > nnotas; alumnes--) {

            System.out.println("Intro numero");
            nota = in.nextInt();

            if (nota >= 9) {
                excelente = excelente + 1;
                aprobado = aprobado + nota;

            } else if (nota >= 7) {
                aprobado = aprobado + 1;
                notable = notable + 1;
                sumaapro = sumaapro + nota;

            } else if (nota >= 5) {
                aprobado = aprobado + 1;
                suficiente = suficiente + 1;
                sumaapro = sumaapro + nota;
            } else {
                suspendido = suspendido + 1;
                sumasus = nota + sumasus;
            }

        }
        mapro = sumaapro / aprobado;
        System.out.println(" nota media aprobados: " + mapro);
        msus = sumasus / suspendido;
        System.out.println(" nota media : " + msus);
        papro = (aprobado * 100 / (aprobado + suspendido));
        psus = (suspendido * 100 / (aprobado + suspendido));

        System.out.println("Hi han: " + aprobado + " aprobados," + suspendido + " suspendidos," + suficiente + " suficientes," + notable + " Notable, " + excelente + " Excelente.");

        System.out.println(" Porciento de aprobados: " + papro);
        System.out.println(" Porcientos de suspendidos : " + psus);
    }
}
