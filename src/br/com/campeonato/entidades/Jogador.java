/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.entidades;

/**
 *
 * @author jhonata.silva1
 */
public class Jogador {

    private String nome;
    private String camisa;
    private String posicao;
    private int idade;

    public int getIdade() {
        return idade;
    }

    public Jogador() {

    }
    private int idjogador; 

    public int getIdjogador() {
        return idjogador;
    }

    public void setIdjogador(int idjogador) {
        this.idjogador = idjogador;
    }
    
    public Jogador(String nome, String camisa, String posicao, int idade) {
        this.nome = nome;
        this.camisa = camisa;
        this.posicao = posicao;
        this.idade = idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCamisa() {
        return camisa;
    }

    public void setCamisa(String camisa) {
        this.camisa = camisa;
    }

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

}
