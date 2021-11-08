package br.com.campeonato.Dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class FabricaConexao1 {

    public static Connection abrirConexao() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        return DriverManager.getConnection("jdbc:mysql://localhost:3306/dbcampeonato_volei?useTimezone=true&serverTimezone=America/Sao_Paulo&zeroDateTimeBehavior=convertToNull", 
                                                            "root", "admin");
    }
    
}