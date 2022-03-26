/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Empleada;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vania
 */
@Stateless
public class EmpleadaDAO {
    
    @PersistenceContext
    
    private EntityManager em;
    
    public void createEmpleada(Empleada emp){
        em.persist(emp);
    }
    public Empleada readEmpleada(int rut){
    
        Empleada emp = em.find(Empleada.class, rut);
        return emp;
    }
    
    public void updateEmpleada(Empleada emp){
        em.merge(emp);
    }
    
    public void deleteEmpleada(int rut){
        em.remove(readEmpleada(rut));
    }
    
}
