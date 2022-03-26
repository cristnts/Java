/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author alumnossur
 */
public class Producto {
    //TODO LO QUE VA LSITADO VA EN LA CLASE
    
    private int id,cantidad;
    private String nombre,dia,categoria;
    private double precio,descuento,precioFinal;

    public Producto(int id, int cantidad, String nombre, String dia, String categoria, double precio, double descuento, double precioFinal) {
        this.id = id;
        this.cantidad = cantidad;
        this.nombre = nombre;
        this.dia = dia;
        this.categoria = categoria;
        this.precio = precio;
        this.descuento = descuento;
        this.precioFinal = precioFinal;
    }

    public Producto() {}

    public Producto(int id, String nombre, String dia, int cantidad, String categoria, double precio, double descuento, double precioFinal) {
       
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public double getPrecioFinal() {
        return precioFinal;
    }

    public void setPrecioFinal(double precioFinal) {
        this.precioFinal = precioFinal;
    }

    
    
    
    
    
}
