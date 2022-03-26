package Connexion;
import java.sql.*;
import com.mysql.jdbc.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author alumnossur
 */
public class coneBD {
    public static PreparedStatement prest = null;
    public static CallableStatement cllst = null;
    public static java.sql.Connection conec = null;
    public static Statement st = null;
    public static ResultSet rt = null;
    public static String usu;
    public static String contra;
    public static String host;
    public static String db;

    public void Conectar() {
        try {
            usu = "root";
            contra = "";
            host = "localhost";
            db = "bibliotecafinal";
            String url = "jdbc:mysql://" + host + "/" + db;
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conec = DriverManager.getConnection(url, usu, contra);
        } catch (Exception e) {
            System.out.println("Error SQL.....conexion" +e);
            JOptionPane.showMessageDialog(null, e.toString());
        }
        
        if ( conec != null )
            System.out.println("Se ha establecido una conexión a la base de datos ");
    }

    
    
    
    
    
    
    
    
    
    
    
    
    /* public static Connection conec
    private java.sql.Connection con = null; //crea objeto conexion nulo
    private String baseDeDatos;
    private String user;
    private String pass;
    private String url;

    public AbrirBaseDeDatos() {
            }
    public java.sql.Connection conectar(String baseDeDatos) throws Exception{
        try {
              String user = new String("root"); // el root de mysql
              String pass = new String(""); //passwd del mysql
              String url = "jdbc:mysql://localhost:3306/bibliotecafinal";//+nombrebiblioteca
              Class.forName("com.mysql.jdbc.Driver").newInstance();//declaración del driver para conectarse
              con = DriverManager.getConnection(url,user,pass); //este conecta
            }
            catch (SQLException sqle)
                  {
                       System.out.println("Error SQL.....conexion" +sqle);
                  }

        if ( con != null )
            System.out.println("Se ha establecido una conexión a la base de datos ");

     return con;
    }

    
   

    public void cerrarConexion() {
        try {
            if (con != null) {
                con.close();
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage(), "Problemas con la conexión", JOptionPane.ERROR_MESSAGE);
        }
    }*/

    public void executeUpdate(String SQL) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

    
}
