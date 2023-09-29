/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package problema01;

/**
 *
 * @author Proyector
 */
public class Problema01 {
  /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
     //mis objetos viene hacer mi asocion simple, que estan unidos
     //por la creacion de un objeto
      Autor autor = new Autor("Alberto", "El Grande");
    Editorial editorial = new Editorial("San Bartolo");
    Libro libro = new Libro("El Sauce que Murió de Amor", 1990, autor, editorial);

    // Acceder a la relación desde la clase Libro
    System.out.println("Libro: " + libro.getTitulo());
    System.out.println("Autor: " + autor.getNombre() + " " + autor.getApellido());
    System.out.println("Editorial: " + editorial.getNombre());
    
    }
}

  