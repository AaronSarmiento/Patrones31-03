/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import modelo.Modelo;
import vista.Vista;


/**
 *
 * @author golden
 */
public class Controlador {
    private Modelo modelo;
    private Vista vista;
    
    public Controlador() {
        modelo = new Modelo();
        vista = new Vista(modelo);
    }
    
    public Vista getVista() {
        return vista;
    }
}
