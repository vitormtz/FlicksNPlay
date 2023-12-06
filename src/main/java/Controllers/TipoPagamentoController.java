package Controllers;

import Models.TipoPagamentoModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class TipoPagamentoController extends Adapter<TipoPagamentoModel, Integer> {

    @Override
    public void create(TipoPagamentoModel tipoPagamento) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "INSERT INTO tipos_pagamentos VALUES ( DEFAULT, ?);";

            dbcm.runPreparedSQL(sql,
                    tipoPagamento.getNome());

            JOptionPane.showMessageDialog(null, "Tipo de Pagamento inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Tipo de Pagamento não inserido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public TipoPagamentoModel read(Integer id_tipoPagamento) {
        TipoPagamentoModel tipoPagamento = null;
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_tipo_pagamento, nome FROM tipos_pagamentos WHERE id_tipo_pagamento = ?";

            ResultSet rs = dbcm.runPreparedQuerySQL(sql, id_tipoPagamento);

            if (rs.isBeforeFirst()) { // acho alguma coisa?
                rs.next();
                // não precisa while por que eu sei que só tem um resultado
                int id = rs.getInt("id_tipo_pagamento");
                String nome = rs.getString("nome");

                tipoPagamento = new TipoPagamentoModel(id, nome);
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }

        return tipoPagamento;
    }

    @Override
    public ArrayList<TipoPagamentoModel> readAll() {
        ArrayList<TipoPagamentoModel> tiposPagamentos = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT * FROM tipos_pagamentos;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_tipo_pagamento");
                    String nome = rs.getString("nome");

                    TipoPagamentoModel tipoPagamento = new TipoPagamentoModel(id, nome);
                    tiposPagamentos.add(tipoPagamento);

                    rs.next();
                }
            }

        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }

        return tiposPagamentos;
    }

    @Override
    public void update(TipoPagamentoModel tipoPagamento) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "UPDATE tipos_pagamentos SET nome = ? WHERE id_tipo_pagamento = ?;";

            dbcm.runPreparedSQL(sql,
                    tipoPagamento.getNome(),
                    tipoPagamento.getId());

            JOptionPane.showMessageDialog(null, "Tipo de Pagamento atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Tipo de Pagamento, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Integer primaryKey) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM tipos_pagamentos WHERE id_tipo_pagamento = ?;";

            dbcm.runPreparedSQL(sql, primaryKey);

            JOptionPane.showMessageDialog(null, "Tipo de Pagamento excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Tipo de Pagamento, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }
}
