/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heroes_of_vannaria.Armas;


public abstract class Personajes {

    protected String nom, categoria;
    protected int fuerza, constitucion,velocidad, inteligencia, suerte,ps, pd, pa, pe, lvl, pex;
    protected Armas arma;

    public Personajes(String nom, int fuerza, int constitucion, int velocidad, int inteligencia, int suerte, Armas arma) {
        this.nom = nom;
        this.fuerza = fuerza;
        this.constitucion = constitucion;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.suerte = suerte;
        this.arma = arma;
        lvl=0;
        pex=0;
    }
   public Personajes(String nom, String categoria, int fuerza, int constitucion, int velocidad, int inteligencia, int suerte, int lvl, int pex, Armas arma) {
        this.nom = nom;
        this.categoria = categoria;
        this.fuerza = fuerza;
        this.constitucion = constitucion;
        this.velocidad = velocidad;
        this.inteligencia = inteligencia;
        this.suerte = suerte;
        this.lvl = lvl;
        this.pex = pex;
        this.arma = arma;
    }

    public String getNom() {
        return nom;
    }

    public String getCategoria() {
        return categoria;
    }

    public int getFuerza() {
        return fuerza;
    }

    public int getConstitucion() {
        return constitucion;
    }

    public int getVelocidad() {
        return velocidad;
    }

    public int getInteligencia() {
        return inteligencia;
    }

    public int getSuerte() {
        return suerte;
    }

    public int getPs() {
        return ps;
    }

    public int getPd() {
        return pd;
    }

    public int getPa() {
        return pa;
    }

    public int getPe() {
        return pe;
    }

    public int getLvl() {
        return lvl;
    }

    public int getPex() {
        return pex;
    }

    public Armas getArma() {
        return arma;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public void setFuerza(int fuerza) {
        this.fuerza = fuerza;
    }

    public void setConstitucion(int constitucion) {
        this.constitucion = constitucion;
    }

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }

    public void setSuerte(int suerte) {
        this.suerte = suerte;
    }

    public void setPs(int ps) {
        this.ps = ps;
    }

    public void setPd(int pd) {
        this.pd = pd;
    }

    public void setPa(int pa) {
        this.pa = pa;
    }

    public void setPe(int pe) {
        this.pe = pe;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    //Experiencia puntos
    public void setLvl(int lvl) {
        this.lvl = lvl;
    }

    public void setPex(int pex) {
        this.pex = pex;
    }

    //metodo calcular de estadisticas de cada clase
    public void calcularStats(){
      ps = constitucion + fuerza;
      pd = (fuerza + this.arma.getWpow()) / 4;
      pa = inteligencia + suerte + this.arma.getWvel();
      pe = velocidad + suerte + inteligencia;
    }


    //metodo de lvl UP
    public void lvlUp(){
            lvl++;
            fuerza++;
            constitucion++;
            velocidad++;
            inteligencia++;
            suerte++;
            calcularStats();
    }

}
