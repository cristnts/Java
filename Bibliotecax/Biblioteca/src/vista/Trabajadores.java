/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

/**
 *
 * @author vaio
 */
public class Trabajadores {
   private String rut;
   private String nombre;
   private String aPaterno;
   private String aMaterno;
   private String correo;
   private String fechacontrato;
   private String fechanacimiento;
   private String telefono;
   private String pais;
   private String ciudad;
   private String comuna;
   private String tipotrabajador;

    public Trabajadores() {
    }

    public Trabajadores(String rut, String nombre, String aPaterno, String aMaterno, String correo, String fechacontrato, String fechanacimiento, String telefono, String pais, String ciudad, String comuna, String tipotrabajador) {
        this.rut = rut;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.correo = correo;
        this.fechacontrato = fechacontrato;
        this.fechanacimiento = fechanacimiento;
        this.telefono = telefono;
        this.pais = pais;
        this.ciudad = ciudad;
        this.comuna = comuna;
        this.tipotrabajador = tipotrabajador;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getFechacontrato() {
        return fechacontrato;
    }

    public void setFechacontrato(String fechacontrato) {
        this.fechacontrato = fechacontrato;
    }

    public String getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(String fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
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

    public String getTipotrabajador() {
        return tipotrabajador;
    }

    public void setTipotrabajador(String tipotrabajador) {
        this.tipotrabajador = tipotrabajador;
    }

    @Override
    public String toString() {
        return "Trabajadores{" + "rut=" + rut + ", nombre=" + nombre + ", aPaterno=" + aPaterno + ", aMaterno=" + aMaterno + ", correo=" + correo + ", fechacontrato=" + fechacontrato + ", fechanacimiento=" + fechanacimiento + ", telefono=" + telefono + ", pais=" + pais + ", ciudad=" + ciudad + ", comuna=" + comuna + ", tipotrabajador=" + tipotrabajador + '}';
    }
   
    
    
    
    
}
