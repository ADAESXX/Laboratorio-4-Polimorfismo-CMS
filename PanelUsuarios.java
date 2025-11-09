import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * @author :Raquel Vega (panel para gestionar usuarios en el CMS)
 */

public class PanelUsuarios extends JFrame {

    private JComboBox<String> tipoUsuario;
    private JTextField txtNombre;
    private JButton btnCrear, btnCerrar;
    
    public PanelUsuarios() {
        setTitle("Gestión de Usuarios");
        setSize(400, 250);
        setLayout(new GridLayout(3, 2, 10, 10));
        setLocationRelativeTo(null);
        
        tipoUsuario = new JComboBox<>(new String[]{"Administrador", "Editor"});
        txtNombre = new JTextField();
        btnCrear = new JButton("Crear Usuario");
        btnCerrar = new JButton("Cerrar");
        
        add(new JLabel("Tipo de usuario:"));
        add(tipoUsuario);
        add(new JLabel("Nombre:"));
        add(txtNombre);
        add(btnCrear);
        add(btnCerrar);
        
        btnCrear.addActionListener(e -> {
            String tipo = tipoUsuario.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Usuario " + tipo + " creado con éxito.");
        });
        
        btnCerrar.addActionListener(e -> dispose());
        
        setVisible(true);
    }
}
