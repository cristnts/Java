/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author alumnossur
 */
public class tragos {
    
    
    String nombre,ing1,ing2,ing3;
    int med1,med2,med3,costo ;
    boolean hielo = false;
    int venta;
    private int acum=0;
    
    public tragos(){};

    public tragos(String nombre, String ing1, String ing2, String ing3, int med1, int med2, int med3, int costo, int venta, int acum) {
        this.nombre = nombre;
        this.ing1 = ing1;
        this.ing2 = ing2;
        this.ing3 = ing3;
        this.med1 = med1;
        this.med2 = med2;
        this.med3 = med3;
        this.costo = costo;
        this.venta = venta;
        this.acum = acum;
    }

    public void vender(){
    
       
        
        this.acum=this.acum+1; 
    
    
    }
    
    
    public void utilidad(){
    
        int util;
        
            util = this.venta-this.costo;
        
            System.out.println("Utilidad : "+util);
    
    }
    
    public void con_hielo(boolean hielo){
    
        if(hielo = true){
        
               this.costo = this.costo + 50; 
        
        }
     
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIng1(String ing1) {
        this.ing1 = ing1;
    }

    public void setIng2(String ing2) {
        this.ing2 = ing2;
    }

    public void setIng3(String ing3) {
        this.ing3 = ing3;
    }

    public void setMed1(int med1) {
        this.med1 = med1;
    }

    public void setMed2(int med2) {
        this.med2 = med2;
    }

    public void setMed3(int med3) {
        this.med3 = med3;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }

    public void setHielo(boolean hielo) {
        this.hielo = hielo;
    }

    public void setVenta(int venta) {
        this.venta = venta;
    }

    public void setAcum(int acum) {
        this.acum = acum;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIng1() {
        return ing1;
    }

    public String getIng2() {
        return ing2;
    }

    public String getIng3() {
        return ing3;
    }

    public int getMed1() {
        return med1;
    }

    public int getMed2() {
        return med2;
    }

    public int getMed3() {
        return med3;
    }

    public int getCosto() {
        return costo;
    }

    public boolean isHielo() {
        return hielo;
    }

    public int getVenta() {
        return venta;
    }

    public int getAcum() {
        return acum;
    }

   
    
 
    
}
