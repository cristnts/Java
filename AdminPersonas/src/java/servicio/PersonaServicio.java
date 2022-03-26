/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.PersonaDAO;
import dominio.Persona;
import dto.PersonaDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author alumnossur
 */
@Stateless
public class PersonaServicio {
    @EJB
    
    private PersonaDAO personaDAO;
    
    public void createPersona(PersonaDTO perDTO){
        Persona per = new Persona();
        per.setRut(perDTO.getRut());
        per.setNombre(perDTO.getNombre());
        per.setApellido(perDTO.getApellido()); 
        personaDAO.createPersona(per);
   }
   
    public PersonaDTO readPersona(int rut){
        Persona per = personaDAO.readPersona(rut);
        PersonaDTO perDTO= new PersonaDTO();
        
        perDTO.setRut(per.getRut());
        perDTO.setNombre(per.getNombre());
        perDTO.setApellido(per.getApellido());
     return perDTO;
        }
    
    public void updatePersona(PersonaDTO perDTO){
        Persona per = new Persona();
        per.setRut(perDTO.getRut());
        per.setNombre(perDTO.getNombre());
        per.setApellido(perDTO.getApellido());
        personaDAO.updatePersona(per);
       
    }
    
    public void deletePersona(int rut){
        personaDAO.deletePersona(rut);
     }
    
}
