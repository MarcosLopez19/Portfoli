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
public class Armas {
    protected String name;
    protected int wpow;
    protected int wvel;

    public Armas(String name, int wpow, int wvel) {
        this.name = name;
        this.wpow = wpow;
        this.wvel = wvel;
    }

    public String getName() {
        return name;
    }

    public int getWpow() {
        return wpow;
    }

    public int getWvel() {
        return wvel;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWpow(int wpow) {
        this.wpow = wpow;
    }

    public void setWvel(int wvel) {
        this.wvel = wvel;
    }



}
