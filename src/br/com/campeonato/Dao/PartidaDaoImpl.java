/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;

import br.com.campeonato.entidades.Partida;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jhonata.silva1
 */
public class PartidaDaoImpl {
    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;
    
    public void excluir(int id){
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement("DELETE FROM "
                    + "partida WHERE idpartida = ?");
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();           
            
        } catch (Exception e) {
            System.out.println("erro ao excluir partida " 
                                             + e.getMessage());
        }
        } 
    public void alterar(Partida partida) {
        String sql = "UPDATE partida SET data = ?,vencedor = ?,local = ? WHERE idpartida = ?";
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, partida.getData());
            preparaSql.setString(2, partida.getVencedor());
            preparaSql.setString(3, partida.getLocal());
            preparaSql.setInt(4, partida.getIdpartida());
            preparaSql.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Erro ao alterar partida "
                    + ex.getMessage());
        }
}
      public Partida pesquisarPorID(int id) {
        String consulta = "SELECT * FROM partida WHERE idpartida = ?";
        Partida partida = null;
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setInt(1, id);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                partida = new Partida();
                partida.setIdpartida(id);
                partida.setData(resultado.getString("data"));
                partida.setVencedor(resultado.getString("vencedor"));
                partida.setLocal(resultado.getString("local"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar partida por id "
                    + e.getMessage());
        }
        return partida;
    } 
        public void salvar(Partida partida) {
        String sql = "INSERT INTO partida(data, vencedor, local) values(?,?,?)";

        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, partida.getData());
            preparaSql.setString(2, partida.getVencedor());
            preparaSql.setString(3, partida.getLocal());
            preparaSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("erro ao salvar partida" + e.getMessage());
        }
    }

}