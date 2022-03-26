/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.ejb.Local;

/**
 *
 * @author alumnossur
 */
@Local
public interface SupermercadoSessionBeanLocal {
    
    public double obtenerDescuento(double precio, String dia, String categoria);
    public double calcularPrecioFinal(double precio, String dia, String categoria);
    public void agregarObjeto(Producto producto);
    public ArrayList<Producto> retornarObjeto();

}
