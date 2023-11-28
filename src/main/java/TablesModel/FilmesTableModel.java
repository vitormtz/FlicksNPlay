/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablesModel;

import Models.FilmeModel;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author vitor
 */
public class FilmesTableModel implements TableModel {

    private ArrayList<FilmeModel> vetor;

    public FilmesTableModel(ArrayList<FilmeModel> vetor) {
        this.vetor = vetor;
    }

    @Override
    public int getRowCount() {
        return vetor.size();
    }

    @Override
    public int getColumnCount() {
        return 8;
    }

    @Override
    public String getColumnName(int columnIndex) {
        String[] colName = {"Id", "Nome", "Tipo", "Gênero", "Descrição", "Classificação Indicativa", "Disponivel", "Valor da Locação"};
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
        FilmeModel filme = vetor.get(rowIndex);

        String[] aux = {
            filme.getId() + "",
            filme.getNome() + "",
            filme.getTipoCompleto() + "",
            filme.getGenero1() + "",
            filme.getDescricao() + "",
            filme.getClassificacao_indicativa() + "",
            filme.getDisponivel() + "",
            filme.getVl_locacao() + ""};

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
