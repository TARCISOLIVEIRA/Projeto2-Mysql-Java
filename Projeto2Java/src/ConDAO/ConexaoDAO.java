package ConDAO;



import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class ConexaoDAO {
    public Connection conectaDB (){
        Connection con = null;
       
        try {
           String url = "jdbc:mysql://localhost:3306/BancoTeste?user=root&password=root" ;
           con = DriverManager.getConnection(url);
       
           
        } catch (SQLException erro) {
         JOptionPane.showMessageDialog(null,"ConexãoDAO" + erro.getMessage());
              
    }
        return con;
    }
    
}
