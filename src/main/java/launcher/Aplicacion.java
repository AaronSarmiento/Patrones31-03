
package launcher;

import controlador.Controlador;
import javax.swing.JFrame;

public class Aplicacion extends JFrame {
    private Controlador controlador;
    
    public Aplicacion() {
        controlador = new Controlador();
        
        setTitle("Mi aplicación Swing");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        
        // Agrega el panel de la vista a la ventana
        add(controlador.getVista());
        
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new Aplicacion();
    }
}