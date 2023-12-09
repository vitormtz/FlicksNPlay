/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablesModel;

import Models.UsuarioModel;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author vitor
 */
public class ClienteTableModel implements TableModel {

    private ArrayList<UsuarioModel> vetor;

    public ClienteTableModel(ArrayList<UsuarioModel> vetor) {
        this.vetor = vetor;
    }

    @Override
    public int getRowCount() {
        return vetor.size();
    }

    @Override
    public int getColumnCount() {
        return 5;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] colName = {"ID", "Nome", "E-mail", "CPF", "Data de Nascimento"};
        return colName[columnIndex];
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        return String.class;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return false;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        UsuarioModel cliente = vetor.get(rowIndex);

        String[] aux = {
            cliente.getId() + "",
            cliente.getNome() + "",
            cliente.getEmail() + "",
            cliente.getCpf() + "",
            cliente.getDtNasc()
        };

        return aux[columnIndex];
    }

    @Override
    public void setValueAt(Object aValue, int rowIndex, int columnIndex) {

    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
}
