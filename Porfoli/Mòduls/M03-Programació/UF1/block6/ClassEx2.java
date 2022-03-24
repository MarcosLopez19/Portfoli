package block6;

import java.util.Scanner;

public class ClassEx2 {

    private String ISBN;
    private String Titulo;
    private String Autor;
    private String Editorial;
    private int NoLibrosTienda;
    private double precio;

    public ClassEx2(String isbn, String tit, String Au, String Ed, int No, double pr) {
        this.ISBN = isbn;
        this.Titulo = tit;
        this.Autor = Au;
        this.Editorial = Ed;
        this.NoLibrosTienda = No;
        this.precio = pr;

    }

    public void PrintObject() {
        System.out.printf("%s \t %s \t %d \t %f", this.Titulo, this.Autor, this.precio);
    }

    public void imprimeix() {

        System.out.println("Libro");
        System.out.println("ISBN: " + this.getISBN());
        System.out.println("Titulo: " + this.getTitulo());
        System.out.println("Autor: " + this.getAutor());
        System.out.println("Editorial: " + this.getEditorial());
        System.out.println("Numero de libros tienda: " + this.getNoLibrosTienda());
        System.out.println("Precio: " + this.getPrecio());
        System.out.println("");
    }

    /**
     * @return the Titulo
     */
    public String getISBN() {
        return ISBN;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setISBN(String Titulo) {
        this.ISBN = ISBN;
    }

    /**
     * @return the Titulo
     */
    public String getTitulo() {
        return Titulo;
    }

    /**
     * @param Titulo the Titulo to set
     */
    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    /**
     * @return the Autor
     */
    public String getAutor() {
        return Autor;
    }

    /**
     * @param Autor the Autor to set
     */
    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    /**
     * @return the Editorial
     */
    public String getEditorial() {
        return Editorial;
    }

    /**
     * @param Editorial the Editorial to set
     */
    public void setEditorial(String Editorial) {
        this.Editorial = Editorial;
    }

    /**
     * @return the NoLibrosTienda
     */
    public int getNoLibrosTienda() {
        return NoLibrosTienda;
    }

    /**
     * @param NoLibrosTienda the NoLibrosTienda to set
     */
    public void setNoLibrosTienda(int NoLibrosTienda) {
        this.NoLibrosTienda = NoLibrosTienda;
    }

    /**
     * @return the precio
     */
    public double getPrecio() {
        return precio;
    }

    /**
     * @param precio the precio to set
     */
    public void setPrecio(double precio) {
        this.precio = precio;
    }

}
