/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Restaurant;

/**
 *
 * @author marku
 */
public class Bloc3array {

    public static final int files = 3;
    public static final int columnes = 5;

    public static void main(String[] args) {

        double[][] Comptes = new double[files][columnes];
        //Valores introducidos manualmente
        Comptes[0][0] = 10.25;
        Comptes[0][1] = 27.32;
        Comptes[0][2] = 0;
        Comptes[1][0] = 5.25;
        Comptes[1][1] = 0;
        Comptes[2][0] = 7.25;
        Comptes[2][1] = 18;
        Comptes[2][2] = 0;

        int dia = 0, sumadia, diag = 0, dia1 = 0, diamp = 0, nmesa = 0, mesa = 0, diam = 0;
        double mespagat = 0;
        for (int i = 0; i < files; i++) {
            sumadia = 0;
            dia1++;
            mesa = 0;
            for (int j = 0; j < columnes; j++) {
                mesa++;

                sumadia += Comptes[i][j];
                //suma comptes per dia
                if (Comptes[i][j] != 0) {
                    sumadia += Comptes[i][j];
                } else {
                }
                //taula mes pagat i el dia
                if (mespagat == 0) {
                    mespagat = Comptes[i][j];
                    diamp = dia1;
                } else if (mespagat < Comptes[i][j]) {
                    mespagat = Comptes[i][j];
                    diamp = dia1;
                }

            }

            System.out.println("Suma vendas dia " + dia1 + " :" + sumadia);

            if (diag == 0) {
                diag = sumadia;
                dia = dia1;

            } else if (diag < sumadia) {
                diag = sumadia;
                dia = dia1;
            }

            //Dia que has servit més taules
            if (nmesa == 0) {
                nmesa = mesa;
                diam = dia;
            } else if (nmesa < mesa) {
                nmesa = mesa;
                diam = dia;
            }

        }
        System.out.println("El dia que mas se ha"
                + " ingresado ha sido el dia:" + dia + " con " + diag + "vendas");
        System.out.println("dia" + diamp + ", y la mesa que mas a pagado ha sido" + mespagat);
        System.out.println("El dia que se ha servido mas mesas ha sido el dia " + diam + "con " + nmesa + "mesas");
    }
}
