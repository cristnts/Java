/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import javax.ejb.Stateless;

/**
 *
 * @author alumnossur
 */
@Stateless
public class SupermercadoSessionBean implements SupermercadoSessionBeanLocal {
///la logica de negocio va en el sesion bean al iwal que los arraylist

    ArrayList<Producto> productos = new ArrayList<Producto>();
    
    public double obtenerDescuento(double precio, String dia, String categoria) {
           
        
        double descuento=0;
                
        if(dia.equals("lunes") && categoria.equals("hogar")){
        
                 descuento = precio*0.1;
        
        }
        if(dia.equals("miercoles") && categoria.equals("frutayverdura")){
        
                  descuento = precio*0.15;
        }
        if(dia.equals("viernes") && categoria.equals("electro")){
        
                  descuento = precio*0.2;
        }
        else if(dia.equals("martes")||dia.equals("jueves"))
            
            descuento = precio;
            
        
         
    return descuento;
    }

    
    public double calcularPrecioFinal(double precio, String dia, String categoria) {
         
        double precioFinal=0;
                
        if(dia.equals("lunes") && categoria.equals("hogar")){
        
                 precioFinal = precio*0.9;
        
        }
        if(dia.equals("miercoles") && categoria.equals("frutayverdura")){
        
                  precioFinal = precio*0.85;
        }
        if(dia.equals("viernes") && categoria.equals("electro")){
        
                  precioFinal = precio*0.8;
        }
        else if(dia.equals("martes")||dia.equals("jueves")){
            
            precioFinal = precio;
            
        }
         
    return precioFinal;
    }
    
   public void agregarObjeto(Producto producto){
       productos.add(producto);
   }
   
    public ArrayList<Producto> retornarObjeto(){
    return productos;
    }

    
   
    
    
    
}
