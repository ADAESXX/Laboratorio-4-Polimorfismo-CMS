/**
 * @author :Raquel Vega (panel para gestionar contenidos en el CMS)
 */
import javax.swing.*;
import java.awt.*;

public class PanelContenido extends JFrame {

    private JComboBox<String> tipoContenido;
    private JTextField txtTitulo, txtAutor;
    private JButton btnGuardar, btnCancelar;
    private JTextArea areaDescripcion;
    
    public PanelContenido() {
        setTitle("Gestión de Contenidos");
        setSize(500, 400);
        setLayout(new BorderLayout());
        setLocationRelativeTo(null);
        
        JPanel panelSuperior = new JPanel(new GridLayout(4, 2, 5, 5));
        
        panelSuperior.add(new JLabel("Tipo de contenido:"));
        tipoContenido = new JComboBox<>(new String[]{"Artículo", "Imagen", "Video"});
        panelSuperior.add(tipoContenido);
        
        panelSuperior.add(new JLabel("Título:"));
        txtTitulo = new JTextField();
        panelSuperior.add(txtTitulo);
        
        panelSuperior.add(new JLabel("Autor:"));
        txtAutor = new JTextField();
        panelSuperior.add(txtAutor);
        
        panelSuperior.add(new JLabel("Descripción:"));
        areaDescripcion = new JTextArea(5, 20);
        
        JPanel panelInferior = new JPanel();
        btnGuardar = new JButton("Guardar");
        btnCancelar = new JButton("Cancelar");
        panelInferior.add(btnGuardar);
        panelInferior.add(btnCancelar);
        
        add(panelSuperior, BorderLayout.NORTH);
        add(new JScrollPane(areaDescripcion), BorderLayout.CENTER);
        add(panelInferior, BorderLayout.SOUTH);
        
        btnGuardar.addActionListener(e -> {
            String tipo = tipoContenido.getSelectedItem().toString();
            JOptionPane.showMessageDialog(null, "Contenido tipo " + tipo + " guardado correctamente.");
        });
        
        btnCancelar.addActionListener(e -> dispose());
        
        setVisible(true);
    }
}
