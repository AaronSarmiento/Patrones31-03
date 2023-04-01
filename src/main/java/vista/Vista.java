/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;
import modelo.Modelo;

public class Vista extends JPanel {
    private Modelo modelo;
    
    public Vista(Modelo modelo) {
        this.modelo = modelo;
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        
        // Dibuja la imagen en el panel
        g.drawImage((Image) modelo.getImagen(), 0, 0, this);
    }
}