/**
 * @author :Allyson Escobar
 * Esta clase es la clase padre de todos los contenidos que se están manejando y se manejaran en un futuro
 */
import java.time.LocalDateTime;


public abstract class Contenido {
    // atributos
    protected  int idContenido;
    protected String titulo;
    protected String autor;
    protected LocalDateTime fechaCreacion;
    protected String categoria;
    protected String etiqueta;
    protected boolean publicado;
    //constructor

    public Contenido(int id, String titulo, String autor, String categoria, String etiqueta) {
        this.idContenido = id;
        this.titulo = titulo;
        this.autor = autor;
        this.categoria = categoria;
        this.etiqueta = etiqueta;
        this.fechaCreacion = null;
        this.publicado = false;
    }

    // Getters y setters
    public int getId() { return idContenido; }
    public void setId(int newid) { this.idContenido = newid; }

    public String getTitulo() { return titulo; }
    public void setTitulo(String newtitulo) { this.titulo = newtitulo; }

    public String getAutor() { return autor; }
    public void setAutor(String newautor) { this.autor = newautor; }

    public LocalDateTime getFechaPublicacion() { return fechaCreacion; }
    public void setFechaPublicacion(LocalDateTime newfechaCreacion) { this.fechaCreacion = newfechaCreacion; }

    public String getCategoria() { return categoria; }
    public void setCategoria(String newcategoria) { this.categoria = newcategoria; }

    public String getEtiqueta() { return etiqueta; }
    public void setEtiqueta(String newetiqueta) { this.etiqueta = newetiqueta; }

    public boolean getPublicado() { return publicado; }
    public void setPublicado(boolean newpublicado) { this.publicado = newpublicado; }

    //toString
    @Override
    public String toString() {
        return "Contenido{" +
                "id=" + idContenido +
                ", titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", categoria='" + categoria + '\'' +
                ", etiqueta='" + etiqueta + '\'' +
                ", publicado=" + publicado +
                '}';
    }

}
