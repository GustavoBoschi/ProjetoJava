package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class ConexaoDAO {

    private String url = "jdbc:mysql://localhost:3306/banco";
    private String nome = "root";
    private String senha = "root";
    private Connection conn;

    public Connection conectarBD() {
        try {
            conn = DriverManager.getConnection(url, nome, senha);
            JOptionPane.showMessageDialog(null, "Conectado com sucesso");
        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro ConexãoDAO: " + erro);
        }
        return null;
    }
}
