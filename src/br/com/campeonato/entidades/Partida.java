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
public class Partida {
    public String data;
    public String vencedor;
    public String local;

    
    public Partida(){
        
    } 
    private int idpartida; 

    public int getIdpartida() {
        return idpartida;
    }

    public void setIdpartida(int idpartida) {
        this.idpartida = idpartida;
    }
    
    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getVencedor() {
        return vencedor;
    }

    public void setVencedor(String vencedor) {
        this.vencedor = vencedor;
    }

    public String getLocal() {
        return local;
    }

    public void setLocal(String local) {
        this.local = local;
    } 
    public Partida (String data, String vencedor, String local) {
        this.data = data;
        this.vencedor = vencedor;
        this.local = local;
        this.idpartida = idpartida; 
    }
}
