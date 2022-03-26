/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.Distribuidor;

/**
 *
 * @author vaio
 */
public class Distribuidor {
    private String rut;
    private String rutt;
    private String telefono;
    private String direccion;
    private String pais;
    private String ciudad;
    private String comuna;
    private String editorial;
    private String año;

    public Distribuidor() {
    }

    
    public Distribuidor(String rut, String rutt, String telefono, String direccion, String pais, String ciudad, String comuna, String editorial, String año) {
        this.rut = rut;
        this.rutt = rutt;
        this.telefono = telefono;
        this.direccion = direccion;
        this.pais = pais;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.editorial = editorial;
        this.año = año;
    }


    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getRutt() {
        return rutt;
    }

    public void setRutt(String rutt) {
        this.rutt = rutt;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getAño() {
        return año;
    }

    public void setAño(String año) {
        this.año = año;
    }

    @Override
    public String toString() {
        return "Distribuidor{" + "rut=" + rut + ", rutt=" + rutt + ", telefono=" + telefono + ", direccion=" + direccion + ", pais=" + pais + ", ciudad=" + ciudad + ", comuna=" + comuna + ", editorial=" + editorial + ", a\u00f1o=" + año + '}';
    }
    
    
    
    
}
