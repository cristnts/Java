/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servicio;

import dao.GiroDAO;
import dominio.Cuenta;
import dominio.Giro;
import dto.GiroDTO;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;

/**
 *
 * @author Vania
 */
@Stateless
public class GiroServicio {
    @EJB
    private GiroDAO dao;
    
    public void createGiro(GiroDTO gDTO){
    
        Giro g = new Giro();
        
        g.setTipoCuenta(gDTO.getTipoCuenta());
        g.setMonto(gDTO.getMonto());
        g.setFecha(gDTO.getFecha());
        
        Cuenta c = new Cuenta();
        
        c.setNumeroCuenta(gDTO.getNumeroCuenta());
        g.setNumeroCuenta(c);
        
        dao.createGiro(g);
        }
 
    public GiroDTO readGiro(int id){

        Giro g = new Giro();
        GiroDTO gDTO = new GiroDTO();
        
        gDTO.setId_giro(g.getId_giro());
        gDTO.setFecha(g.getFecha());
        gDTO.setTipoCuenta(g.getTipoCuenta());
        gDTO.setMonto(g.getMonto());
        gDTO.setNumeroCuenta(g.getNumeroCuenta().getNumeroCuenta());
    return gDTO;
    }
    
    public void deleteGiro(int id){
        dao.deleteGiro(id);
    }
    
    public void updateGiro(GiroDTO gDTO){
        Giro g = new Giro();
        g.setFecha(gDTO.getFecha());
        g.setId_giro(gDTO.getId_giro());
        g.setMonto(gDTO.getMonto());
        g.setTipoCuenta(gDTO.getTipoCuenta());
        
        Cuenta c = new Cuenta();
        
        c.setNumeroCuenta(gDTO.getNumeroCuenta());
        g.setNumeroCuenta(c);
        
        dao.updateGiro(g);    
    }
    
    public ArrayList<GiroDTO> allGirosCuenta(int numeroCuenta){
       
        List<Giro> Giros = dao.allGirosCuenta(numeroCuenta);
        ArrayList<GiroDTO> retorno = new ArrayList<>();
        for(Giro g : Giros){
            GiroDTO gDTO = new GiroDTO();
              gDTO.setId_giro(g.getId_giro());
              gDTO.setFecha(g.getFecha());
              gDTO.setTipoCuenta(g.getTipoCuenta());
              gDTO.setMonto(g.getMonto());
              gDTO.setNumeroCuenta(g.getNumeroCuenta().getNumeroCuenta());
        retorno.add(gDTO);
        
        }
        
        return retorno;
    
    }
    
}
