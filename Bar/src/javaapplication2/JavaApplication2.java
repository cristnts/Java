/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import clases.*;
import java.util.Scanner;
/**
 *
 * @author alumnossur
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int acum1 = 0,acum2=0,acum3=0;
        String var;
        boolean var1;
        int opc = 0, med = 0;
        Scanner leer = new Scanner(System.in);
        Scanner leer2= new Scanner(System.in);
        Scanner leer3= new Scanner(System.in);
        tragos trago_1 = new tragos();
        tragos trago_2 = new tragos();
        tragos trago_3 = new tragos();
        int opc2 = 0;
        
        
        
        
        
                    
                System.out.println("trago 1 ----------------------------");
                System.out.print("Ingresa nombre del trago 1 : "); 
                var = leer.nextLine();
                trago_1.setNombre(var);
                 
                System.out.print("Ingresa costo del trago : ");
                med = leer2.nextInt();
                trago_1.setCosto(med);
                
                
                System.out.print("Ingresa ingrediente 1 : ");
                var = leer.nextLine();
                trago_1.setIng1(var);
                
                System.out.print("Ingresa medida del ingrediente 1 : ");
                med = leer2.nextInt();
                trago_1.setMed1(med);
                 
                System.out.print("Ingresa ingrediente 2 : ");
                var = leer.nextLine();
                trago_1.setIng2(var);
                
                System.out.print("Ingresa medida del ingrediente 2 : ");
                med = leer2.nextInt();
                trago_1.setMed2(med);
                 
                System.out.print("Ingresa ingrediente 3 : ");
                var = leer.nextLine();
                trago_1.setIng3(var);
                
                System.out.print("Ingresa medida del ingrediente 3 : ");
                med = leer2.nextInt();
                trago_1.setMed3(med);
                
                System.out.print("Ingresa precio del trago : ");
                med = leer2.nextInt();
                trago_1.setVenta(med);
                
                System.out.print("¿Desea agregar hielo : ?");   
                var1 = leer3.nextBoolean();
                trago_1.con_hielo(var1);
                
               
                System.out.println("trago 2 ----------------------------");
                
               
            /** trago 2 ------------------------------- 
                System.out.print("Ingresa nombre del trago 2 : "); 
                var = leer.nextLine();
                trago_2.setNombre(var);
                
                System.out.print("Ingresa costo del trago : ");
                med = leer2.nextInt();
                trago_2.setCosto(med);
                
                System.out.print("Ingresa ingrediente 1 : ");
                var = leer.nextLine();
                trago_2.setIng1(var);
                
                System.out.print("Ingresa medida del ingrediente 1 : ");
                med = leer2.nextInt();
                trago_2.setMed1(med);
                 
                System.out.print("Ingresa ingrediente 2 : ");
                var = leer.nextLine();
                trago_2.setIng2(var);
                
                System.out.print("Ingresa medida del ingrediente 2 : ");
                med = leer2.nextInt();
                trago_2.setMed2(med);
                 
                System.out.print("Ingresa ingrediente 3 : ");
                var = leer.nextLine();
                trago_2.setIng3(var);
                
                System.out.print("Ingresa medida del ingrediente 3 : ");
                med = leer2.nextInt();
                trago_2.setMed3(med);
             
                System.out.print("Ingresa precio del trago : ");
                med = leer2.nextInt();
                trago_2.setVenta(med);
                
                System.out.print("¿Desea agregar hielo ?");   
                var1 = leer3.nextBoolean();
                trago_2.con_hielo(var1);
                
               
                
                System.out.println("trago 3 ----------------------------");
                   /** trago 3 ------------------------------- 
                 System.out.print("Ingresa nombre del trago : "); 
                var = leer.nextLine();
                trago_3.setNombre(var);
                
                System.out.print("Ingresa costo del trago : ");
                med = leer2.nextInt();
                trago_3.setCosto(med);
                
                System.out.print("Ingresa ingrediente 1 : ");
                var = leer.nextLine();
                trago_3.setIng1(var);
                System.out.print("Ingresa medida del ingrediente 1 : ");
                med = leer2.nextInt();
                trago_3.setMed1(med);
                 
                System.out.print("Ingresa ingrediente 2 : ");
                var = leer.nextLine();
                trago_3.setIng2(var);
                System.out.print("Ingresa medida del ingrediente 2 : ");
                med = leer2.nextInt();
                trago_3.setMed2(med);
                 
                System.out.print("Ingresa ingrediente 3 : ");
                var = leer.nextLine();
                trago_3.setIng3(var);
                
                System.out.print("Ingresa medida del ingrediente 3 : ");
                med = leer2.nextInt();  
                trago_3.setMed3(med);
                
                 System.out.print("Ingresa precio del trago : ");
                med = leer2.nextInt();
                trago_3.setVenta(med);
                
                
                System.out.print("¿Desea agregar hielo ? : ");   
                var1 = leer3.nextBoolean();
                trago_3.con_hielo(var1);
                
             **/
            
        do{        
        System.out.println("------------------------------");    
        System.out.println("------ MENÚ DE ACCIONES ------");        
                
        System.out.println("1. Vender trago 1");
        System.out.println("2. Vender trago 2");
        System.out.println("3. Vender trago 3");
        System.out.println("4. Modificar trago 1");
        System.out.println("5. Modificar trago 2");
        System.out.println("6. Modificar trago 3");
        System.out.println("7. Imprimir informacion de cada trago");
        System.out.println("8. Salir del sistema");
        opc = leer2.nextInt();
        
        System.out.println("------------------------------");
         
        
   
        
        switch(opc){
        case 1 : { 
            
            System.out.println("PREPARANDO..."+trago_1.getNombre());
                    
                   
                    trago_1.vender();                              /**cantidades vendidas**/
                                                                            /**total ventas del trago**/                     
                 
        }break;
        case 2 : { 
            
            System.out.println("PREPARANDO..."+trago_2.getNombre());
                    acum2 = acum2 + 1; 
                    trago_2.setAcum(acum2);                                /**cantidades vendidas**/
                             /**total ventas del trago**/                     
                    
        }break;
        case 3 : { 
            
            System.out.println("PREPARANDO..."+trago_3.getNombre());
                    acum3 = acum3 + 1; 
                    trago_3.setAcum(acum3);                                /**cantidades vendidas**/
                                                                             /**total ventas del trago**/                     
                    
        }break;
        case 4 :  {
            System.out.println("MODIFICANDO... trago "+trago_1.getNombre() );    
               
                do{
               System.out.println("1. modificar nombre ");
               System.out.println("2. modificar ingrediente 1"); 
               System.out.println("3. modificar ingrediente 2");
               System.out.println("4. modificar ingrediente 3"); 
               System.out.println("5. modificar costo");
               System.out.println("6. modificar valor");
               System.out.println("7. volver atras"); //default
               opc2 = leer2.nextInt();
               
               switch(opc2)
               { 
                   case 1 : {
                      
                       System.out.println("MODIFICADOR DE NOMBRE");
                       System.out.print("Ingresa el nuevo nombre : ");
                       var = leer.nextLine();
                       trago_1.setNombre(var);
                       System.out.print("se ah cambiado el nombre del trago a : "+trago_1.getNombre());
                       
                   }break; 
                   case 2 :{ 
                   
                       System.out.println("MODIFICADOR DE INGREDIENTE 1");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_1.setIng1(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_1.setMed1(med);
                   }break;
                   case 3 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 2");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_1.setIng2(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_1.setMed2(med);  
                   }break;
                   case 4 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 3");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_1.setIng3(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_1.setMed3(med);
                   }break;
                   case 5 :{
                       System.out.println("MODIFICADOR DE COSTO");
                       System.out.print("Ingresa el nuevo costo del trago : ");
                       med = leer2.nextInt();
                       trago_1.setCosto(med);
                       System.out.print("Quitar/agregar hielo :");
                       var1 = leer3.nextBoolean();
                       trago_1.setHielo(var1);
                       trago_1.con_hielo(var1);
                   }
                   case 6 :{
                       System.out.println("MODIFICADOR DE PRECIO VENTA");
                       System.out.print("Ingresa el nuevo precio : ");
                       med = leer.nextInt();
                       trago_1.setVenta(med);
                       
                   }break;
                   default:
               }}while(opc2<6);
               
               
                       
                
        }
                    
        case 5 : {
        
            System.out.println("MODIFICANDO... trago "+trago_2.getNombre() );    
               
                do{
            
               System.out.println("1. modificar nombre ");
               System.out.println("2. modificar ingrediente 1"); 
               System.out.println("3. modificar ingrediente 2");
               System.out.println("4. modificar ingrediente 3"); 
               System.out.println("5. modificar costo");
               System.out.println("6. modificar valor");
               System.out.println("7. volver atras"); //default
               opc2 = leer2.nextInt();
               
               switch(opc2)
               { 
                   case 1 : {
                      
                       System.out.println("MODIFICADOR DE NOMBRE");
                       System.out.print("Ingresa el nuevo nombre : ");
                       var = leer.nextLine();
                       trago_2.setNombre(var);
                       System.out.print("se ah cambiado el nombre del trago a : "+trago_2.getNombre());
                       
                   }break; 
                   case 2 :{ 
                   
                       System.out.println("MODIFICADOR DE INGREDIENTE 1");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_2.setIng1(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_2.setMed1(med);
                   }break;
                   case 3 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 2");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_2.setIng2(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_2.setMed2(med);  
                   }break;
                   case 4 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 3");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_2.setIng3(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_2.setMed3(med);
                   }break;
                   case 5 :{
                       System.out.println("MODIFICADOR DE COSTO");
                       System.out.print("Ingresa el nuevo costo del trago : ");
                       med = leer2.nextInt();
                       trago_2.setCosto(med);
                       System.out.print("Quitar/agregar hielo :");
                       var1 = leer3.nextBoolean();
                       trago_2.setHielo(var1);
                       trago_2.con_hielo(var1);
                   }
                   case 6 :{
                       System.out.println("MODIFICADOR DE PRECIO VENTA");
                       System.out.print("Ingresa el nuevo precio : ");
                       med = leer.nextInt();
                       trago_2.setVenta(med);
                       
                   }break;
                   default:
               }}while(opc2<6);
        }break;
        case 6 : {System.out.println("MODIFICANDO... trago "+trago_3.getNombre() );    
               
               do{ 
               System.out.println("1. modificar nombre ");
               System.out.println("2. modificar ingrediente 1"); 
               System.out.println("3. modificar ingrediente 2");
               System.out.println("4. modificar ingrediente 3"); 
               System.out.println("5. modificar costo");
               System.out.println("6. modificar valor");
               System.out.println("7. volver atras"); //default
               opc2 = leer2.nextInt();
               
               switch(opc2)
               { 
                   case 1 : {
                      
                       System.out.println("MODIFICADOR DE NOMBRE");
                       System.out.print("Ingresa el nuevo nombre : ");
                       var = leer.nextLine();
                       trago_3.setNombre(var);
                       System.out.print("se ah cambiado el nombre del trago a : "+trago_3.getNombre());
                       
                   }break; 
                   case 2 :{ 
                   
                       System.out.println("MODIFICADOR DE INGREDIENTE 1");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_3.setIng1(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_3.setMed1(med);
                   }break;
                   case 3 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 2");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_3.setIng2(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_3.setMed2(med);  
                   }break;
                   case 4 :{
                       System.out.println("MODIFICADOR DE INGREDIENTE 3");
                       System.out.print("Ingresa el nuevo ingrediente : ");
                       var = leer.nextLine();
                       trago_3.setIng3(var);
                       System.out.print("Ingresa la cantidad : ");
                       med = leer2.nextInt();
                       trago_3.setMed3(med);
                   }break;
                   case 5 :{
                       System.out.println("MODIFICADOR DE COSTO");
                       System.out.print("Ingresa el nuevo costo del trago : ");
                       med = leer2.nextInt();
                       trago_3.setCosto(med);
                       System.out.print("Quitar/agregar hielo :");
                       var1 = leer3.nextBoolean(); 
                       trago_3.setHielo(var1);
                       trago_3.con_hielo(var1);
                   }
                   case 6 :{
                       System.out.println("MODIFICADOR DE PRECIO VENTA");
                       System.out.print("Ingresa el nuevo precio : ");
                       med = leer.nextInt();
                       trago_3.setVenta(med);
                       
                   }break;
                   default:
                       
               }}while(opc2<6);
        }break;
        case 7 : {  System.out.println("INFORMACION DE TRAGOS");
                    
                    System.out.println("=====================");
        
                    System.out.println(trago_1.getNombre());
                    System.out.println("INGREDIENTES");
                    System.out.println(trago_1.getIng1());
                    System.out.println(trago_1.getMed1());
                    System.out.println(trago_1.getIng2());
                    System.out.println(trago_1.getMed2());
                    System.out.println(trago_1.getIng3());
                    System.out.println(trago_1.getMed3());
                    System.out.println("costo : "+trago_1.getCosto());
                    System.out.println("precio : "+trago_1.getVenta());
                    System.out.println("cantidades vendidas : " +trago_1.getAcum());
                    System.out.println("Total venta : "+trago_1.getAcum()*trago_1.getVenta());
                    trago_1.utilidad();
                    
                    System.out.println("======================================");
                    
                    System.out.println(trago_2.getNombre());
                    System.out.println("INGREDIENTES");
                    System.out.println(trago_2.getIng1());
                    System.out.println(trago_2.getMed1());
                    System.out.println(trago_2.getIng2());
                    System.out.println(trago_2.getMed2());
                    System.out.println(trago_2.getIng3());
                    System.out.println(trago_2.getMed3());
                    System.out.println("costo : "+trago_2.getCosto());
                    System.out.println("precio : "+trago_2.getVenta());
                    System.out.println("cantidades vendidas : " +trago_2.getAcum());
                    System.out.println("Total venta : "+trago_2.getAcum()*trago_2.getVenta());
                    trago_2.utilidad();
                    
                    System.out.println("======================================");
                    
                    System.out.println(trago_3.getNombre());
                    System.out.println("INGREDIENTES");
                    System.out.println(trago_3.getIng1());
                    System.out.println(trago_3.getMed1());
                    System.out.println(trago_3.getIng2());
                    System.out.println(trago_3.getMed2());
                    System.out.println(trago_3.getIng3());
                    System.out.println(trago_3.getMed3());
                    System.out.println("costo : "+trago_3.getCosto());
                    System.out.println("precio : "+trago_3.getVenta());
                    System.out.println("cantidades vendidas : " +trago_3.getAcum());
                    System.out.println("Total venta : "+trago_3.getAcum()*trago_3.getVenta());
                    trago_3.utilidad();
        
        }break;
        
        default : System.out.println("Adios");
        
      
        
        }
        
        }while(opc<8);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
}
}     
    
          

        



    
  
    
    
    
    
    




