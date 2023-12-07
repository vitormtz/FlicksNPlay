package Controllers;

import Models.UsuarioModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioController extends Adapter<UsuarioModel, Integer> {

    @Override
    public void create(UsuarioModel usuario) {
    }

    @Override
    public UsuarioModel read(Integer id_usuario) {
        UsuarioModel usuario = null;
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_usuario, nome FROM usuarios WHERE id_usuario = ?";

            ResultSet rs = dbcm.runPreparedQuerySQL(sql, id_usuario);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                // não precisa while por que eu sei que só tem um resultado
                int id = rs.getInt("id_usuario");
                int endereco = rs.getInt("id_endereco");
                String nome = rs.getString("nome");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                String dtNasc = rs.getString("dt_nasc");
                String senha = rs.getString("senha");
                boolean nvAcess = rs.getBoolean("nivel_acesso");
                String cargo = rs.getString("cargo");
                usuario = new UsuarioModel(id, endereco, nome, email, cpf, dtNasc, senha, nvAcess, cargo);
            }
        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }

        return usuario;
    }

    @Override
    public ArrayList<UsuarioModel> readAll() {
        ArrayList<UsuarioModel> usuarios = new ArrayList();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT * FROM usuarios;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    int id = rs.getInt("id_usuario");
                    int endereco = rs.getInt("id_endereco");
                    String nome = rs.getString("nome");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cpf");
                    String dtNasc = rs.getString("dt_nasc");
                    String senha = rs.getString("senha");
                    boolean nvAcess = rs.getBoolean("nivel_acesso");
                    String cargo = rs.getString("cargo");
                    UsuarioModel usuario = new UsuarioModel(id, endereco, nome, email, cpf, dtNasc, senha, nvAcess, cargo);
                    usuarios.add(usuario);

                    rs.next();
                }
            }

        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return usuarios;
    }

    public ArrayList readAllWithEndereco() {
        ArrayList<ArrayList<String>> usuarios = new ArrayList<>();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_usuario, nome, email, cpf, dt_nasc, cargo, rua, numero, bairro, cep, cidade, estado\n"
                    + "FROM usuarios u INNER JOIN enderecos e ON u.id_endereco=e.id_endereco;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast()) {
                    ArrayList<String> usuario = new ArrayList<>();

                    usuario.add(rs.getString("id_usuario"));
                    usuario.add(rs.getString("nome"));
                    usuario.add(rs.getString("email"));
                    usuario.add(rs.getString("cpf"));
                    usuario.add(rs.getString("dt_nasc"));
                    usuario.add(rs.getString("cargo"));
                    usuario.add(rs.getString("rua"));
                    usuario.add(rs.getString("numero"));
                    usuario.add(rs.getString("bairro"));
                    usuario.add(rs.getString("cep"));
                    usuario.add(rs.getString("cidade"));
                    usuario.add(rs.getString("estado"));

                    usuarios.add(usuario);

                    rs.next();
                }
            }

        } catch (DataBaseException | SQLException ex) {
            System.out.println("Algo de errado aconteceu");
        }
        return usuarios;
    }

    @Override
    public void update(UsuarioModel usuario) {
    }

    @Override
    public void delete(Integer idUsuario) {
    }
}
