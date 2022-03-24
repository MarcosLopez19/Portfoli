package block6;

import java.util.Scanner;

public class ClassEx7 {

    private String Departamento;
    private int Horas;
    private int Sueldo;
    

    public ClassEx7(String dep, int H, int sd) {
        this.Departamento = dep;
        this.Horas = H;
        this.Sueldo = sd;
    }

    public void imprimeixDep() {

        System.out.println("Departamentos");
        System.out.println("M01: " + this.getDepartamento());
        System.out.println("M02: " + this.getHoras());
        System.out.println("M02: " + this.getSueldo());
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

    /**
     * @return the Horas
     */
    public int getHoras() {
        return Horas;
    }

    /**
     * @param Horas the Horas to set
     */
    public void setHoras(int Horas) {
        this.Horas = Horas;
    }

    /**
     * @return the Sueldo
     */
    public int getSueldo() {
        return Sueldo;
    }

    /**
     * @param Sueldo the Sueldo to set
     */
    public void setSueldo(int Sueldo) {
        this.Sueldo = Sueldo;
    }
}
