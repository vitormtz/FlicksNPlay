package Controllers;

import Models.GeneroModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GeneroController extends Adapter<GeneroModel, Integer> {

    @Override
    public void create(GeneroModel genero) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "INSERT INTO generos VALUES ( DEFAULT, ?);";

            genero.setNome(genero.getNome().toLowerCase());
            genero.setNome(genero.getNome().substring(0, 1).toUpperCase() + genero.getNome().substring(1));

            dbcm.runPreparedSQL(sql,
                    genero.getNome());

            JOptionPane.showMessageDialog(null, "Genero inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Genero já existente, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public GeneroModel read(Integer id_genero) {
        GeneroModel genero = null;
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_genero, nome FROM generos WHERE id_genero = ?";

            ResultSet rs = dbcm.runPreparedQuerySQL(sql, id_genero);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                // não precisa while por que eu sei que só tem um resultado
                int id = rs.getInt("id_genero");
                String nome = rs.getString("nome");

                genero = new GeneroModel(id, nome);
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }

        return genero;
    }

    @Override
    public ArrayList<GeneroModel> readAll() {
        ArrayList<GeneroModel> generos = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT * FROM generos;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_genero");
                    String nome = rs.getString("nome");

                    GeneroModel genero = new GeneroModel(id, nome);
                    generos.add(genero);

                    rs.next();
                }
            }

        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }

        return generos;
    }

    @Override
    public void update(GeneroModel genero) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "UPDATE generos SET nome = ? WHERE id_genero = ?;";

            dbcm.runPreparedSQL(sql,
                    genero.getNome(),
                    genero.getId());

            JOptionPane.showMessageDialog(null, "Genero atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Genero, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM generos WHERE id_genero = ?;";

            dbcm.runPreparedSQL(sql, primaryKey);

            JOptionPane.showMessageDialog(null, "Genero excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o genero, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public ArrayList<GeneroModel> readGenerosPopulares() {
        ArrayList<GeneroModel> generos = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT g.id_genero, g.nome, COUNT(l.id_locacao) AS total_locacoes\n"
                    + "FROM generos g LEFT JOIN filmes f ON g.id_genero = f.id_genero\n"
                    + "LEFT JOIN jogos j ON g.id_genero = j.id_genero\n"
                    + "LEFT JOIN locacoes l ON (f.id_filme = l.id_filme OR j.id_jogo = l.id_jogo)\n"
                    + "GROUP BY g.id_genero, g.nome\n"
                    + "ORDER BY total_locacoes DESC;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_genero");
                    String nome = rs.getString("nome");
                    int total_locacoes = rs.getInt("total_locacoes");

                    GeneroModel genero = new GeneroModel(id, nome, total_locacoes);
                    generos.add(genero);

                    rs.next();
                }
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return generos;
    }
}
