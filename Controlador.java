/**
 * @author :Allyson Escobar
 * Esta clase es la clase que permitira directamente las acciones generales del programa.
 */

import java.util.ArrayList;
import java.util.List;

public class Controlador {
    @SuppressWarnings("FieldMayBeFinal")
    private List<Contenido> todosLosContenidos;

    //
    public Controlador() {
        this.todosLosContenidos = new ArrayList<>();
    }

    public boolean agregarContenido(Contenido c) {
        if (c != null && c.getTitulo() != null && !c.getTitulo().isEmpty()) {
            todosLosContenidos.add(c);
            return true;
        } else {
            return false;
        }
    }

    public boolean eliminarContenido(int id) {
        for (Contenido c : todosLosContenidos) {
            if (c.getId() == id) {
                todosLosContenidos.remove(c);
                return true;
            }
        }
        return false;
    }

    public String editarContenido(Contenido original, String editor, Contenido nuevo) {
        if (original == null || nuevo == null) {
            
            // no se puede editar
            return "No se puede editar";
        }

        int index = todosLosContenidos.indexOf(original);
        if (index != -1) {
            // Actualiza el contenido en la lista
            todosLosContenidos.set(index, nuevo);
            return"El contenido '" + original.getTitulo() + "' fue editado por " + editor + ".";
        } else {
            return "No se encontró el contenido a editar en el sistema.";
        }
    }

    //clase contruida con la ayuda de chatgpt
    public String mostrarTodo() {
        if (todosLosContenidos.isEmpty()) {
            return "No hay contenidos registrados en el sistema.";
        }

        StringBuilder cadena = new StringBuilder("Contenidos registrados:\n");
        for (Contenido c : todosLosContenidos) {
            cadena.append("   - ").append(c.toString()).append("\n");
        }
        return cadena.toString();
    }

    public List<Contenido> getTodosLosContenidos() {
        return todosLosContenidos;
    }

    //funciones generales
    public ArrayList<Contenido> clasificarContenido(String categoria){
        ArrayList<Contenido> clasificados = new ArrayList<>();
        for (Contenido c : todosLosContenidos) {
            if (c.getCategoria().equalsIgnoreCase(categoria)) {
                clasificados.add(c);
            }
        }
        return clasificados;
    }
    public ArrayList<Contenido> filtrarContenido(String tipo){
        ArrayList<Contenido> filtrados = new ArrayList<>();
        for (Contenido c : todosLosContenidos) {
            // obtiene el nombre de la clase del objeto (ejemplo: "Articulo")
            String tipoContenido = c.getClass().getSimpleName();
            if (tipoContenido.equalsIgnoreCase(tipo)) {
                filtrados.add(c);
            }
        }
        return filtrados;
    }
    public Contenido buscarContenido(String palabra){
        for (Contenido c : todosLosContenidos) {
            if (c.getTitulo().toLowerCase().contains(palabra.toLowerCase()) ||
                c.getAutor().toLowerCase().contains(palabra.toLowerCase()) ||
                c.getEtiqueta().toLowerCase().contains(palabra.toLowerCase())) {
                    //devuelve el primero que encuentra
                return c;
            }
        }
        return null;
    }

}

