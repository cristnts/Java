/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 *
 * @author Vania
 */
@Entity
@Table (name="giros")
public class Giro implements Serializable {
    
    @Id 
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Column(name="id_giro")
   private int id_giro;
       
  @Column(name="tipoCuenta")
  private String tipoCuenta;
  
  @Column(name="fecha")
  private String fecha;
  
  @Column(name="monto")
  private int monto;
    
  @ManyToOne
  @JoinColumn(name="numeroCuenta", referencedColumnName="numeroCuenta")
  private Cuenta numeroCuenta;
  
  public Giro(){}

    public int getId_giro() {
        return id_giro;
    }

    public void setId_giro(int id_giro) {
        this.id_giro = id_giro;
    }

    public String getTipoCuenta() {
        return tipoCuenta;
    }

    public void setTipoCuenta(String tipoCuenta) {
        this.tipoCuenta = tipoCuenta;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getMonto() {
        return monto;
    }

    public void setMonto(int monto) {
        this.monto = monto;
    }

    public Cuenta getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(Cuenta numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
  
}
