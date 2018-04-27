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
    private int matricula;
    private String nome;

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
