import java.util.ArrayList;
import java.util.List;

/**
 * @author :Raquel Vega (trabajamos en una compu por problemas con equipo)
 * Esta clase es uno de los tipos de usuarios que existe, el cual segun especificaciones unicamente puede publicar y eliminar
 */
public class Administrador extends Usuario{
    //atributos
    @SuppressWarnings("FieldMayBeFinal")
    private ArrayList<Contenido> contenidosPublicados;
    //
    
    public Administrador(String id, String nombre) {
        super(id, nombre,"ADMINISTRADOR");
        contenidosPublicados=new ArrayList<>();
    }
    //
    public List<Contenido> getContenidosPublicados() { return contenidosPublicados; }

    @Override
    public boolean crearContenido(Contenido cont, Controlador sistema) {
        //este tipo de usuario no puede realizar esta accion
        return false;
    }

    @Override
    public boolean editarContenido(String editor, Contenido cont, Controlador sistema) {
        //este tipo de usuario no puede realizar esta accion
        return false;
    }

    @Override
    public boolean eliminarContenido(Contenido cont, Controlador sistema, int id) {
        //este evalua si el contenido esta vacio, para determinar si se elminia o no, dependiendo si el contenido existe
        contenidosPublicados.remove(cont);
        return sistema.eliminarContenido(id);
    }

    @Override
    public boolean publicarContenido(Contenido cont, Controlador sistema) {
        if (cont.getTitulo() == null || cont.getTitulo().isEmpty()) {
            return false;
        } else {
            cont.setPublicado(true);
            contenidosPublicados.add(cont);
            return sistema.agregarContenido(cont);
        }
    }

    @Override
    public boolean visualizar(Contenido cont) {
        return !(cont.getTitulo() == null || cont.getTitulo().isEmpty());
    }


}
