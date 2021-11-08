/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.entidades;

/**
 *
 * @author andrey.sa3
 */
public class Clube {
   
    private String nome;
    private String anoFundação ;
    private String modalidade ;
    
    private int idclub;

    public Clube(String nome, String anoFundação, String modalidade, int idclub) {
        this.nome = nome;
        this.anoFundação = anoFundação;
        this.modalidade = modalidade;
        this.idclub = idclub;
    }

    public int getIdclub() {
        return idclub;
    }

    public void setIdclub(int idclub) {
        this.idclub = idclub;
    }

    public Clube(){
        
    }
    
    public Clube(String nome, String anoFundação, String modalidade) {
        this.nome = nome;
        this.anoFundação = anoFundação;
        this.modalidade = modalidade;
    }
            


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getAnoFundação() {
        return anoFundação;
    }

    public void setAnoFundação(String anoFundação) {
        this.anoFundação = anoFundação;
    }

    public String getModalidade() {
        return modalidade;
    }

    public void setModalidade(String modalidade) {
        this.modalidade = modalidade;
    }

}
