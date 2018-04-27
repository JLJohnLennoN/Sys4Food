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
public class Produto {
    private int id;
    private String nome;
    private int qtd;
    private double valor;
    private Usuarios usuarios;

    public Produto() {
    }

    public Produto(String nome, int qtd, double valor, Usuarios usuarios) {
        this.nome = nome;
        this.qtd = qtd;
        this.valor = valor;
        this.usuarios = usuarios;
    }
    
    

    /**
     * @return the id
     */
    public int getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     * @return the descricao
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setNome(String descricao) {
        this.nome = descricao;
    }

    /**
     * @return the qtd
     */
    public int getQtd() {
        return qtd;
    }

    /**
     * @param qtd the qtd to set
     */
    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    /**
     * @return the valor
     */
    public double getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(double valor) {
        this.valor = valor;
    }

    /**
     * @return the categoria
     */
    public Usuarios getUsuarios() {
        return usuarios;
    }

    /**
     * @param usuarios
     */
    public void setUsuarios(Usuarios usuarios) {
        this.usuarios = usuarios;
    }
    
}
