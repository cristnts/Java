/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import javax.ejb.Stateless;

/**
 *
 * @author alumnossur
 */
@Stateless
public class CalculadoraSessionBean implements CalculadoraSessionBeanLocal {

    // Add business logic below. (Right-click in editor and choose
    // "Insert Code > Add Business Method")
    public double calcular(double num1, double num2, String operador){

    double resultado = 0 ;
    
    if(operador.equals("1")){
        resultado = num1+num2;
    }
     if(operador.equals("2")){
        resultado = num1-num2;
    }
      if(operador.equals("3")){
        resultado = num1*num2;
    }
       if(operador.equals("4")){
        resultado = num1/num2;
    }
    
return resultado;

}
}