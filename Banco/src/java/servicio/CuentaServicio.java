
package servicio;

import dao.CuentaDAO;
import dominio.Cuenta;
import dto.CuentaDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;


@Stateless
public class CuentaServicio {
@EJB   

private CuentaDAO CuentaDAO;

 public void createCuenta(CuentaDTO cueDTO){
      Cuenta cue = new Cuenta();  
      
      cue.setNumeroCuenta(cueDTO.getNumeroCuenta());
      cue.setFechaApertura(cueDTO.getFechaApertura());
      cue.setTipoCuenta(cueDTO.getTipoCuenta());
      cue.setSaldoCuenta(cueDTO.getSaldoCuenta());
      
      CuentaDAO.createCuenta(cue);
    }
 
  public CuentaDTO readCuenta(int numeroCuenta){
      
      Cuenta cue=CuentaDAO.readCuenta(numeroCuenta);
      
      CuentaDTO cueDTO=new CuentaDTO();
      
      cueDTO.setNumeroCuenta(cue.getNumeroCuenta());
      cueDTO.setFechaApertura(cue.getFechaApertura());
      cueDTO.setTipoCuenta(cue.getTipoCuenta());
      cueDTO.setSaldoCuenta(cue.getSaldoCuenta());
      
      return cueDTO;
    }
  
  public void updateCuenta(CuentaDTO cueDTO){
        Cuenta cue = new Cuenta();
        
      cue.setNumeroCuenta(cueDTO.getNumeroCuenta());
      cue.setFechaApertura(cueDTO.getFechaApertura());
      cue.setTipoCuenta(cueDTO.getTipoCuenta());
      cue.setSaldoCuenta(cueDTO.getSaldoCuenta());
      
      CuentaDAO.updateCuenta(cue);
    }
public void deleteCuenta(int numeroCuenta){
        CuentaDAO.deleteCuenta(numeroCuenta);
    }
 
 
}
