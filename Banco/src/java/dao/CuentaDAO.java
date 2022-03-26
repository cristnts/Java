
package dao;

import dominio.Cuenta;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless
public class CuentaDAO {
    @PersistenceContext
    private EntityManager em;
    
    public void createCuenta(Cuenta cue){
    em.persist(cue);
}

public Cuenta readCuenta(int numeroCuenta){
    Cuenta cue = em.find(Cuenta.class, numeroCuenta);
    return cue;
}

public void updateCuenta(Cuenta cue){
    em.merge(cue);
}

public void deleteCuenta(int numeroCuenta){
    em.remove(readCuenta(numeroCuenta));
}




}
