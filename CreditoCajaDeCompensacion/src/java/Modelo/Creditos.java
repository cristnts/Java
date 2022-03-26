/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;

/**
 *
 * @author alumnossur
 */
public class Creditos {
    
    
    double valorCuota;
    int numeroCredito;
    double montoCredito;
    String tipoCredito;
    int numeroCuotas;
    String rutBeneficiario;
    double montoPagado;
    double porPagar;

    public Creditos(double valorCuota, int numeroCredito, double montoCredito, String tipoCredito, int numeroCuotas, String rutBeneficiario, double montoPagado, double porPagar) {
        this.valorCuota = valorCuota;
        this.numeroCredito = numeroCredito;
        this.montoCredito = montoCredito;
        this.tipoCredito = tipoCredito;
        this.numeroCuotas = numeroCuotas;
        this.rutBeneficiario = rutBeneficiario;
        this.montoPagado = montoPagado;
        this.porPagar = porPagar;
    }

    public double getValorCuota() {
        return valorCuota;
    }

    public void setValorCuota(double valorCuota) {
        this.valorCuota = valorCuota;
    }

    public int getNumeroCredito() {
        return numeroCredito;
    }

    public void setNumeroCredito(int numeroCredito) {
        this.numeroCredito = numeroCredito;
    }

    public double getMontoCredito() {
        return montoCredito;
    }

    public void setMontoCredito(double montoCredito) {
        this.montoCredito = montoCredito;
    }

    public String getTipoCredito() {
        return tipoCredito;
    }

    public void setTipoCredito(String tipoCredito) {
        this.tipoCredito = tipoCredito;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public String getRutBeneficiario() {
        return rutBeneficiario;
    }

    public void setRutBeneficiario(String rutBeneficiario) {
        this.rutBeneficiario = rutBeneficiario;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public double getPorPagar() {
        return porPagar;
    }

    public void setPorPagar(double porPagar) {
        this.porPagar = porPagar;
    }
     
   
    
   
    
    
}
