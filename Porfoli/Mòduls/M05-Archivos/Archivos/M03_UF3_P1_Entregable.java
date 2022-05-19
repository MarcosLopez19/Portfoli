/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class M03_UF3_P1_Entregable {

    public static final int cantidadEquipos = 10;

    public static void main(String[] args) {

        String[] arrayStr = new String[cantidadEquipos];
        int[] arrayint = new int[cantidadEquipos];

        try {
            FileReader fr = new FileReader("C:\\Users\\marku\\OneDrive\\Escritorio\\AchivoJava\\resultatsLOL.txt");
            BufferedReader a = new BufferedReader(fr);
            String linea;

            while ((linea = a.readLine()) != null) {
                if (!esLineaVacia(linea)) {
                    assignarPunts(arrayStr, arrayint, linea);
                } else {
                }
            }

        } catch (FileNotFoundException ex) {
            System.out.println("uhiuhuhiu");
        } catch (IOException ex) {
        } catch (Exception e) {
            System.out.println("ERRor!!");
            System.out.println(e.getMessage());
            System.out.println(e);
        } finally {
            System.out.println("FINAL");
        }
        clasificacion(arrayStr, arrayint);

        try {
            FileWriter fw = new FileWriter("C:/Users/marku/OneDrive/Escritorio/AchivoJava/fichero_escritura.txt");
            BufferedWriter entrada = new BufferedWriter(fw);


            for (int i = 0; i < arrayStr.length; i++) {
                entrada.write(arrayStr[i] + ":" + arrayint[i] + "\n");
            }
            entrada.close();
        } catch (Exception ex) {
            System.out.println("Mensaje de la excepción: " + ex.getMessage());
        }
         
    }

    public static void assignarPunts(String[] arrayStr, int[] arrayInt, String linea) {

        String izquierda = linea.split(":")[0];
        String derecha = linea.split("-")[1].split(":")[0];

        String numero1 = linea.split("-")[0].split(":")[1];
        int numEquipo1 = Integer.parseInt(numero1);

        String numero2 = linea.split("-")[1].split(":")[1];
        int numEquipo2 = Integer.parseInt(numero2);

        if (numEquipo1 > numEquipo2) {
            existe(izquierda, arrayStr, arrayInt, numEquipo1);

        } else if (numEquipo1 < numEquipo2) {
            existe(derecha, arrayStr, arrayInt, numEquipo2);
        }

    }

    public static boolean esLineaVacia(String linea) {
        boolean vacia = false;
        if (linea.length() == 0) {
            vacia = true;
        }
        return vacia;
    }

    public static void existe(String nombequipo, String[] arrayStr, int[] arrayInt, int numEquipo) {
        boolean existe = false;
        int i = 0;
        while ((i < cantidadEquipos) && (existe == false)) {
            
            if (arrayStr[i] == null) {
         
                arrayInt[i] += numEquipo;
                arrayStr[i] = nombequipo;
                existe = true;

            } else if (arrayStr[i].equals(nombequipo)) {
           
                arrayInt[i] += numEquipo;
                existe = true;

            }
            i++;
        }

    }

    public static void clasificacion(String[] arrayStr, int[] arrayInt) {

        int aux;
        String aux2 = "";
        for (int i = 0; i < arrayInt.length; i++) {
            int minimo = i;
            for (int j = i + 1; j < arrayInt.length; j++) {
                if (arrayInt[j] > arrayInt[minimo]) {
                    minimo = j;
                }
            }
            aux = arrayInt[i];
            aux2 = arrayStr[i];
            arrayInt[i] = arrayInt[minimo];
            arrayStr[i] = arrayStr[minimo];
            arrayInt[minimo] = aux;
            arrayStr[i] = aux2;
        }
        mostraVector(arrayInt, arrayStr);
    }

    public static void mostraVector(int[] Array, String[] arrayStr) {

        for (int i = 0; i < Array.length; i++) {
            System.out.println(arrayStr[i] + ":" + Array[i]);
        }
    }

}
