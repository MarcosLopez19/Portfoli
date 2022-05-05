/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Archivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Ej1parte2 {

    public static void main(String[] args) {

        try {
            /*EX12*/
            FileReader fr = new FileReader("C:/Users/marku/OneDrive/Escritorio/AchivoJava/resultats.tx");
            BufferedReader a = new BufferedReader(fr);
            String linea;
            while((linea=a.readLine())!=null){
                System.out.println(linea);
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("uhiuhuhiu");
        } catch (IOException ex) {
        }catch(Exception e){
            System.out.println("EXECPTION");
        }  
        finally{
            System.out.println("FINAL");
        }
       
    }

}
