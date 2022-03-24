package blockREPASO;

import java.util.Scanner;

public class Ex17repaso {

    public static void main(String[] args) {

        Scanner innum = new Scanner(System.in);
        Scanner instr = new Scanner(System.in);

        int i, valortotal = 6, ppequeno = 0, cmedian = 0, cgrande = 0,
        tipo, suma = 0;
        float porcentajep = 0, porcentajec = 0, porcentajeg = 0;
        for (i = 0; i < valortotal; i++) {
            tipo = 0;
            System.out.println("Intro num habitantes");
            tipo = innum.nextInt();

            if (tipo < 2000) {
                ppequeno += tipo;
            } else if ((tipo < 2000) && (tipo < 30000)) {
                cmedian += tipo;
            } else {
                cgrande += tipo;
            }
        }
        System.out.println("");
        suma = ppequeno + cmedian + cgrande;

        porcentajep = (float)ppequeno * 100 / suma;
        System.out.println("Pueblo pequeño"+porcentajep);
        porcentajec = (float)cmedian * 100 / suma;
        System.out.println("ciudad normal"+porcentajec);
        porcentajeg = (float)cgrande * 100 / suma;
        System.out.println("ciudad grande"+porcentajeg);
    }
}
