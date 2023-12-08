/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.EnderecoModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import Support.InvalidKeyException;
import Support.KeyViolationException;
import Support.NotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author vitor
 */
public class EnderecoController extends Adapter<EnderecoModel, Integer> {

    public int createReturnId(EnderecoModel endereco) throws KeyViolationException, InvalidKeyException, SQLException {
        DataBaseConnectionManager dbcm;
        int resultadoQuery = 0;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "INSERT INTO enderecos VALUES ("
                    + "(SELECT COALESCE(MAX(id_endereco), 0) + 1 FROM enderecos), "
                    + "'" + endereco.getRua() + "', "
                    + "" + endereco.getNumero() + ", "
                    + "'" + endereco.getBairro() + "', "
                    + "'" + endereco.getCep() + "', "
                    + "'" + endereco.getCidade() + "', "
                    + "'" + endereco.getEstado() + "') "
                    + "RETURNING id_endereco";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                resultadoQuery = Integer.parseInt(rs.getString(1));
            }

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Endereço não inserido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
        return resultadoQuery;
    }

    @Override
    public void update(EnderecoModel endereco) throws NotFoundException {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            String sql = "UPDATE enderecos SET rua = ?, numero = ?, bairro = ?, cep = ?, cidade = ?, estado = ? WHERE id_endereco IN (SELECT id_endereco FROM usuarios WHERE id_usuario = ?);";
            dbcm.runPreparedSQL(sql,
                    endereco.getRua(),
                    endereco.getNumero(),
                    endereco.getBairro(),
                    endereco.getCep(),
                    endereco.getCidade(),
                    endereco.getEstado(),
                    endereco.getId());

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Endereço, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void delete(Integer idEndereco) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM enderecos WHERE id_endereco = ?;";

            dbcm.runPreparedSQL(sql, idEndereco);

        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Endereço, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public EnderecoModel read(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public ArrayList<EnderecoModel> readAll() {
        ArrayList<EnderecoModel> enderecos = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT * FROM enderecos ORDER BY id_endereco;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_endereco");
                    String rua = rs.getString("rua");
                    int numero = rs.getInt("numero");
                    String bairro = rs.getString("bairro");
                    String cep = rs.getString("cep");
                    String cidade = rs.getString("cidade");
                    String estado = rs.getString("estado");

                    EnderecoModel usuario = new EnderecoModel(id, rua, numero, bairro, Integer.parseInt(cep), cidade, estado);
                    enderecos.add(usuario);
                    rs.next();
                }
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return enderecos;
    }

    @Override
    public void create(EnderecoModel endereco) throws KeyViolationException, InvalidKeyException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
