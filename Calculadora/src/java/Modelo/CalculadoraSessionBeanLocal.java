/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.ejb.Local;

/**
 *
 * @author alumnossur
 */
@Local
public interface CalculadoraSessionBeanLocal {
    
    public double calcular(double num1, double num2, String operador);
    
}
