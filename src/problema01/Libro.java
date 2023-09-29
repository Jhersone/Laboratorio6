/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package problema01;

/**
 *
 * @author Proyector
 */
public class Libro {
    
    private String titulo;
    private int añoPublicacion;
    private Autor autor; // Relación con un autor
    private Editorial editorial; // Relación con una editorial

    public Libro(String titulo, int añoPublicacion, Autor autor, Editorial editorial) {
        this.titulo = titulo;
        this.añoPublicacion = añoPublicacion;
        this.autor = autor;
        this.editorial = editorial;
     
        autor.asignarLibro(this);
        editorial.asignarLibro(this);

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        this.añoPublicacion = añoPublicacion;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public Editorial getEditorial() {
        return editorial;
    }

    public void setEditorial(Editorial editorial) {
        this.editorial = editorial;
    }
    
    

}
