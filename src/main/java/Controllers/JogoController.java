/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.JogoModel;
import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Adapter;
import br.univates.raiz.persistence.NotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class JogoController extends Adapter<JogoModel, Integer> {

    @Override
    public void create(JogoModel jogo) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            System.out.println("Genero: " + jogo.getGenero2());
            System.out.println("Nome: " + jogo.getNome());
            System.out.println("Descrição: " + jogo.getDescricao());
            System.out.println("Classificação " + jogo.getClassificacao_indicativa());
            System.out.println("Disponivel " + jogo.isDisponivel());
            System.out.println("Valor Locação " + jogo.getVl_locacao());
            System.out.println("Tipo " + jogo.getTipo());

            String sql = "INSERT INTO jogos VALUES ("
                    + "(SELECT COALESCE(MAX(id_jogo), 0) + 1 FROM jogos), "
                    + "" + jogo.getGenero2() + ", "
                    + "'" + jogo.getNome() + "', "
                    + "'" + jogo.getDescricao() + "', "
                    + "" + jogo.isDisponivel() + ", "
                    + "" + jogo.getVl_locacao() + ", "
                    + "" + jogo.getClassificacao_indicativa() + ", "
                    + "'" + jogo.getTipo() + "')";

            dbcm.runPreparedSQL(sql);

            JOptionPane.showMessageDialog(null, "Jogo inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Jogo não inserido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM jogos WHERE id_jogo = ?;";

            dbcm.runPreparedSQL(sql, primaryKey);

            JOptionPane.showMessageDialog(null, "Jogo excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o genero, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public JogoModel read(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<JogoModel> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(JogoModel jogo) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "UPDATE jogos SET id_genero = ?, nome = ?, descricao = ?, classificacao_indicativa = ?, disponivel = ?, vl_locacao = ? WHERE id_jogo = ?;";

            dbcm.runPreparedSQL(sql,
                    jogo.getGenero2(),
                    jogo.getNome(),
                    jogo.getDescricao(),
                    jogo.getClassificacao_indicativa(),
                    jogo.isDisponivel(),
                    jogo.getVl_locacao(),
                    jogo.getId());

            JOptionPane.showMessageDialog(null, "Jogo atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Jilme, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
