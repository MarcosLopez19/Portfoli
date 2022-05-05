/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

public class Ej1 {

    public static void main(String[] args) {
        /*EX1*/
        File archivo = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/");
        System.out.println(archivo.getParent());

        String[] listado = archivo.list();
        if (listado == null || listado.length == 0) {
            System.out.println("No hay elementos dentro de la carpeta actual");
            return;
        } else {
            for (int i = 0; i < listado.length; i++) {
                System.out.println(listado[i]);
            }

            /*Ex2*/
            File archivoEx2 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            System.out.println(archivoEx2.getParent());
            System.out.println(archivoEx2.exists());

            /*Ex3*/
            File archivoEx3 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            System.out.println(archivoEx3.getParent());
            System.out.println(archivoEx2.canRead());
            System.out.println(archivoEx2.canWrite());

            /*Ex4*/
            File archivoEx4 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            System.out.println(archivoEx4.getParent());
            System.out.println(archivoEx4.isFile());

            /*Ex5*/
            File archivoEx5 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            System.out.println(archivoEx5.getParent());
            System.out.println(archivoEx5.length());

            /*Ex6*/
            /*File nuevaCarpeta = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/");
            
            if (!nuevaCarpeta.exists()) {
                nuevaCarpeta.mkdir();
            } else {
                nuevaCarpeta.delete();
            }
            */
            /*Ex7*/
            File archivo2 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/");
            System.out.println(archivo.getParent());
            String[] listado2 = archivo.list();

            if (listado == null || listado.length == 0) {
                System.out.println("No hay elementos dentro de la carpeta actual");
                return;
            } else {
                for (int i = 0; i < listado.length; i++) {
                    if (listado[i].length() > 80) {
                        System.out.println(listado[i]);
                    }
                }
            }
            
            /*Ex8*/
            File archivoEx8 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            System.out.println(archivo.getAbsolutePath());
            System.out.println("MODIFICACION");
            System.out.println(archivoEx8.lastModified());
            System.out.println("Archivo:");
            System.out.println(archivoEx8.length());
            
            /*Ex9*/
            /*Donada la ruta a una carpeta i la ruta a un fitxer dintre 
            de la carpeta anterior et crei la carpeta si no està creada. Al tornar-lo a executar, 
            com que ja està creada , l'ha d'esborrar i també el fitxer ( si existeix i es pot)*/
            
            File archivoEx9 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/ejemplo_archivo.txt");
            File nuevaCarpeta = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/");
            System.out.println(archivo.getAbsoluteFile());
            System.out.println(archivo.getPath());
             if (!nuevaCarpeta.exists()) {
                nuevaCarpeta.mkdir();
                System.out.println("Se crea porque no esta creada");
            } else {
                nuevaCarpeta.delete();
                 System.out.println("SE Elimina porque ya esta creada");
            }
        
        }
    }
}
