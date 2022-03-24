package block6;

import java.util.Scanner;
import repaso.classCotxe;

public class Ex2 {

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        double SumaLB = 0, mult;
        ClassEx2[] TiendaLibros = new ClassEx2[3];
        for (int i = 0; i < TiendaLibros.length; i++) {
            mult = 0;
            System.out.println("Intro ISBN");
            String ISBN = instr.nextLine();
            System.out.println("Titulo Libro: ");
            String Titulo = instr.nextLine();
            System.out.println("Intro Autor del libro:");
            String Autor = instr.nextLine();
            System.out.println("Intro Editorial Libro:");
            String Editorial = instr.nextLine();
            System.out.println("Intro Numero de libros en la Tienda:");
            int NoLibrosTienda = inNum.nextInt();
            System.out.println("Intro Precio del Libro:");
            double precio = inNum.nextDouble();

            mult = precio * NoLibrosTienda;
            SumaLB += mult;
            TiendaLibros[i] = new ClassEx2(ISBN, Titulo, Autor, Editorial, NoLibrosTienda, precio);
        }
        imprime(TiendaLibros);
        System.out.println("SumaLibros: " + SumaLB);
    }

    public static void imprime(ClassEx2[] Libros) {
        System.out.println("Las Peliculas són:");
        for (int i = 0; i < Libros.length; i++) {
            Libros[i].PrintObject();
            
        }

    }

}
