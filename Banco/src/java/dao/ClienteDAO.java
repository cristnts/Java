
package dao;

import dominio.Cliente;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class ClienteDAO {

@PersistenceContext   
private EntityManager em;

public void createCliente(Cliente cli){
    em.persist(cli);
}

public Cliente readCliente(int rut){
    Cliente cli=em.find(Cliente.class, rut);
    return cli;
}

public void updateCliente(Cliente cli){
    em.merge(cli);
}

public void deleteCliente(int rut){
    em.remove(readCliente(rut));
}

public List<Cliente>allCLientesCuenta(int numeroCuenta){
    return em.createQuery("SELECT cl FROM clienteBanco cl WHERE cl.numeroCuenta.numeroCuenta = :numeroCuenta")
            .setParameter("numeroCuenta",numeroCuenta).getResultList();
}





}
