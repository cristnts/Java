/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo.distribuidor;

import com.mysql.jdbc.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import vista.Distribuidor.Distribuidor;


/**
 *
 * @author vaio
 */
public class Registro {
    static ArrayList<Distribuidor>listaDistribuidor;
    private PreparedStatement ps;
    private java.sql.Connection cn;
    private ResultSet rs;
    private ResultSetMetaData rsm;
    DefaultTableModel dtm;
    
    
    public Registro(){
        listaDistribuidor= new ArrayList<Distribuidor>();
        
    }
    public static ArrayList<Distribuidor>getListaDistribuidor(){
        return listaDistribuidor;
        
    }
     

    

   
    

    
}
