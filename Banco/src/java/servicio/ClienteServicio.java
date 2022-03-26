
package servicio;

import dao.ClienteDAO;
import dominio.Cliente;
import dto.ClienteDTO;
import javax.ejb.EJB;
import javax.ejb.Stateless;

@Stateless
public class ClienteServicio {
    @EJB
    private ClienteDAO clienteDAO;
    
    public void createCliente(ClienteDTO cliDTO){
      Cliente cli = new Cliente();  
      cli.setRut(cliDTO.getRut());
      cli.setNombre(cliDTO.getNombre());
      cli.setApellido(cliDTO.getApellido());
      cli.setCelular(cliDTO.getCelular());
      cli.setMail(cliDTO.getMail());
      cli.setUsuario(cliDTO.getUsuario());
      cli.setPass(cliDTO.getPass());
      clienteDAO.createCliente(cli);
    }
    
    public ClienteDTO readCliente(int rut){
      
      Cliente cli=clienteDAO.readCliente(rut);
      
      ClienteDTO cliDTO=new ClienteDTO();
      
      cliDTO.setRut(cli.getRut());
      cliDTO.setNombre(cli.getNombre());
      cliDTO.setApellido(cli.getApellido());
      cliDTO.setCelular(cli.getCelular());
      cliDTO.setMail(cli.getMail());
      cliDTO.setUsuario(cli.getUsuario());
      cliDTO.setPass(cli.getPass());
      return cliDTO;
    }
    
    public void updateCliente(ClienteDTO cliDTO){
        Cliente cli = new Cliente();
        
      cli.setRut(cliDTO.getRut());
      cli.setNombre(cliDTO.getNombre());
      cli.setApellido(cliDTO.getApellido());
      cli.setCelular(cliDTO.getCelular());
      cli.setMail(cliDTO.getMail());
      cli.setUsuario(cliDTO.getUsuario());
      cli.setPass(cliDTO.getPass());
      clienteDAO.updateCliente(cli);
    }
    
    public void deletePersona(int rut){
        clienteDAO.deleteCliente(rut);
    }
    
    
    
    
    
    
}
