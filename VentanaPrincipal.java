/**
 * @author :Raquel Vega (ventana principal que contiene los botones para acceder a las diferentes secciones del CMS)
 */
import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends JFrame {
    
    private JButton btnContenido, btnUsuarios, btnSalir;
    private JLabel lblTitulo;
    private JPanel panelCentral, panelSuperior, panelInferior;
    
    public VentanaPrincipal() {
        // Configuración básica
        setTitle("CMS - Sistema de Contenidos");
        setSize(480, 350);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout(10, 10));
        getContentPane().setBackground(new Color(245, 245, 250)); // fondo gris claro
        
        // --- Panel superior (título) ---
        panelSuperior = new JPanel();
        panelSuperior.setBackground(new Color(79, 99, 133)); // azul grisáceo
        lblTitulo = new JLabel("Gestor de Contenidos Multimedia");
        lblTitulo.setForeground(Color.WHITE);
        lblTitulo.setFont(new Font("Segoe UI", Font.BOLD, 18));
        panelSuperior.add(lblTitulo);
        add(panelSuperior, BorderLayout.NORTH);
        
        // --- Panel central (botones principales) ---
        panelCentral = new JPanel();
        panelCentral.setBackground(new Color(245, 245, 250));
        panelCentral.setLayout(new GridLayout(3, 1, 15, 15));

        btnContenido = crearBoton("Gestionar Contenidos", new Color(0, 153, 204));
        btnUsuarios = crearBoton("Gestionar Usuarios", new Color(0, 204, 153));
        btnSalir = crearBoton("Salir", new Color(204, 51, 51));
        
        panelCentral.add(btnContenido);
        panelCentral.add(btnUsuarios);
        panelCentral.add(btnSalir);
        
        add(panelCentral, BorderLayout.CENTER);
        
        // --- Panel inferior (firma o créditos) ---
        panelInferior = new JPanel();
        panelInferior.setBackground(new Color(79, 99, 133));
        JLabel lblPie = new JLabel("© 2025 Universidad del Valle de Guatemala");
        lblPie.setForeground(Color.WHITE);
        lblPie.setFont(new Font("Segoe UI", Font.PLAIN, 11));
        panelInferior.add(lblPie);
        add(panelInferior, BorderLayout.SOUTH);

        // --- Eventos ---
        btnContenido.addActionListener(e -> new PanelContenido());
        btnUsuarios.addActionListener(e -> new PanelUsuarios());
        btnSalir.addActionListener(e -> System.exit(0));

        setVisible(true);
    }

    // Método para crear botones con estilo
    private JButton crearBoton(String texto, Color colorFondo) {
        JButton boton = new JButton(texto);
        boton.setFocusPainted(false);
        boton.setFont(new Font("Segoe UI", Font.BOLD, 14));
        boton.setBackground(colorFondo);
        boton.setForeground(Color.WHITE);
        boton.setBorder(BorderFactory.createEmptyBorder(10, 20, 10, 20));
        boton.setCursor(new Cursor(Cursor.HAND_CURSOR));
        
        // Efecto al pasar el mouse
        boton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorFondo.darker());
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                boton.setBackground(colorFondo);
            }
        });
        return boton;
    }
}
