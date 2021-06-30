
package ec.edu.intsuperior.vista;
import ec.edu.intsuperior.modelo.Biblioteca;
import ec.edu.intsuperior.modelo.Libro;
import ec.edu.intsuperior.modelo.Punto;
import ec.edu.intsuperior.modelo.Autor;
import ec.edu.intsuperior.modelo.Bicicleta;
        
public class Aplicacion {
    public static void main(String[] args){
        Punto p1 = new Punto (-1,7);
        Punto p2= new Punto();
        Bicicleta b1 = new Bicicleta();
        Bicicleta b2 = new Bicicleta(15,"Tundra",525.36,55,"verde");
        Autor au1=new Autor("123456789","Soledad","Flores","Ingeniero","1984-05-20");
        Libro l1 = new Libro ("La belleza de la programacion","int",au1);
        Biblioteca biblio = new Biblioteca(34.0f,55,l1,"Cayambe");
        
        
        
        
        System.out.println("El autor deel libro 1 es: "+l1.getAutor().getNombre());
         
         
    }
    

}
