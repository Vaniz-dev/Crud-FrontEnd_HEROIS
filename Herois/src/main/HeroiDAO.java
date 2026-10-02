package main;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
public class HeroiDAO {
    
// CREATE: Inserção de registro no banco
public void cadastrar(Heroi heroi) {
    String sql = "INSERT INTO heroi (nome, habilidade, fraqueza, foto) VALUES (?, ?, ?,?)";
    try (Connection conn = Conexao.conectar();
    PreparedStatement stmt = conn.prepareStatement(sql)) {
        stmt.setString(1, heroi.getNome());
        stmt.setString(2, heroi.getHabilidade());
        stmt.setString(3, heroi.getFraqueza());
        stmt.setString(4, heroi.getFoto());
        stmt.executeUpdate();
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao cadastrar herói: " + e.getMessage(), e);
    }
}
// READ: Consulta e recuperação dos registros
public List<Heroi> listar() {
    String sql = "SELECT id, nome, habilidade, fraqueza, foto FROM heroi";
    List<Heroi> lista = new ArrayList<>();
    
    try (Connection conn = Conexao.conectar();
        PreparedStatement stmt = conn.prepareStatement(sql);
        ResultSet rs = stmt.executeQuery()) {
        
        while (rs.next()) {
            Heroi heroi = new Heroi();
            heroi.setId(rs.getInt("id"));
            heroi.setNome(rs.getString("nome"));
            heroi.setHabilidade(rs.getString("habilidade"));
            heroi.setFraqueza(rs.getString("fraqueza"));
            heroi.setFoto(rs.getString("foto"));
            lista.add(heroi);
        }
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao listar heróis: " + e.getMessage(), e);
    }
    return lista;
    }   
    // UPDATE: Atualização dos dados pelo identificador ID
    public void atualizar(Heroi heroi) {
        String sql = "UPDATE heroi SET nome=?, habilidade=?, fraqueza=?, foto=? WHERE id=?";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt =conn.prepareStatement(sql)) {
            stmt.setString(1, heroi.getNome());
            stmt.setString(2, heroi.getHabilidade());
            stmt.setString(3, heroi.getFraqueza());
            stmt.setString(4, heroi.getFoto());
            stmt.setInt(5, heroi.getId());
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar herói: " + e.getMessage(), e);
        }
    }
    //UPDATE PELO NOME
    public void atualizarPorNome(Heroi heroi, String nomeAntigo) {
        String sql = "UPDATE heroi SET nome=?, habilidade=?, fraqueza=?, foto=? WHERE nome=?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, heroi.getNome());
            stmt.setString(2, heroi.getHabilidade());
            stmt.setString(3, heroi.getFraqueza());
            stmt.setString(4, heroi.getFoto());
            stmt.setString(5, nomeAntigo);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new RuntimeException("Nenhum herói encontrado com esse nome.");
            }

        } catch (SQLException e) {
            throw new RuntimeException(
                "Erro ao atualizar herói: " + e.getMessage(), e
            );
        }
    }
// DELETE: Remoção física do registro
    public void excluir(int id) {
        String sql = "DELETE FROM heroi WHERE id=?";
        try (Connection conn = Conexao.conectar(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir herói: " + e.getMessage(), e);
        }
    }
    // DELETE: Remoção pelo nome
    public void excluirPorNome(String nome) {
        String sql = "DELETE FROM heroi WHERE nome = ?";

        try (Connection conn = Conexao.conectar();
             PreparedStatement stmt = conn.prepareStatement(sql)) {

            stmt.setString(1, nome);

            int linhasAfetadas = stmt.executeUpdate();

            if (linhasAfetadas == 0) {
                throw new RuntimeException("Nenhum herói encontrado com esse nome.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao excluir herói: " + e.getMessage(), e);
        }
    }
}