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

/**
 *
 * @author vitor
 */
public class EnderecoController extends Adapter<EnderecoModel, Integer> {

    @Override
    public void create(EnderecoModel objeto) throws KeyViolationException, InvalidKeyException, SQLException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
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
    public void update(EnderecoModel objeto) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void delete(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
