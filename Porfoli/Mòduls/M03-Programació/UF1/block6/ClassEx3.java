package block6;

import java.util.Scanner;

public class ClassEx3 {
    
    private int CalleNumero;
    private int Codigo_Postal;
    private String Localidad;
    private String Provincia;
    
    public ClassEx3(int Ncalle, int Cpostal, String Loca, String Prov) {
        this.CalleNumero = Ncalle;
        this.Codigo_Postal = Cpostal;
        this.Localidad = Loca;
        this.Provincia = Prov;
    }

    public void imprimeix() {
        
        System.out.println("Empleado");
        System.out.println("Numero Calle: " + this.CalleNumero);
        System.out.println("Codigo Postal: " + this.Codigo_Postal);
        System.out.println("Localidad: " + this.Localidad);
        System.out.println("Provincia: " + this.Provincia);
        System.out.println("");
    }

    /**
     * @return the CalleNumero
     */
    public int getCalleNumero() {
        return CalleNumero;
    }

    /**
     * @param CalleNumero the CalleNumero to set
     */
    public void setCalleNumero(int CalleNumero) {
        this.CalleNumero = CalleNumero;
    }

    /**
     * @return the Codigo_Postal
     */
    public int getCodigo_Postal() {
        return Codigo_Postal;
    }

    /**
     * @param Codigo_Postal the Codigo_Postal to set
     */
    public void setCodigo_Postal(int Codigo_Postal) {
        this.Codigo_Postal = Codigo_Postal;
    }

    /**
     * @return the Localidad
     */
    public String getLocalidad() {
        return Localidad;
    }

    /**
     * @param Localidad the Localidad to set
     */
    public void setLocalidad(String Localidad) {
        this.Localidad = Localidad;
    }

    /**
     * @return the Provincia
     */
    public String getProvincia() {
        return Provincia;
    }

    /**
     * @param Provincia the Provincia to set
     */
    public void setProvincia(String Provincia) {
        this.Provincia = Provincia;
    }
    
    
}
