/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.File;

public class Ej10 {

    public static void main(String[] args) {
             /*Ex10*/
            File archivoEx10 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/Ex10.txt");
            File archivo = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/ArchivoNuevo10.txt");
            
            File Ex10 = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/ParaCambiar");
            File Carpeta = new File("C:/Users/marku/OneDrive/Escritorio/AchivoJava/Ex10/CarpetaCambiada");
            
            if(archivoEx10.renameTo(archivo)){
                System.out.println("Archivo");
            }
            if(Ex10.renameTo(Carpeta)){
                System.out.println("Carpeta");
            }
        
        }
    }

