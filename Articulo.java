/**
 * @author :Allyson Escobar
 * Esta clase es la clase la clase hija que hereda y puede accedr a todos los métodos y atributos del padre
 */
public class Articulo extends Contenido{
    //atributos
    private String contenido;
    
    //constructor
    public Articulo(int id, String titulo, String autor, String categoria, String etiqueta, String contenido) {
        super(id, titulo, autor, categoria, etiqueta);
        this.contenido = contenido;
    }

    //métodos propios
    public String getContenido() { return contenido; }
    public void setContenido(String newcontenido) { this.contenido = newcontenido; }

    //toString 
    @Override
    public String toString() {
        return super.toString()+ ", Articulo: " + titulo;
    }
}
