/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.LocacaoModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import Support.NotFoundException;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class LocacaoController extends Adapter<LocacaoModel, Integer> {

    @Override
    public void create(LocacaoModel locacao) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            String sql;

            if (locacao.getIdFilme() == 0) {
                sql = "INSERT INTO locacoes VALUES ("
                        + "(SELECT COALESCE(MAX(id_locacao), 0) + 1 FROM locacoes), "
                        + "" + locacao.getIdUsuario() + ", "
                        + "null, "
                        + "" + locacao.getIdJogo() + ", "
                        + "" + locacao.getVl_locacao() + ", "
                        + "'" + LocalDate.now() + "', "
                        + "" + locacao.getDt_fim() + ")";
            } else {
                sql = "INSERT INTO locacoes VALUES ("
                        + "(SELECT COALESCE(MAX(id_locacao), 0) + 1 FROM locacoes), "
                        + "" + locacao.getIdUsuario() + ", "
                        + "" + locacao.getIdFilme() + ", "
                        + "null, "
                        + "" + locacao.getVl_locacao() + ", "
                        + "'" + LocalDate.now() + "', "
                        + "" + locacao.getDt_fim() + ")";
            }
            dbcm.runPreparedSQL(sql);

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Locação não inserida, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(LocacaoModel locacao) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "UPDATE locacoes SET dt_fim = ? WHERE id_usuario = ? AND (id_filme = ? OR id_jogo = ?);";

            dbcm.runPreparedSQL(sql,
                    String.valueOf(LocalDate.now()),
                    locacao.getIdUsuario(),
                    locacao.getIdFilme(),
                    locacao.getIdJogo());

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Filme, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public LocacaoModel read(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<LocacaoModel> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
