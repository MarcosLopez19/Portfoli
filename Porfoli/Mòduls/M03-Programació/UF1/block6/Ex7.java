package block6;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;
import repaso.classCotxe;

public class Ex7 {

    public static final int filas = 3;
    public static final int columnas = 5;

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        ClassEx72[] Empleadoss = new ClassEx72[Empleados];
        ClassEx7[] Departamentoss = new ClassEx7[Departamentos];
        array(Empleadoss, inNum, instr);
        array2(Departamentoss, inNum, instr);
        Equals(Empleadoss, Departamentoss, inNum, instr);
        telefono(Empleadoss, inNum, instr);
    }

    public static void array(ClassEx72[] Empleados, Scanner inNum, Scanner instr) {
        for (int i = 0; i < Empleados.length; i++) {

            Empleados[0] = new ClassEx72("Marcos", 18, "29893452", "COD");
            Empleados[1] = new ClassEx72("Adam", 19, "2135324", "LOL");
            Empleados[2] = new ClassEx72("Juan", 21, "2135324", "WOW");
        }
    }

    public static void array2(ClassEx7[] Departamentos, Scanner inNum, Scanner instr) {
        for (int i = 0; i < Departamentos.length; i++) {

            Departamentos[0] = new ClassEx7("COD", 500, 1000);
            Departamentos[1] = new ClassEx7("LOL", 190, 500);
            Departamentos[2] = new ClassEx7("WOW", 400, 1200);
        }
    }

    public static void Equals(ClassEx72[] Empleadoss, ClassEx7[] Departamentoss, Scanner inNum, Scanner instr) {
        String teclado = "";
        int edep = 0, horas = 0, sueldo = 0;
        System.out.println("Intro Departamaneto");
        teclado = instr.nextLine();

        for (int i = 0; i < Empleadoss.length; i++) {
            if (teclado.equals(Empleadoss[i].getDepartamento())) {
                edep++;
            } else {
            }
        }
        for (int i = 0; i < Departamentoss.length; i++) {

            if (teclado.equals(Departamentoss[i].getDepartamento())) {
                horas = edep * Departamentoss[i].getHoras();
                sueldo = edep * Departamentoss[i].getSueldo();
            } else {
            }
        }
        System.out.println("Hay trabajando en " + teclado + edep + "Empleados");
        System.out.println("Hay un total de " + horas + " horas en total");
        System.out.println("Hay un total de " + sueldo + " sueldo en total");
    }

    public static void telefono(ClassEx72[] Empleadoss, Scanner inNum, Scanner instr) {
        String cadena1 = "";

        for (int i = 0; i < Empleadoss.length; i++) {
            System.out.println("Nou Telefon");
            String nouTelefono = instr.nextLine();

            //cambiar telefono treballador 0
            System.out.println("Nou telèfon");
            nouTelefono = instr.nextLine();
            Empleadoss[0].setTelefono(nouTelefono);
            Empleadoss[0].checkTelefon(nouTelefono);

        }

    }

    public static void departament(ClassEx72[] Empleadoss, ClassEx7[] Departamentos, Scanner inNum, Scanner instr) {
        String nouDepartament = "";
        int i = 0;
        do {
            System.out.println("Nou Departament");
            nouDepartament = instr.nextLine();

            if (Departamentos[i].getDepartamento().equals(nouDepartament)) {
                for (int j = 0; j < Empleadoss.length; j++) {
                    Empleadoss[0].setDepartamento(nouDepartament);

                }
            }
            i++;
        } while (i < Departamentos.length);

    }
}
