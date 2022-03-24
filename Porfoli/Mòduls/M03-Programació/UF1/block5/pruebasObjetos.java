package block5;

import java.util.Scanner;

public class pruebasObjetos {
    
    private String marca;
    private String model;
    private char potencia;
    private boolean electric;
    
    public pruebasObjetos() {
       this.marca=" ";
       this.model=" ";
       this.potencia=0;
       this.electric=false;
    }
       public pruebasObjetos(String marc,String mod,int pot,boolean ele) {
       this.marca="kia";
       this.model="2";
       this.potencia=210;
       this.electric=true;
    }

    /**
     * @return the marca
     */
    public String getMarca() {
        return marca;
    }

    /**
     * @param marca the marca to set
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * @return the model
     */
    public String getModel() {
        return model;
    }

    /**
     * @param model the model to set
     */
    public void setModel(String model) {
        this.model = model;
    }

    /**
     * @return the potencia
     */
    public char getPotencia() {
        return potencia;
    }

    /**
     * @param potencia the potencia to set
     */
    public void setPotencia(char potencia) {
        this.potencia = potencia;
    }

    /**
     * @return the electric
     */
    public boolean isElectric() {
        return electric;
    }

    /**
     * @param electric the electric to set
     */
    public void setElectric(boolean electric) {
        this.electric = electric;
    }
    public void imprimeix(){
        System.out.println(this.marca);
        System.out.println(this.model);
        System.out.println(this.potencia);
        System.out.println(this.electric);
    
    }
}
    