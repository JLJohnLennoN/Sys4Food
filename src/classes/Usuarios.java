/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author JohnLennoN
 */
public class Usuarios {

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the tipo
     */
    public String getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    private int matricula;
    private String nome;
    private String senha;
    private String tipo;
    private String pesquisa;

    public String getPesquisa() {
        return pesquisa;
    }

    public void setPesquisa(String pesquisa) {
        this.pesquisa = pesquisa;
    }

    public Usuarios() {
    }

    public Usuarios(String nome) {
        this.nome = nome;
    }
    
    

    /**
     * @return the id
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the descricao
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome
    */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
}
