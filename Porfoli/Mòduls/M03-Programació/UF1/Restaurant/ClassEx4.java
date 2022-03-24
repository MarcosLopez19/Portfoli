package Restaurant;



import java.util.Scanner;

public class ClassEx4 {

    private String nom;
    private String NIF;
    private String correu;
    private double despesaFetaAcumulada;
    private double percentatgeDescompte;

    public ClassEx4(String nom,String nif,String correu,double dfa, double pd) {
        this.nom = nom;
        this.NIF = nif;
        this.correu = correu;
        this.despesaFetaAcumulada = dfa;
        this.percentatgeDescompte = pd;

    }


    public void imprimeix() {

        System.out.println("Clientes");
        System.out.println("nom: " + this.getNom());
        System.out.println("nif: " + this.getNIF());
        System.out.println("correu: " + this.getCorreu());
        System.out.println("despesaFetaAcumulada: " + this.getDespesaFetaAcumulada());
        System.out.println("percentatgeDescompte: " + this.getPercentatgeDescompte());

    }

    /**
     * @return the nom
     */
    public String getNom() {
        return nom;
    }

    /**
     * @param nom the nom to set
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * @return the NIF
     */
    public String getNIF() {
        return NIF;
    }

    /**
     * @param NIF the NIF to set
     */
    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    /**
     * @return the correu
     */
    public String getCorreu() {
        return correu;
    }

    /**
     * @param correu the correu to set
     */
    public void setCorreu(String correu) {
        this.correu = correu;
    }

    /**
     * @return the despesaFetaAcumulada
     */
    public double getDespesaFetaAcumulada() {
        return despesaFetaAcumulada;
    }

    /**
     * @param despesaFetaAcumulada the despesaFetaAcumulada to set
     */
    public void setDespesaFetaAcumulada(double despesaFetaAcumulada) {
        this.despesaFetaAcumulada = despesaFetaAcumulada;
    }

    /**
     * @return the percentatgeDescompte
     */
    public double getPercentatgeDescompte() {
        return percentatgeDescompte;
    }

    /**
     * @param percentatgeDescompte the percentatgeDescompte to set
     */
    public void setPercentatgeDescompte(double percentatgeDescompte) {
        this.percentatgeDescompte = percentatgeDescompte;
    }
    

}
