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
public interface NewSessionBeanLocal {
    
    
    public double calcularCouta(double montoCredito, int numeroCuotas);
    public void agregarCreditos(Creditos credito);
    public ArrayList<Creditos> retornarCreditos();    
    public calcularPorpagar(double montoCredito, double porPagar);
 
    
    
    
}
