/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Persona;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author alumnossur
 */
@Stateless
public class PersonaDAO {
    
    @PersistenceContext
    
    private EntityManager em;
    
    public void createPersona(Persona per){
        em.persist(per);
    }
    
    public Persona readPersona(int rut){
    
        Persona per = em.find(Persona.class, rut);
        
        return per;
        }
    
    public void updatePersona(Persona per){
        em.merge(per);
    }
    
    public void deletePersona(int rut){
        em.remove(readPersona(rut));
    }
}
