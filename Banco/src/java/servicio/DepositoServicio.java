/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.DepositoDAO;
import dominio.Cuenta;
import dominio.Deposito;
import dto.DepositoDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Vania
 */
@Stateless
public class DepositoServicio {
    @EJB
    private DepositoDAO dao;
    
    public void createDeposito(DepositoDTO dDTO){
    
        Deposito d = new Deposito();
        
        d.setTipoCuenta(dDTO.getTipoCuenta());
        d.setMonto(dDTO.getMonto());
        d.setFecha(dDTO.getFecha());       
        d.setNumeroCuenta(dDTO.getNumeroCuenta());
               
        dao.createDeposito(d);
        }
 
    public DepositoDTO readDeposito(int id){

        Deposito d = new Deposito();
        DepositoDTO dDTO = new DepositoDTO();
        
        dDTO.setId_deposito(d.getId_deposito());
        dDTO.setFecha(d.getFecha());
        dDTO.setTipoCuenta(d.getTipoCuenta());
        dDTO.setMonto(d.getMonto());
        dDTO.setNumeroCuenta(d.getNumeroCuenta());
    return dDTO;
    }
    
    public void deleteDeposito(int id){
        dao.deleteDeposito(id);
    }
    
    public void updateDeposito(DepositoDTO dDTO){
        Deposito d = new Deposito();
        
        d.setFecha(dDTO.getFecha());
        d.setId_deposito(dDTO.getId_deposito());
        d.setMonto(dDTO.getMonto());
        d.setTipoCuenta(dDTO.getTipoCuenta());
        d.setNumeroCuenta(dDTO.getNumeroCuenta());
        
        dao.updateDeposito(d);    
    }
    
    public ArrayList<DepositoDTO> allDepositosCuenta(int numeroCuenta){
       
        List<Deposito> Depositos = dao.allDepositosCuenta(numeroCuenta);
        ArrayList<DepositoDTO> retorno = new ArrayList<>();
        for(Deposito d : Depositos){
            DepositoDTO dDTO = new DepositoDTO();
              dDTO.setId_deposito(d.getId_deposito());
              dDTO.setFecha(d.getFecha());
              dDTO.setTipoCuenta(d.getTipoCuenta());
              dDTO.setMonto(d.getMonto());
              dDTO.setNumeroCuenta(d.getNumeroCuenta());
        retorno.add(dDTO);
        
        }
        
        return retorno;
    
    }
    
}
