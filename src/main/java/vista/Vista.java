/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vista;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;
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
        
        BufferedImage imagenOriginal = modelo.getImagen();
        int anchoOriginal = imagenOriginal.getWidth();
        int altoOriginal = imagenOriginal.getHeight();
        int anchoNuevo = anchoOriginal/10;
        int altoNuevo = anchoOriginal/10;
        BufferedImage imagenNueva = new BufferedImage(anchoNuevo, altoNuevo, BufferedImage.TYPE_4BYTE_ABGR);
        Graphics2D g2d = imagenNueva.createGraphics();
        g2d.drawImage(imagenOriginal,0,0, anchoNuevo, altoNuevo, null);
        g2d.dispose();  
        
        for (int i = 0; i < 200000; i++) {
            int x = (int) (Math.random()* getWidth());
            int y = (int) (Math.random()* getHeight());
            g.drawImage(imagenNueva, x, y, null);
        }
    }
}