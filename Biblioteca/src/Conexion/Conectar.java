package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conectar {
    
    private String driver="com.mysql.jdbc.Driver";
    private String Conexion="jdbc:mysql://127.0.0.1/bdbiblio";
    private String usuario="root";
    private String clave="";
    public Connection con;
    
    public Conectar(){
    try{
         Class.forName(driver);
        con=DriverManager.getConnection(Conexion, usuario, clave);
        JOptionPane.showMessageDialog(null, "se establecio una conexion con la BD");
    }catch(Exception e){
        JOptionPane.showMessageDialog(null, "No se ha podido establecer una conexion con la BD");
    }
       
}
    
    public static void main(String[]args){
        Conectar con=new Conectar();
    }
    
}
