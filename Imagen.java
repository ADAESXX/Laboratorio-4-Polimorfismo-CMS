/**
 * @author :Allyson Escobar
 * Esta clase es la clase la clase hija que hereda y puede accedr a todos los métodos y atributos del padre
 */

public class Imagen extends Contenido{
    //atributos
    private String rutaArchivo;
    
    //constructor
    public Imagen(int id, String titulo, String autor, String categoria, String etiqueta, String rutaArchivo) {
        super(id, titulo, autor, categoria, etiqueta);
        this.rutaArchivo = rutaArchivo;
    }

    //métodos
    public String getRutaArchivo() { return rutaArchivo; }
    public void setRutaArchivo(String newrutaArchivo) { this.rutaArchivo = newrutaArchivo; }

    //toString 
    @Override
    public String toString() {
        return super.toString()+ ", Imagen: " + titulo + " [" + rutaArchivo + "]";
    }
    
}
