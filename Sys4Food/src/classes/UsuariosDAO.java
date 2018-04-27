/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author JohnLennoN
 */
public class UsuariosDAO {
    private Connection con = null;

    public UsuariosDAO() {
        con = ConnectionFactory.getConnection();
    }
    
    public boolean save (Usuarios usuarios){
        String sql = "INSERT INTO usuarios (nome) VALUES(?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuarios.getNome());
            stmt.executeUpdate();
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    public List<Usuarios> findAll(){
        String sql = "SELECT * FROM usuarios";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuarios> usuario = new ArrayList<>();
        
        try{
               stmt = con.prepareStatement(sql);
              rs =  stmt.executeQuery();
              
              while(rs.next()){
                  Usuarios usuarios = new Usuarios();
                  usuarios.setNome(rs.getString("nome"));
                  usuario.add(usuarios);
              }
        }catch (SQLException ex){
            System.err.println("Erro: "+ex);
        }finally{
            ConnectionFactory.closeConnection(con, stmt, rs);
        }
        return usuario;
    }
        public boolean update (Usuarios usuarios){
        String sql = "UPDATE usuarios SET nome = ? WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuarios.getNome());
            stmt.setInt(2, usuarios.getMatricula());
            stmt.executeUpdate();
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
        public boolean delete (Usuarios usuarios){
        String sql = "DELETE FROM usuarios WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuarios.getMatricula());
            stmt.executeUpdate();
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
}
