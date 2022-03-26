/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.ArrayList;
import java.util.*;
/**
 *
 * @author C_Caceres
 */
public class Nave extends Carga{
    
    
           Scanner leer = new Scanner(System.in);
           Scanner leer2 = new Scanner(System.in);
           Scanner leer3 = new Scanner(System.in);
    
    String nombre;
    int cargaMax, pasajerosMax;
    ArrayList<Carga> listaCarga;
    ArrayList<Astronauta> listaAstronauta;

    public Nave(){}
    
    public Nave(String nombre, int cargaMax, int pasajerosMax, ArrayList<Carga> listaCarga, ArrayList<Astronauta> listaAstronauta) {
        this.nombre = nombre;
        this.cargaMax = cargaMax;
        this.pasajerosMax = pasajerosMax;
        this.listaCarga = listaCarga;
        this.listaAstronauta = listaAstronauta;
    }


public void crearNave(String nombre, int cargaMax, int pasajerosMax){

    System.out.println("CREADOR DE NAVE ");
    
    System.out.println("Agrega nombre : ");
    nombre = leer.nextLine();
    this.nombre = nombre ;
    System.out.println("Agrega carga maxima : ");
    cargaMax = leer2.nextInt();
    System.out.println("Agrega numero maximo de pasajeros : ");
    pasajerosMax = leer2.nextInt();
    

}    
    
 public void crearCarga(String nombre, String descripcion, int codigo, double peso){

     Carga c = new Carga();
     
     
        System.out.println("Ingresa carga ");
        System.out.print("Nombre : ");
        this.nombre = leer.nextLine();
        System.out.print("Descripcion : ");
        this.descripcion = leer.nextLine();
        System.out.print("Codigo : ");
        this.codigo = leer2.nextInt();
        System.out.print("Peso : ");
        this.peso = leer3.nextDouble();
        
        listaCarga.add(c);
    }
    
   
 
 
 
    public String despegar(){
    
    if(listaAstronauta.size()<1){
        
        return "Faltan tripulantes";
    
    }else
        return "3,2,1... DESPEGANDO";
    
    } 
    
   
          

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargaMax(int cargaMax) {
        this.cargaMax = cargaMax;
    }

    public void setPasajerosMax(int pasajerosMax) {
        this.pasajerosMax = pasajerosMax;
    }

    public String getNombre() {
        return nombre;
    }

    public int getCargaMax() {
        return cargaMax;
    }

    public int getPasajerosMax() {
        return pasajerosMax;
    }
    
    
    
    
}
