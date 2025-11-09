
/**
 * @author :Raquel Vega (trabajamos en una compu por problemas con equipo)
 * Esta clase es la clase Padre que hereda de los dos tipos de usuarios con los que se trabajaran. Ambos usuarios podran visualizar el contenido
 */
public abstract class Usuario implements FuncionesCE{
    // atributos
    protected String id;
    protected String nombre;
    protected String rol;

    //constructor
    public Usuario(String id, String nombre, String rol) {
        this.id = id;
        this.nombre = nombre;
        this.rol= rol;

    }
    //métodos

    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRol() { return rol; }
    public void setRol(String newrol) { this.rol = newrol; }

    //toString
    @Override
    public String toString() {
        return nombre + " (" + rol + ")";
    }
}
