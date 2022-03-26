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
public class Pasajero {
    
             private String nombre;
            private String telefono;
           private String email;
            private String destino;
            private String transporte;
            private String hotel;
            private String ida,vuelta;

    public Pasajero(String nombre, String telefono, String email, String destino, String transporte, String hotel, String ida, String vuelta) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.email = email;
        this.destino = destino;
        this.transporte = transporte;
        this.hotel = hotel;
        this.ida = ida;
        this.vuelta = vuelta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public void setTransporte(String transporte) {
        this.transporte = transporte;
    }

    public void setHotel(String hotel) {
        this.hotel = hotel;
    }

    public void setIda(String ida) {
        this.ida = ida;
    }

    public void setVuelta(String vuelta) {
        this.vuelta = vuelta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public String getDestino() {
        return destino;
    }

    public String getTransporte() {
        return transporte;
    }

    public String getHotel() {
        return hotel;
    }

    public String getIda() {
        return ida;
    }

    public String getVuelta() {
        return vuelta;
    }

    
}
