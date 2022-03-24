package block6;

import java.lang.invoke.MethodHandles;
import java.util.Scanner;
import repaso.classCotxe;

public class Ex3 {

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        ClassEx3[] Empleados = new ClassEx3[3];
        array(Empleados, inNum, instr);
        imprime(Empleados);
        ContaProv(Empleados, inNum, instr);
    }

    public static void array(ClassEx3[] Empleados, Scanner inNum, Scanner instr) {
        for (int i = 0; i < Empleados.length; i++) {

            System.out.println("Intro Calle Numero");
            int CalleNumero = inNum.nextInt();
            System.out.println("Intro Codgio Postal: ");
            int Codigo_Postal = inNum.nextInt();
            System.out.println("Intro Localidad:");
            String Localidad = instr.nextLine();
            System.out.println("Intro Provincia:");
            String Provincia = instr.nextLine();

            Empleados[i] = new ClassEx3(CalleNumero, Codigo_Postal, Localidad, Provincia);
        }
    }

    public static void imprime(ClassEx3[] Empl) {
        System.out.println("Las Peliculas són:");
        for (int i = 0; i < Empl.length; i++) {
            Empl[i].imprimeix();
        }
    }

    public static void ContaProv(ClassEx3[] Empl, Scanner inNum, Scanner instr) {

        int cont = 0; 
        
        System.out.println("Intro provincia:");
        String pr = instr.nextLine();

        for (int i = 0; i < Empl.length; i++) {
            if (pr.equals(Empl[i].getProvincia())) {
                cont++;
            } else {
            }
        }
        System.out.println("Hay un total de " + cont + " Empleados trabajando en " + pr);
    }
}
