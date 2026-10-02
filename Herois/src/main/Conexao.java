package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    // Protocolo (jdbc) : SGBD (mysql) : //Host:Porta / Schema
    private static final String URL = "jdbc:mysql://localhost:3306/liga_herois";
    private static final String USUARIO = "root";
    private static final String SENHA = "root";

    public static Connection conectar() {
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException e) {
            throw new RuntimeException("Erro na conexão com o MYSQL: " + e.getMessage(), e);
        }
    }
}
