
package launcher;

import controlador.Controlador;
import modelo.Imagen;
import vista.VentanaPrincipal;

/**
 *
 * @author golden
 */
public class Main {
    public static void main(String[] args) {
        Imagen modelo = new Imagen("‪‪C:\\Users\\golden\\Desktop\\images.png");
        VentanaPrincipal vista = new VentanaPrincipal();
        Controlador controlador = new Controlador(modelo, vista);

        controlador.mostrarImagen();
    }
}
