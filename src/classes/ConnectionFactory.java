package classes;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConnectionFactory {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String URL = "jdbc:mysql://localhost:3306/sys4Food";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";


public static Connection getConnection(){
  
        try {
            Class.forName(DRIVER);
            
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (ClassNotFoundException | SQLException ex) {
            throw new RuntimeException("Erro na Conexão..", ex);
        }
}
 public static void closeConnection(Connection con){
   
    if(con != null){
        try {
            con.close();
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
    }

    }
 public static void closeConnection(Connection con, PreparedStatement stmt){
   
    if(stmt != null){
        try {
            stmt.close();
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
    }
        closeConnection(con);
    }
 
 public static void closeConnection(Connection con, PreparedStatement stmt, ResultSet rs){
   
    if(rs != null){
        try {
            rs.close();
        } catch (SQLException ex) {
            System.err.println("Erro" + ex);
        }
    }
        closeConnection(con, stmt);
    }
 
}

