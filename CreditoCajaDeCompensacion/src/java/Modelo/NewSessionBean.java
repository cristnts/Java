/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author alumnossur
 */
@Stateless
public class NewSessionBean implements NewSessionBeanLocal {

    ArrayList<Creditos> creditos =  new ArrayList<>();
    
    public double calcularCouta(double montoCredito, int numeroCuotas){
        double valorCuota = montoCredito/numeroCuotas;
        return valorCuota;
    }
    public void agregarCreditos(Creditos credito){
    creditos.add(credito);  
    }
    public ArrayList<Creditos> retornarCreditos(){
    return creditos;    
    }

    public double calcularPorpagar(double montoCredito, double porPagar){
    double resultado;
    resultado = montoCredito - porPagar;
    return resultado;
    }
}
