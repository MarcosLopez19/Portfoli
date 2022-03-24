package block2;

import java.util.Scanner;

public class Exvelocidad {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        float distanciam, recorrido, recorridof, velocidad, distanciakm, puntos, velocidadmax;

        System.out.println(" introduce distancia ");
        distanciam = in.nextFloat();
        System.out.println(" introduce segundos en que ha tardado ");
        recorrido = in.nextFloat();
        System.out.println(" introduce velocidad max ");
        velocidadmax = in.nextFloat();

        distanciakm = distanciam / 1000;
        recorridof = recorrido / 3600;
        velocidad = (distanciakm / recorridof);
        puntos = ((velocidadmax * 20 / 100) + velocidadmax);

        if (velocidad > puntos) {
            System.out.println("PUNTOS");
        } else if (velocidad >= velocidadmax) {
            System.out.println("MULTA");
        } else {
            System.out.println("OK");
        }
    }
}
