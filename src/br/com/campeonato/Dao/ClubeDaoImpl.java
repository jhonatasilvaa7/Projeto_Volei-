/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.campeonato.Dao;

import br.com.campeonato.entidades.Clube;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *
 * @author andrey.sa3
 */
public class ClubeDaoImpl {

    private Connection conexao;
    private PreparedStatement preparaSql;
    private ResultSet resultado;
    
        public void excluir(int id){
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement("DELETE FROM "
                    + "clube WHERE idclube = ?");
            preparaSql.setInt(1, id);
            preparaSql.executeUpdate();           
            
        } catch (Exception e) {
            System.out.println("erro ao excluir clube " 
                                             + e.getMessage());
        }
        }

    public void alterar(Clube clube) {
        String sql = "UPDATE clube SET nome = ?,anoFundacao = ?,modalidade = ? WHERE idclube = ?";
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, clube.getNome());
            preparaSql.setString(2, clube.getAnoFundação());
            preparaSql.setString(3, clube.getModalidade());
            preparaSql.setInt(4, clube.getIdclub());
            preparaSql.executeUpdate();

        } catch (Exception ex) {
            System.out.println("Erro ao alterar clube "
                    + ex.getMessage());
        }
    }

    public Clube pesquisarPorID(int id) {
        String consulta = "SELECT * FROM clube WHERE idclube = ?";
        Clube clube = null;
        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(consulta);
            preparaSql.setInt(1, id);
            resultado = preparaSql.executeQuery();
            if (resultado.next()) {
                clube = new Clube();
                clube.setIdclub(id);
                clube.setNome(resultado.getString("nome"));
                clube.setModalidade(resultado.getString("modalidade"));
                clube.setAnoFundação(resultado.getString("anoFundacao"));
            }

        } catch (Exception e) {
            System.out.println("Erro ao pesquisar clube por id "
                    + e.getMessage());
        }
        return clube;
    }

    public void salvar(Clube clube) {
        String sql = "INSERT INTO clube(nome,anoFundacao,modalidade) values(?,?,?)";

        try {
            conexao = FabricaConexao1.abrirConexao();
            preparaSql = conexao.prepareStatement(sql);
            preparaSql.setString(1, clube.getNome());
            preparaSql.setString(2, clube.getAnoFundação());
            preparaSql.setString(3, clube.getModalidade());
            preparaSql.executeUpdate();

        } catch (Exception e) {
            System.out.println("erro ao salvar clube" + e.getMessage());
        }
    }

}
