package Controllers;

import Models.UsuarioModel;
import Support.Adapter;
import Support.DataBaseConnectionManager;
import Support.DataBaseException;
import Support.NotFoundException;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuarioController extends Adapter<UsuarioModel, Integer> {

    @Override
    public void create(UsuarioModel usuario) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            String sql;

            if (usuario.getCargo() == null) {
                sql = "INSERT INTO usuarios VALUES ("
                        + "(SELECT COALESCE(MAX(id_usuario), 0) + 1 FROM usuarios), "
                        + "" + usuario.getEndereco() + ", "
                        + "'" + usuario.getNome() + "', "
                        + "'" + usuario.getEmail() + "', "
                        + "'" + usuario.getCpf() + "', "
                        + "'" + usuario.getDtNasc() + "')";
            } else {
                sql = "INSERT INTO usuarios VALUES ("
                        + "(SELECT COALESCE(MAX(id_usuario), 0) + 1 FROM usuarios), "
                        + "" + usuario.getEndereco() + ", "
                        + "'" + usuario.getNome() + "', "
                        + "'" + usuario.getEmail() + "', "
                        + "'" + usuario.getCpf() + "', "
                        + "'" + usuario.getDtNasc() + "', "
                        + "'" + usuario.getSenha() + "', "
                        + "" + usuario.isNvAcess() + ", "
                        + "'" + usuario.getCargo() + "')";
            }

            dbcm.runPreparedSQL(sql);

            JOptionPane.showMessageDialog(null, "Usuário inserido com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Usuário não inserido, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    @Override
    public void update(UsuarioModel usuario) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            String sql;

            if (usuario.getCargo() == null) {
                sql = "UPDATE usuarios SET nome = ?, email = ?, cpf = ?, dt_nasc = ? WHERE id_usuario = ?;";
                dbcm.runPreparedSQL(sql,
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getCpf(),
                        usuario.getDtNasc(),
                        usuario.getId());
            } else {
                sql = "UPDATE usuarios SET nome = ?, email = ?, cpf = ?, dt_nasc = ?, senha = ?, nivel_acesso = ?, cargo = ? WHERE id_usuario = ?;";
                dbcm.runPreparedSQL(sql,
                        usuario.getNome(),
                        usuario.getEmail(),
                        usuario.getCpf(),
                        usuario.getDtNasc(),
                        usuario.getSenha(),
                        usuario.isNvAcess(),
                        usuario.getCargo(),
                        usuario.getId());
            }
            JOptionPane.showMessageDialog(null, "Usuário atualizado com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Usuário, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        }
    }

    public int deleteReturnId(Integer idUsuario) {
        DataBaseConnectionManager dbcm;
        int resultadoQuery = 0;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "DELETE FROM usuarios WHERE id_usuario = " + idUsuario + " RETURNING id_endereco;";

            ResultSet rs = dbcm.runQuerySQL(sql);

            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                resultadoQuery = Integer.parseInt(rs.getString(1));
            }
            JOptionPane.showMessageDialog(null, "Usuário excluído com sucesso", "Sucesso", JOptionPane.INFORMATION_MESSAGE);
        } catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o Usuário, tente de novo", "Erro", JOptionPane.ERROR_MESSAGE);
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioController.class.getName()).log(Level.SEVERE, null, ex);
        }
        return resultadoQuery;
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

    public ArrayList readName(String nome) {
        ArrayList<ArrayList<String>> usuarios = new ArrayList<>();

        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();

            String sql = "SELECT id_usuario, nome, email, cpf, dt_nasc, cargo, rua, numero, bairro, cep, cidade, estado\n"
                    + "FROM usuarios u INNER JOIN enderecos e ON u.id_endereco=e.id_endereco\n"
                    + "WHERE LOWER(nome) LIKE '%" + nome + "%';";

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
    public void delete(Integer primaryKey) throws NotFoundException {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
