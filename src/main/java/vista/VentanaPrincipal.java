/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import modelo.Imagen;

/**
 *
 * @author golden
 */
public class VentanaPrincipal extends JFrame {
    private JPanel panelImagen;

    public VentanaPrincipal() {
        super("Mi aplicación");

        panelImagen = new JPanel();
        getContentPane().add(panelImagen, BorderLayout.CENTER);

        setSize(400, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public void dibujarImagen(Imagen imagen) {
        ImageIcon icono = new ImageIcon(imagen.getRuta());
        JLabel etiqueta = new JLabel(icono);
        panelImagen.removeAll();
        panelImagen.add(etiqueta);
        panelImagen.revalidate();
        panelImagen.repaint();
    }
}