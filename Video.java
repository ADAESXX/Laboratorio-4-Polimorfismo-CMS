/**
 * @author :Allyson Escobar
 * Esta clase es la clase la clase hija que hereda y puede accedr a todos los métodos y atributos del padre
 */
public class Video extends Contenido{
    //atributos
    private String url;
    
    //constructor
    public Video(int id, String titulo, String autor, String categoria, String etiqueta, String url) {
        super(id, titulo, autor, categoria, etiqueta);
        this.url = url;
    }

    //métodos propios
    public String getUrl() { return url; }
    public void setUrl(String newurl) { this.url = newurl; }

    //toString 
    @Override
    public String toString() {
        return super.toString()+ ", Video: " + titulo + " [" + url + "]";
    }
}
