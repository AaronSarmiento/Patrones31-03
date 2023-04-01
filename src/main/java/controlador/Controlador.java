/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Imagen;
import vista.VentanaPrincipal;

/**
 *
 * @author golden
 */
public class Controlador {
    private Imagen modelo;
    private VentanaPrincipal vista;

    public Controlador(Imagen modelo, VentanaPrincipal vista) {
        this.modelo = modelo;
        this.vista = vista;
    }

    public void mostrarImagen() {
        vista.dibujarImagen(modelo);
    }
}
