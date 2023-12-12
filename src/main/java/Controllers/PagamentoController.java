/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.PagamentoModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import Support.NotFoundException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class PagamentoController extends Adapter<PagamentoModel, Integer> {

    @Override
    public void create(PagamentoModel pagamento) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "INSERT INTO pagamentos VALUES ("
                    + "(SELECT COALESCE(MAX(id_pagamento), 0) + 1 FROM pagamentos), "
                    + "" + pagamento.getId_tipo_pagamento() + ", "
                    + "'" + pagamento.getDt_pagamento() + "')";

            dbcm.runPreparedSQL(sql);

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Pagamento não concluido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public ArrayList<PagamentoModel> readAll() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public PagamentoModel read(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void update(PagamentoModel objeto) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
