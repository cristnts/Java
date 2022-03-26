/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import dominio.Deposito;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Vania
 */
@Stateless
public class DepositoDAO {
    @PersistenceContext 
    private EntityManager em;
    
    public void createDeposito(Deposito d){
        em.persist(d);
    }
    
    public Deposito readDeposito(int id){
    return em.find(Deposito.class, id);
    }
    
    public void deleteDeposito(int id){
        em.remove(readDeposito(id));
    }
    
    
    public void updateDeposito(Deposito d){
        em.merge(d);
    }
    
    public List<Deposito> allDepositosCuenta(int numeroCuenta){
        return em.createQuery("SELECT d from depositos d WHERE d.numeroCuenta.numeroCuenta = :numeroCuenta")
                .setParameter("numeroCuenta",numeroCuenta)
               .getResultList();
                               }
    
}
