/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablesModel;

import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author vitor
 */
public class UsuariosTableModel implements TableModel {

    private ArrayList<ArrayList<String>> vetor;

    public UsuariosTableModel(ArrayList<ArrayList<String>> vetor) {
        this.vetor = vetor;
    }

    @Override
    public int getRowCount() {
        return vetor.size();
    }

    @Override
    public int getColumnCount() {
        return 12;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] colName = {"ID", "Nome", "E-mail", "CPF", "Data de Nascimento", "Cargo", "Rua", "Número", "Bairro", "CEP", "Cidade", "Estado"};
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
        ArrayList<String> usuario = vetor.get(rowIndex);

        String[] aux = usuario.toArray(new String[0]);

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
