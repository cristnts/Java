/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Giro;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vania
 */

@Stateless
public class GiroDAO {
    @PersistenceContext 
    private EntityManager em;
    
    public void createGiro(Giro g){
        em.persist(g);
    }
    
    public Giro readGiro(int id){
    return em.find(Giro.class, id);
    }
    
    public void deleteGiro(int id){
        em.remove(readGiro(id));
    }
    
    public void updateGiro(Giro g){
        em.merge(g);
    }
    
      public List<Giro> allGirosCuenta(int numeroCuenta){
        return em.createQuery("SELECT g from giros g WHERE g.numeroCuenta.numeroCuenta = :numeroCuenta")
                .setParameter("numeroCuenta",numeroCuenta)
               .getResultList();
                               }
    
}
