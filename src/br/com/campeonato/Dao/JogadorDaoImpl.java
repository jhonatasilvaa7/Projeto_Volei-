/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;


import br.com.campeonato.entidades.Jogador;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author jhonata.silva1
 */
public class JogadorDaoImpl { 
    
    private Connection conexao;
    private PreparedStatement preparaSql; 
    private ResultSet resultado; 
    
    public void excluir (int id){
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement("DELETE FROM "
                    + "jogador WHERE idjogador = ?");
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();           
            
        } catch (Exception e) {
            System.out.println("erro ao excluir jogador " 
                                             + e.getMessage());
        }
        }
    
     public void alterar(Jogador jogador) {
        String sql = "UPDATE jogador SET nome = ?, camisa = ?,posicao = ?, idade = ? WHERE idjogador = ?";
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, jogador.getNome());
            preparaSql.setString(2, jogador.getCamisa());
            preparaSql.setString(3, jogador.getPosicao());
            preparaSql.setInt(4, jogador.getIdade());
            preparaSql.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Erro ao alterar jogador "
                    + ex.getMessage());
        }
    } 
      public Jogador pesquisarPorID(int id) {
        String consulta = "SELECT * FROM jogador WHERE idjogador= ?";
        Jogador jogador = null;
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setInt(1, id);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
               jogador = new Jogador();
                jogador.setIdjogador(id);
                jogador.setNome(resultado.getString("nome"));
                jogador.setCamisa(resultado.getString("camisa"));
                jogador.setPosicao(resultado.getString("posicao"));
                jogador.setIdade(resultado.getInt("idade"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar jogador por id "
                    + e.getMessage());
        }
        return jogador;
    }
    public void salvar (Jogador jogador){
        String sql = "INSERT INTO jogador (nome, camisa, posicao, idade)"
                + "VALUES (?,?,?,?)"; 
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, jogador.getNome());
            preparaSql.setString(2, jogador.getCamisa());
            preparaSql.setString(3, jogador.getPosicao());
            preparaSql.setInt(4, jogador.getIdade());
            preparaSql.executeUpdate();
        } catch (Exception e) { 
            System.out.println("Erro ao salvar o Jogador" +e.getMessage());
        }
}
}