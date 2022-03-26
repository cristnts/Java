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
public class Astronauta extends Persona{
    
    Scanner leer = new Scanner(System.in);
    Scanner leer2 = new Scanner(System.in);
    Scanner leer3 = new Scanner(System.in);
    
    
    String rango;
    int hrsVuelo;

    public Astronauta(String rango, int hrsVuelo, String nombre, String apellido, int edad, double peso, double estatura) {
        super(nombre, apellido, edad, peso, estatura);
        this.rango = rango;
        this.hrsVuelo = hrsVuelo;
    }

    public void crearAstronautas(String rango, int hrsVuelo, String nombre, String apellido, int edad, double peso, double estatura){
    
        System.out.println("CREADOR DE ASTRONAUTA");
        
        System.out.print("Agrega rango :");
        rango = leer.nextLine();
        this.rango=rango;
        System.out.print("Agrega horas de vuelo :");
        hrsVuelo = leer2.nextInt();
        this.hrsVuelo=hrsVuelo;
        System.out.print("Agrega nombre :");
        nombre = leer.nextLine();
        super.nombre = nombre;
        System.out.print("Agrega apellido :");
        apellido = leer.nextLine();
        super.apellido = apellido;
        System.out.print("Agrega edad :");
        edad = leer2.nextInt();
        super.nombre = nombre;
        System.out.print("Agrega peso :");
        peso = leer3.nextDouble();
        super.peso = peso;
        System.out.print("Agrega estatura :");
        estatura = leer3.nextDouble();
        super.estatura = estatura;
        
        
    }
    
    
    

    public void setRango(String rango) {
        this.rango = rango;
    }

    public void setHrsVuelo(int hrsVuelo) {
        this.hrsVuelo = hrsVuelo;
    }

    public String getRango() {
        return rango;
    }

    public int getHrsVuelo() {
        return hrsVuelo;
    }
    
    
    
    
    
}
