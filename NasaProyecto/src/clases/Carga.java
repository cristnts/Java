/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Scanner;

/**
 *
 * @author C_Caceres
 */
public class Carga {
    
        Scanner leer = new Scanner(System.in);
        Scanner leer2 = new Scanner(System.in);
        Scanner leer3 = new Scanner(System.in);
        
    
    String nombre, descripcion;
    int codigo;
    double peso;
    
    public Carga(){}

    public Carga(String nombre, String descripcion, int codigo, double peso) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.codigo = codigo;
        this.peso = peso;
    }
    
    public void crearCarga(String nombre, String descripcion, int codigo, double peso){
    
      
        
        System.out.println("Ingresa carga ");
        System.out.print("Nombre : ");
        this.nombre = leer.nextLine();
        System.out.print("Descripcion : ");
        this.descripcion = leer.nextLine();
        System.out.print("Codigo : ");
        this.codigo = leer2.nextInt();
        System.out.print("Peso : ");
        this.peso = leer3.nextDouble();
    }
    
    

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public int getCodigo() {
        return codigo;
    }

    public double getPeso() {
        return peso;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
