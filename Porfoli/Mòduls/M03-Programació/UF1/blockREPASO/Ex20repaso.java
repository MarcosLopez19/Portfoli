package blockREPASO;

import java.util.Scanner;

public class Ex20repaso {

    public static final double SALARIOESTANDAR = 30;

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);
        String horario = "", opcion = "";

        boolean salir = false;

        int i = 0, horas;
        double Mañana,
                Noche = 1.5, Tarde = 1.2, salario = 0, pcSalario;

        while (salir == false) {
            horas = 0;
            System.out.println("Intro num horas");
            horas = innum.nextInt();

            
             //horarios
            System.out.println("Intro horario: Manyana,Trde,Noche");
            horario = instr.nextLine();
          
            if (horario.equalsIgnoreCase("Manyana")) {
                salario = horas * SALARIOESTANDAR;

            } else if (horario.equalsIgnoreCase("Tarde")) {
                salario = horas * SALARIOESTANDAR * Tarde;

            } else if (horario.equalsIgnoreCase("Noche")) {
                salario = horas * SALARIOESTANDAR * Noche;
            } else {
            }
            
            //impuestos
            if (salario < 700) {
                pcSalario = 8 * salario / 100;
                salario = salario - pcSalario;

            } else if (salario < 1000) {
                pcSalario = 10 * salario / 100;
                salario = salario - pcSalario;

            } else if (salario < 1100) {
                pcSalario = 12 * salario / 100;
                salario = salario - pcSalario;
            }
            System.out.println("El Cliente Tendra un salario de" + salario + "€");
            
            System.out.println("");
            System.out.println("");
            System.out.println("");
            System.out.println("hay más trabajadores? SI/NO?");
            if (opcion.equalsIgnoreCase("SI")) {
                salir = true;
            } else {
            }
        }

    }

}
