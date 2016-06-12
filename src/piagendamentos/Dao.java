package piagendamentos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class Dao {

    private static final String DIRETORIO = System.getProperty("user.dir");
    private static final String DRIVER = "org.sqlite.JDBC";
    private static final String URL = "jdbc:sqlite:" + DIRETORIO + "\\lib\\ProjetoPi.db";
    
    protected static Connection con;
    protected static ResultSet rs;
    protected static PreparedStatement stmt;
    
    
    public static void abrirConexao() {
        try {
            Class.forName(DRIVER);
            con = DriverManager.getConnection(URL);
            System.out.println("Conexão efetuada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao abrir conexão com banco \nErro: " + e.getMessage());
        }
    }

    public static void fecharConexao() {
        try {
            con.close();
            System.out.println("Conexão finalizada com sucesso");
        } catch (Exception e) {
            System.out.println("Erro ao fechar conexão com o banco \nErro: " + e.getMessage());
        }
    }
}
