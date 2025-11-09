import java.util.ArrayList;

/**
 * @author :Raquel Vega (trabajamos en una compu por problemas con equipo)
 * Esta clase es uno de los tipos de usuarios que existe, el cual segun especificaciones unicamente puede crear y editar
 */
public class Editor extends Usuario {
    //atributos
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Contenido> contenidosCreados;

    public Editor(String id, String nombre) {
        super(id, nombre, "EDITOR");
        contenidosCreados=new ArrayList<>();
    }
    public ArrayList<Contenido> getContenidosCreados() { return contenidosCreados; }

    @Override
    public boolean crearContenido(Contenido cont, Controlador sistema) {
        if (cont.getTitulo() == null || cont.getTitulo().isEmpty()) {
            return false;
        } else {
            contenidosCreados.add(cont);

            return sistema.agregarContenido(cont);
        }
    }

    @Override
    public boolean editarContenido(String editor, Contenido cont, Controlador sistema) {
        if (cont == null || cont.getTitulo() == null || cont.getTitulo().isEmpty()) {
            return false;

        }
        //determina si existe en creados si se puede editar o no
        if (contenidosCreados.contains(cont)) {
            sistema.editarContenido(cont, editor, cont);
            return true;
        }
        return false;
    }

    @Override
    public boolean eliminarContenido(Contenido cont, Controlador sistema, int id) {
        //este tipo de usuario no puede realizar esta accion
        return false;
    }

    @Override
    public boolean publicarContenido(Contenido cont, Controlador sistema) {
        //este tipo de usuario no puede realizar esta accion
        return false;
    }

    @Override
    public boolean visualizar(Contenido cont) {
        return !(cont.getTitulo() == null || cont.getTitulo().isEmpty());
    }
}
