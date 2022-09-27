/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroes_of_vannaria.Armas;

/**
 *
 * @author marku
 */
public class Asesino extends Personajes {

    public Asesino(String nom, int fuerza, int constitucion, int velocidad, int inteligencia, int suerte, Armas arma) {
        super(nom, fuerza, constitucion, velocidad, inteligencia, suerte, arma);
    }

    public Asesino(String nom, String categoria, int fuerza, int constitucion, int velocidad, int inteligencia, int suerte, int lvl, int pex, Armas arma) {
        super(nom, categoria, fuerza, constitucion, velocidad, inteligencia, suerte, lvl, pex, arma);
    }

    public void calcularStats(){
      super.calcularStats();
      this.pa = (this.inteligencia + this.suerte+Armas.getWvel+this.velocidad);

    }

}
