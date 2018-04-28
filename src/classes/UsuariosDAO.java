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
import javax.swing.JOptionPane;

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
        String sql = "INSERT INTO usuarios (nome, senha, tipo) VALUES(?,?,?)";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getSenha());
            stmt.setString(3, usuarios.getTipo());
            stmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
            ConnectionFactory.closeConnection(con, stmt);
        }
    }
    
    
    public Usuarios buscaUsuarios (Usuarios usuarios){
        String sql = "SELECT * FROM usuarios WHERE nome like'%"+usuarios.getPesquisa()+"%'";
        PreparedStatement stmt = null;
        ResultSet rs = null;
        List<Usuarios> usuario = new ArrayList<>();
        
        try{
               stmt = con.prepareStatement(sql);
              rs =  stmt.executeQuery();
              
              while(rs.next()){
                  //Usuarios usuarios = new Usuarios();
                  usuarios.setMatricula(rs.getInt("matricula"));
                  usuarios.setNome(rs.getString("nome"));
                  usuarios.setTipo(rs.getString("tipo"));
                  usuarios.setSenha(rs.getString("senha"));
                  usuario.add(usuarios);
              }
        }catch (SQLException ex){
            System.err.println("Erro: Usuário não cadastrado!"+ex);
        }finally{
            //ConnectionFactory.closeConnection(con, stmt, rs);
        }
        
        return usuarios;
        
    }
    public boolean update (Usuarios usuarios){
        String sql = "UPDATE usuarios SET nome=?, senha=?, tipo = ? WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setString(1, usuarios.getNome());
            stmt.setString(2, usuarios.getSenha());
            stmt.setString(3, usuarios.getTipo());
            stmt.setInt(4, usuarios.getMatricula());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário alterado com sucesso! ");
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro: "+ex);
            return false;
        }finally{
           // ConnectionFactory.closeConnection(con, stmt);
        }
    }
        public boolean delete (Usuarios usuarios){
        String sql = "DELETE FROM usuarios WHERE matricula = ?";
        PreparedStatement stmt = null;
        try {
            stmt = con.prepareStatement(sql);
            stmt.setInt(1, usuarios.getMatricula());
            stmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso! ");
            return true;
                    } catch (SQLException ex) {
            System.err.println("Erro ao excluir. Erro: "+ex);
            return false;
        }finally{
            //ConnectionFactory.closeConnection(con, stmt);
        }
    }
        
        
}
