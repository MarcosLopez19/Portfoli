package block6;

import java.util.Scanner;

public class ClassEx72 {

    private String Nombre;
    private int Edat;
    private String Telefono;
    private String Departamento;
    
    public ClassEx72(String nombre,int ed, String tlf,String dep) {
        this.Nombre = nombre;
        this.Edat = ed;
        this.Telefono = tlf;
        this.Departamento = dep;
    }
    
 

    public void imprimeixEmpl() {

        System.out.println("Empl1");
        System.out.println("M01: " + this.getNombre());
        System.out.println("M02: " + this.getEdat());
        System.out.println("M03: " + this.getTelefono());

    }

    /**
     * @return the Nombre
     */
    public String getNombre() {
        return Nombre;
    }

    /**
     * @param Nombre the Nombre to set
     */
    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    /**
     * @return the Edat
     */
    public int getEdat() {
        return Edat;
    }

    /**
     * @param Edat the Edat to set
     */
    public void setEdat(int Edat) {
        this.Edat = Edat;
    }

    /**
     * @return the Telefono
     */
    public String getTelefono() {
        return Telefono;
    }

    /**
     * @param Telefono the Telefono to set
     */
    public void setTelefono(String Telefono) {
        Scanner in =new Scanner (System.in);
        while (!checkTelefon(Telefono)){
        System.out.println("Intro telefon");
        Telefono= in.nextLine();
    }
        this.Telefono = Telefono;
        
    }
    public boolean checkTelefon (String Telefono){
        Telefono = Telefono.replace("-","");
        Telefono = Telefono.replace(".","");
        Telefono = Telefono.replace(" ","");
        if(Telefono.length() !=9){
            return false;
        }
        char[] phoneChar = Telefono.toCharArray();
        for (int i = 0; i < phoneChar.length; i++) {
            if(!Character.isDigit(phoneChar[i])){
            return false;
        }
            
        }
        return true;
        
    }
    /**
     * @return the Departamento
     */
    public String getDepartamento() {
        return Departamento;
    }

    /**
     * @param Departamento the Departamento to set
     */
    public void setDepartamento(String Departamento) {
        this.Departamento = Departamento;
    }
}
