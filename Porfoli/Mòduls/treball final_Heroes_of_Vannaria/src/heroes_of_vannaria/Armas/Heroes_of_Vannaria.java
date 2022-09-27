/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroes_of_vannaria.Armas;

import heroes_of_vannaria.Armas.Armas;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author marku
 */
public class Heroes_of_Vannaria {

    Scanner in = new Scanner(System.in);
    private ArrayList<Personajes> personatges;
    private Armas[] armes;
    public static void main(String[] args) {

    }

    public void FuncionMenu() {
        boolean repetir = true;
        while (repetir) {
            switch (menu()) {
                case 1:
                    crearPersonaje();
                    break;
                case 2:
                    combate();
                    break;
                case 3:
                    mostrar(personajes());
                    break;
                case 4:
                    modificar();
                    break;
                case 5:
                    repetir = false;
                    break;

            }
        }
    }

    private int menu() {
        System.out.println("");
        System.out.println("1.Crear Personaje");
        System.out.println("2.Iniciar Combate");
        System.out.println("3.Mostrar Personajes");
        System.out.println("4.Modificar Personaje");
        System.out.println("5.Salir");
        return in.nextInt();
    }

    private void mostrar() {

    }

    private void combate() {
        Personajes[] arrayPersonajes = new Personajes[3];

    }

    private void crearPersonaje() {

    }

    private void modificar() {

    }

    private ArrayList<Personajes> llegirFitxer(String nomFitxer) {

        ArrayList<Personajes> personajes = new ArrayList<Personajes>();
        try {
            BufferedReader entrada = new BufferedReader(
                                new FileReader(nomFitxer));

            int i = 0;
            String linea;
            while((linea = entrada.readLine()) != null) {
                String[] caracteristicas = linea.split(";");
                String clase = caracteristicas[1];

                Armas laMevaArma = null;
                if (caracteristicas[7].equals("Daga")) // Nom arma
                    laMevaArma = armes[0];
                else if(caracteristicas[7].equals("Espasa"))
                    laMevaArma = armes[1];
                else if(caracteristicas[7].equals("Martell de combat"))
                    laMevaArma = armes[2];

                String nombre        = caracteristicas[0];
                int fuerza         = Integer.parseInt(caracteristicas[2]);
                int constitucion   = Integer.parseInt(caracteristicas[3]);
                int velocidad     = Integer.parseInt(caracteristicas[4]);
                int inteligencia = Integer.parseInt(caracteristicas[5]);
                int suerte          = Integer.parseInt(caracteristicas[6]);
                Personajes personatge = null;
                switch (clase) {
                    case "Guerrer":
                        personajes = new Guerrero(nombre,fuerza,constitucion,velocidad,inteligencia,suerte,laMevaArma);
                        break;
                    case "Cavaller":
                        personajes = new Caballero(nombre,fuerza,constitucion,velocidad,inteligencia,suerte,laMevaArma);
                        break;
                    case "Valkiria":
                        personajes = new Valquiria(nombre,fuerza,constitucion,velocidad,inteligencia,suerte,laMevaArma);
                        break;
                    case "Assassí":
                        personajes = new Asesino(nombre,fuerza,constitucion,velocidad,inteligencia,suerte,laMevaArma);
                        break;
                }

                personatges.add(personatge);
            }
            entrada.close();



        } catch (FileNotFoundException fnf) {
            //fnf.printStackTrace();
            System.out.println("Error fitxer no trobat.");
        } catch (IOException ioe) {
            System.out.println("Error I/O: " + ioe.getMessage());
        }

        return personatges;

    }
}
