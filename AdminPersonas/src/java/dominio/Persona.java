/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dominio;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import static jdk.nashorn.internal.runtime.Debug.id;

/**
 *
 * @author alumnossur
 */
 @Entity
 @Table(name="personas")
    
public class Persona implements Serializable{
   
    @Id
    @Column(name="rut")
    private  int rut;
   
    @Column(name="nombre")
   private String nombre;
    
    @Column(name="apellido")
    private String apellido;
   
   public Persona(){}

    public int getRut() {
        return rut;
    }

    public void setRut(int rut) {
        this.rut = rut;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
   
   
    
}
