/**
 * @author :Allyson Escobar
 * Esta clase es la interface que aplicará cualquier tipo de contenido
 */
public interface FuncionesCE {
    //métodos
    boolean crearContenido(Contenido cont, Controlador sistema);
    boolean editarContenido(String editor, Contenido cont, Controlador sistema);
    boolean eliminarContenido(Contenido cont, Controlador sistema, int id);
    boolean publicarContenido(Contenido cont, Controlador sistema);
    boolean visualizar(Contenido contenido);
}
