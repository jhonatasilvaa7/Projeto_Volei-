/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;

import br.com.campeonato.entidades.Clube;
import br.com.campeonato.entidades.Jogador;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrey.sa3
 */
public class JogadorDaoImplTest {
     private Jogador jogador;
    private JogadorDaoImpl jogadorDao;

    public JogadorDaoImplTest() {
      jogadorDao = new JogadorDaoImpl();
    }


    @Test
    public void testSalvar() {
       jogador = new Jogador ("nome","22", "Libero", 25);
        jogadorDao.salvar(jogador);

    }
    public void testPesquisarPorID() {
        System.out.println("pesquisarPorID");
        int id = 3;
        jogador =  jogadorDao.pesquisarPorID(id);
        mostrarResultado(jogador);
       
    } 
     private void mostrarResultado(Jogador jogador) {
        System.out.println("nome: " + jogador.getNome());
        System.out.println("camisa: " + jogador.getCamisa());
        System.out.println("posicao: " + jogador.getPosicao());
        System.out.println("idade: " + jogador.getIdade());
    } 
     public void testAlterar() {
        System.out.println("alterar");
        Jogador jogador1 = new Jogador ("nome", "22", "Libero", 25);
        jogadorDao.alterar(jogador1);
         int id = 1;
        jogador =  jogadorDao.pesquisarPorID(id);
        mostrarResultado(jogador);
    } 
     public void testExcluir() {
        System.out.println("excluir");
        int id = 3;
        jogadorDao.excluir(id);
        
        
    }

}
