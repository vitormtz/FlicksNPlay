package TablesModel;

import Models.GeneroModel;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

public class GenerosTableModel implements TableModel {

    private ArrayList<GeneroModel> vetor;

    public GenerosTableModel(ArrayList<GeneroModel> vetor) {
        this.vetor = vetor;
    }

    @Override
    public int getRowCount() {
        return vetor.size();
    }

    @Override
    public int getColumnCount() {
        return 2;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] colName = {"ID", "Nome"};
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
        GeneroModel genero = vetor.get(rowIndex);

        String[] aux = {genero.getId() + "",
            genero.getNome()};

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
