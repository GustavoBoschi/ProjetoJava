package DAO;

import DTO.UsuarioDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.ResultSet;

public class UsuarioDAO {

    private Connection conn;

    public ResultSet autenticarUsuario(UsuarioDTO usuarioDTO) {

        conn = new ConexaoDAO().conectarBD();
        String sql = "Select * from usuario where nome_usuario = ? and "
                + "senha_usuario = ?";

        try {
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuarioDTO.getNome());
            pstm.setString(2, usuarioDTO.getSenha());
            ResultSet rs = pstm.executeQuery();
            return rs;

        } catch (SQLException erro) {
            JOptionPane.showMessageDialog(null, "Erro UsuarioDAO: " + erro);

        }

        return null;

    }
}
