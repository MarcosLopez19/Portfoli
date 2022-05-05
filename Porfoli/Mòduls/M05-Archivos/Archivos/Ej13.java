/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

public class Ej13 {

    public static void main(String[] args) {

        /*EX12*/
        File archivo = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/ArchivoNuevo10.txt");
       File archivo2 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/ArchivoNuevo10.sql");
        
        
        if(archivo.renameTo(archivo2)){
            System.out.println("Se ha cmabiado la extension del archivo");
            System.out.println(archivo2);
        }
    }

}
