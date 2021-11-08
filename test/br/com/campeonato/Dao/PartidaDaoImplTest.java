/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;

import br.com.campeonato.entidades.Partida;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author jhonata.silva1
 */
public class PartidaDaoImplTest { 
    
    private Partida partida; 
    private PartidaDaoImpl partidaImpl; 
    
    
    public PartidaDaoImplTest() { 
     partidaImpl = new PartidaDaoImpl();
    }

    @Test
    public void testExcluir() {
        System.out.println("excluir");
        int id = 3;
        partidaImpl.excluir(id);
    }

    @Test
    public void testAlterar() {
        System.out.println("alterar");
        Partida partida1 = new Partida("data", "vencedor", "local");
        partidaImpl.alterar(partida1);
         int id = 1;
        partida =  partidaImpl.pesquisarPorID(id);
        mostrarResultado(partida);
    } 
     private void mostrarResultado(Partida partida) {
        System.out.println("data: " + partida.getData());
        System.out.println("vencedor: " + partida.getVencedor());
        System.out.println("local: " +partida.getLocal());
    }

    @Test
    public void testPesquisarPorID() {
        System.out.println("pesquisarPorID");
        int id = 3;
        partida =  partidaImpl.pesquisarPorID(id);
        mostrarResultado(partida);
    }

    @Test
    public void testSalvar() {
        partida = new Partida("data", "vencedor", "local");
        partidaImpl.salvar(partida);
    }
    
}
