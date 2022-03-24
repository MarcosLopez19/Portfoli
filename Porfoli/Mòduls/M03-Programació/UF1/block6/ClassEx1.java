package block6;

import java.util.Scanner;

public class ClassEx1 {
    
    private String director;
    private String tipo;
    private String titulo;
    
        public ClassEx1(){
        this.director = "";
        this.tipo = "";
        this.titulo = "";
    }
      public ClassEx1(String director, String tipo,String titulo ){
       this.director = director;
        this.tipo = tipo;
        this.titulo = titulo;
    }    

    /**
     * @return the director
     */
    public String getDirector() {
        return director;
    }

    /**
     * @param director the director to set
     */
    public void setDirector(String director) {
        this.director = director;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @param titulo the titulo to set
     */
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void imprimeix(){
        
        System.out.println("Director de la Pelicula: "+this.director);
        System.out.println("Tipo de pelicula: "+this.tipo);
        System.out.println("Titulo de la pelicula: "+this.titulo);
        
    }      

}
