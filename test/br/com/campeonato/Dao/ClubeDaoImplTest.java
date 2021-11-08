/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;

import br.com.campeonato.entidades.Clube;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andrey.sa3
 */
public class ClubeDaoImplTest {

    private Clube clube;
    private ClubeDaoImpl clubImpl;

    public ClubeDaoImplTest() {
        clubImpl = new ClubeDaoImpl();
    }

   // @Test
    public void testSalvar() {
       clube = new Clube("nome", "1900-12-01", "praia");
        clubImpl.salvar(clube);

    }

   // @Test
    public void testPesquisarPorID() {
        System.out.println("pesquisarPorID");
        int id = 3;
        clube =  clubImpl.pesquisarPorID(id);
        mostrarResultado(clube);
       
    }

    private void mostrarResultado(Clube clube) {
        System.out.println("nome: " + clube.getNome());
        System.out.println("ano: " + clube.getAnoFundação());
        System.out.println("modadidade: " +clube.getModalidade());
    }

   // @Test
    public void testAlterar() {
        System.out.println("alterar");
        Clube clube1 = new Clube("nome", "1900-12-01", "praia",1);
        clubImpl.alterar(clube1);
         int id = 1;
        clube =  clubImpl.pesquisarPorID(id);
        mostrarResultado(clube);
    }

    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 3;
        clubImpl.excluir(id);
        
    }

}
