/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package TablesModel;

import Models.EnderecoModel;
import Models.UsuarioModel;
import java.util.ArrayList;
import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;

/**
 *
 * @author vitor
 */
public class UsuariosTableModel implements TableModel {

    private ArrayList<UsuarioModel> vetorUsuario;
    private ArrayList<EnderecoModel> vetorEndereco;

    public UsuariosTableModel(ArrayList<UsuarioModel> vetor) {
        this.vetorUsuario = vetor;
    }

    public UsuariosTableModel(ArrayList<UsuarioModel> vetorUsuario, ArrayList<EnderecoModel> vetorEndereco) {
        this.vetorUsuario = vetorUsuario;
        this.vetorEndereco = vetorEndereco;
    }

    @Override
    public int getRowCount() {
        return vetorUsuario.size();
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
        UsuarioModel usuario = vetorUsuario.get(rowIndex);
        EnderecoModel endereco = vetorEndereco.get(rowIndex);

        String[] aux = {
            usuario.getId() + "",
            usuario.getNome() + "",
            usuario.getEmail() + "",
            usuario.getCpf() + "",
            usuario.getDtNasc() + "",
            usuario.getCargo() + "",
            endereco.getRua() + "",
            endereco.getNumero() + "",
            endereco.getBairro() + "",
            endereco.getCep() + "",
            endereco.getCidade() + "",
            endereco.getEstado() + "",
            
            endereco.getId() + ""};

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
