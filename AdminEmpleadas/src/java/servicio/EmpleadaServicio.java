/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.EmpleadaDAO;
import dominio.Empleada;
import dto.EmpleadaDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Vania
 */
@Stateless
public class EmpleadaServicio {
    @EJB
    
    private EmpleadaDAO empleadaDAO;
    
     public void createEmpleada(EmpleadaDTO empDTO){
        Empleada emp = new Empleada();
        emp.setRut(empDTO.getRut());
        emp.setNombre(empDTO.getNombre());
        emp.setApellido(empDTO.getApellido());
        emp.setTelefono(empDTO.getTelefono());
        emp.setClasificacion(empDTO.getClasificacion());

        empleadaDAO.createEmpleada(emp);
   }
     
      public EmpleadaDTO readEmpleada(int rut){
        Empleada emp = empleadaDAO.readEmpleada(rut);
        EmpleadaDTO empDTO= new EmpleadaDTO();
        
        empDTO.setRut(emp.getRut());
        empDTO.setNombre(emp.getNombre());
        empDTO.setApellido(emp.getApellido());
        empDTO.setTelefono(emp.getTelefono());
        empDTO.setClasificacion(emp.getClasificacion());
                
        return empDTO;
        }
    
        public void updateEmpleada(EmpleadaDTO empDTO){
        Empleada emp = new Empleada();
        emp.setRut(empDTO.getRut());
        emp.setNombre(empDTO.getNombre());
        emp.setApellido(empDTO.getApellido());
        emp.setTelefono(empDTO.getTelefono());
        emp.setClasificacion(empDTO.getClasificacion());
        empleadaDAO.updateEmpleada(emp);
       
    }
    
     public void deleteEmpleada(int rut){
        empleadaDAO.deleteEmpleada(rut);
     }
    
}
