/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

public class Ej12 {

    public static void main(String[] args) {

        /*EX12*/
        File archivo = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/ArchivoNuevo10.txt");
        File carpeta = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/CarpetaCambiada");
        Ex121(archivo);
        Ex122(carpeta);
        Ex123(archivo);
    }

    public static void Ex121(File archivo) {
        System.out.println(archivo.getName());
    }

    public static void Ex122(File carpeta) {
        System.out.println(carpeta.getName());
        if (carpeta.exists()) {
            System.out.println("Existe");
        } else {
            System.out.println("No existe");
            carpeta.mkdir();
        }
    }

    public static void Ex123(File archivo) {
        if (archivo.exists()) {
            System.out.println("Existe el archivo");
        } else {
            System.out.println("No existe el archivo");
        }
    }
}
