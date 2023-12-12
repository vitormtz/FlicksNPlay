/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.FilmeModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import Support.NotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class FilmeController extends Adapter<FilmeModel, Integer> {

    @Override
    public void create(FilmeModel filme) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "INSERT INTO filmes VALUES ("
                    + "(SELECT COALESCE(MAX(id_filme), 0) + 1 FROM filmes), "
                    + "" + filme.getGenero2() + ", "
                    + "'" + filme.getNome() + "', "
                    + "'" + filme.getDescricao() + "', "
                    + "" + filme.getClassificacao_indicativa() + ", "
                    + "" + filme.isDisponivel() + ", "
                    + "" + filme.getVl_locacao() + ", "
                    + "'" + filme.getTipo() + "')";

            dbcm.runPreparedSQL(sql);

            JOptionPane.showMessageDialog(null, "Filme inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Filme não inserido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public FilmeModel read(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<FilmeModel> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(FilmeModel filme) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "UPDATE filmes SET id_genero = ?, nome = ?, descricao = ?, classificacao_indicativa = ?, disponivel = ?, vl_locacao = ? WHERE id_filme = ?;";

            dbcm.runPreparedSQL(sql,
                    filme.getGenero2(),
                    filme.getNome(),
                    filme.getDescricao(),
                    filme.getClassificacao_indicativa(),
                    filme.isDisponivel(),
                    filme.getVl_locacao(),
                    filme.getId());

            JOptionPane.showMessageDialog(null, "Filme atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Filme, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM filmes WHERE id_filme = ?;";

            dbcm.runPreparedSQL(sql, primaryKey);

            JOptionPane.showMessageDialog(null, "Filme excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Filme, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<FilmeModel> readFilmeJogo(boolean isdisponivel) {
        ArrayList<FilmeModel> filmes = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            String sql;

            if (isdisponivel) {
                sql = "SELECT id_filme, generos.nome AS genero, filmes.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, filmes.tipo "
                        + "FROM filmes INNER JOIN generos ON filmes.id_genero = generos.id_genero "
                        + "UNION ALL "
                        + "SELECT id_jogo, generos.nome AS genero, jogos.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, jogos.tipo "
                        + "FROM jogos INNER JOIN generos ON jogos.id_genero = generos.id_genero;";
            } else {
                sql = "SELECT id_filme, generos.nome AS genero, filmes.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, filmes.tipo "
                        + "FROM filmes INNER JOIN generos ON filmes.id_genero = generos.id_genero "
                        + "WHERE disponivel = true "
                        + "UNION ALL "
                        + "SELECT id_jogo, generos.nome AS genero, jogos.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, jogos.tipo "
                        + "FROM jogos INNER JOIN generos ON jogos.id_genero = generos.id_genero "
                        + "WHERE disponivel = true;";
            }

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();

                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_filme");
                    String genero = rs.getString("genero");
                    String nome = rs.getString("nome");
                    String descricao = rs.getString("descricao");
                    int classificacao_indicativa = rs.getInt("classificacao_indicativa");
                    boolean disponivel = rs.getBoolean("disponivel");
                    double vl_locacao = rs.getDouble("vl_locacao");
                    char tipo = (char) rs.getString("tipo").charAt(0);

                    FilmeModel filme = new FilmeModel(id, genero, nome, descricao, classificacao_indicativa, disponivel, vl_locacao, tipo);
                    filmes.add(filme);

                    rs.next();
                }
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return filmes;
    }

    public ArrayList<FilmeModel> readFilmeJogoNome(String busca) {
        ArrayList<FilmeModel> filmes = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_filme, generos.nome AS genero, filmes.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, filmes.tipo "
                    + "FROM filmes INNER JOIN generos ON filmes.id_genero = generos.id_genero "
                    + "WHERE disponivel = true AND LOWER(filmes.nome) LIKE '%" + busca + "%' "
                    + "UNION ALL "
                    + "SELECT id_jogo, generos.nome AS genero, jogos.nome, descricao, classificacao_indicativa, disponivel, vl_locacao, jogos.tipo "
                    + "FROM jogos INNER JOIN generos ON jogos.id_genero = generos.id_genero "
                    + "WHERE disponivel = true AND LOWER(jogos.nome) LIKE '%" + busca + "%';";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();

                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_filme");
                    String genero = rs.getString("genero");
                    String nome = rs.getString("nome");
                    String descricao = rs.getString("descricao");
                    int classificacao_indicativa = rs.getInt("classificacao_indicativa");
                    boolean disponivel = rs.getBoolean("disponivel");
                    double vl_locacao = rs.getDouble("vl_locacao");
                    char tipo = (char) rs.getString("tipo").charAt(0);

                    FilmeModel filme = new FilmeModel(id, genero, nome, descricao, classificacao_indicativa, disponivel, vl_locacao, tipo);
                    filmes.add(filme);

                    rs.next();
                }
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return filmes;
    }

    public ArrayList<FilmeModel> readLocacoes(String idUsuario) {
        ArrayList<FilmeModel> filmes = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT f.id_filme, g.nome AS genero, f.nome, f.descricao, f.classificacao_indicativa, f.disponivel, f.vl_locacao, f.tipo, l.dt_inicio\n"
                    + "FROM filmes f INNER JOIN generos g ON f.id_genero = g.id_genero LEFT JOIN locacoes l ON f.id_filme = l.id_filme\n"
                    + "WHERE f.id_filme IN (SELECT DISTINCT id_filme FROM locacoes WHERE dt_fim IS NULL AND id_usuario = " + idUsuario + ") AND l.id_usuario = " + idUsuario + "\n"
                    + "UNION ALL\n"
                    + "SELECT j.id_jogo, g.nome AS genero, j.nome, j.descricao, j.classificacao_indicativa, j.disponivel, j.vl_locacao, j.tipo, l.dt_inicio\n"
                    + "FROM jogos j INNER JOIN generos g ON j.id_genero = g.id_genero LEFT JOIN locacoes l ON j.id_jogo = l.id_jogo\n"
                    + "WHERE j.id_jogo IN (SELECT DISTINCT id_jogo FROM locacoes WHERE dt_fim IS NULL AND id_usuario = " + idUsuario + ") AND l.id_usuario = " + idUsuario + ";";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();

                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_filme");
                    String genero = rs.getString("genero");
                    String nome = rs.getString("nome");
                    String descricao = rs.getString("descricao");
                    int classificacao_indicativa = rs.getInt("classificacao_indicativa");
                    boolean disponivel = rs.getBoolean("disponivel");
                    double vl_locacao = rs.getDouble("vl_locacao");
                    char tipo = (char) rs.getString("tipo").charAt(0);
                    String data = rs.getString("dt_inicio");

                    FilmeModel filme = new FilmeModel(id, genero, nome, descricao, classificacao_indicativa, disponivel, vl_locacao, tipo, data);
                    filmes.add(filme);

                    rs.next();
                }
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return filmes;
    }
}
