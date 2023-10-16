package Controllers;

import Models.UsuarioModel;
import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Adapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UsuarioController extends Adapter<UsuarioModel,Integer> {
    @Override
    public void create( UsuarioModel usuario )
    {
    }
    
    @Override
    public UsuarioModel read( Integer id_usuario ) {
        UsuarioModel usuario = null;
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "SELECT id_usuario, nome FROM usuarios WHERE id_usuario = ?";
            
            ResultSet rs = dbcm.runPreparedQuerySQL(sql, id_usuario );
            
            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                // não precisa while por que eu sei que só tem um resultado
                int id = rs.getInt("id_usuario");
                int cidade = rs.getInt("id_cidade");
                String nome = rs.getString("nome");
                String endereco = rs.getString("endereco");
                String email = rs.getString("email");
                String cpf = rs.getString("cpf");
                String dtNasc = rs.getString("dt_nasc");
                String senha = rs.getString("senha");
                
                usuario = new UsuarioModel(id,cidade,nome,endereco,email,cpf,dtNasc,senha);
            }
        } 
        catch (DataBaseException | SQLException ex)
        {
            System.out.println("Algo de errado aconteceu");
        }
        
        return usuario;
    }
    
    @Override
    public ArrayList<UsuarioModel> readAll() {
        ArrayList<UsuarioModel> usuarios = new ArrayList();
        
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "SELECT * FROM usuarios;";
            
            ResultSet rs = dbcm.runQuerySQL( sql );
            
            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast())
                {
                    int id = rs.getInt("id_usuario");
                    int cidade = rs.getInt("id_cidade");
                    String nome = rs.getString("nome");
                    String endereco = rs.getString("endereco");
                    String email = rs.getString("email");
                    String cpf = rs.getString("cpf");
                    String dtNasc = rs.getString("dt_nasc");
                    String senha = rs.getString("senha");

                    UsuarioModel usuario = new UsuarioModel(id,cidade,nome,endereco,email,cpf,dtNasc,senha);
                    usuarios.add(usuario);
                    
                    rs.next();
                }
            }

        } 
        catch (DataBaseException | SQLException ex)
        {
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
