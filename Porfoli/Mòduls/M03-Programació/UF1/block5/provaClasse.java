/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package block5;

import java.util.Scanner;

/**
 *
 * @author marku
 */
public class provaClasse {

    public static void main(String[] args) {

                
              Scanner innum = new Scanner(System.in);
              Scanner instr = new Scanner(System.in);
              Scanner inboo = new Scanner(System.in);
              
            pruebasObjetos[] concesionari = new pruebasObjetos[3];
        
        for(int i=0;i<concesionari.length;i++){
            
            System.out.println("Intro marca");
                String marca=instr.nextLine();
            System.out.println("Intro model");
                String model=instr.nextLine();
            System.out.println("Intro Potencia");
                int potencia=innum.nextInt();
            System.out.println("Es Electric");
                boolean electric=inboo.nextBoolean();
                
            concesionari[i]=new pruebasObjetos(marca, model, potencia, electric);
            concesionari[i].imprimeix();
                
        }
        
        
        for(int i=0;i<concesionari.length;i++){
        
        
        
        
        
        }
    }
}
