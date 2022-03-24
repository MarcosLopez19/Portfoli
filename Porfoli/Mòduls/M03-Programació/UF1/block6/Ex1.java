package block6;

import java.util.Scanner;
import repaso.classCotxe;

public class Ex1 {

    public static void main(String[] args) {
        Scanner instr = new Scanner(System.in);
        Scanner inNum = new Scanner(System.in);

        ClassEx1[] pelicula = new ClassEx1[3];
        for (int i = 0; i < pelicula.length; i++) {

            System.out.println("Intro Director de la pelicula");
            String director = instr.nextLine();
            System.out.println("Intro Tipo de pelicula");
            String tipo = instr.nextLine();
            System.out.println("Intro Título de la pelicula");
            String titol = instr.nextLine();

            pelicula[i] = new ClassEx1(director, tipo, titol);

        }
        imprime(pelicula);

    }

    public static void imprime(ClassEx1[] peliculas) {
        System.out.println("Las Peliculas són:");
        for (int i = 0; i < peliculas.length; i++) {
            peliculas[i].imprimeix();

        }
        
    }

}
