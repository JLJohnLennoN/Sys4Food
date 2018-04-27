/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Ignore;

/**
 *
 * @author JohnLennoN
 */
public class UsuariosDAOTest {
    
    public UsuariosDAOTest() {
    }

    @Test
    @Ignore
    public void inserir() {
        Usuarios cat = new Usuarios("John LennoN");
        UsuariosDAO dao = new UsuariosDAO();
        if (dao.save(cat)){
            System.out.println("Salvo com sucesso!");
        }
        else{
            fail("Erro ao salvar");
        }
    }
    @Test
    @Ignore
    public void atualizar() {
        Usuarios cat = new Usuarios("John Lennon");
        cat.setMatricula(6);
        UsuariosDAO dao = new UsuariosDAO();
        if (dao.update(cat)){
            System.out.println("Atualizado com sucesso!");
        }
        else{
            fail("Erro ao salvar");
        }
    }
    @Test
    @Ignore
    public void listar(){
        UsuariosDAO dao = new UsuariosDAO();
        
        for(Usuarios u: dao.findAll() ){
            System.out.println("Nome: "+u.getNome());
        }
    }
    @Test
    @Ignore
    public void deletar(){
        Usuarios usuarios = new Usuarios();
        usuarios.setMatricula(1);
        UsuariosDAO dao = new UsuariosDAO();
        
        if(dao.delete(usuarios)){
            System.out.println("Removido com sucesso!");
        }else{
            fail("Erro ao deletar");
        }
    }
}