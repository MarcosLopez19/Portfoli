/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

public class Ej11 {

    public static void main(String[] args) {

        /*EX11*/
        File archivo = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/");
        System.out.println(archivo.getParent());

            File[] listado = archivo.listFiles();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        } else {
            for (int i = 0; i < listado.length; i++) {               
                if(listado[i].isDirectory()){
                    System.out.println("Carpeta "+ listado[i]);    
                }else{
                    System.out.println("Archivo "+ listado[i]);                 
                }
        
            }
        }
    }
}
