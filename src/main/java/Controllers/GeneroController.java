package Controllers;

import Models.GeneroModel;
import br.univates.raiz.db.DataBaseConnectionManager;
import br.univates.raiz.db.DataBaseException;
import br.univates.raiz.persistence.Adapter;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GeneroController extends Adapter<GeneroModel,Integer>  {
    @Override
    public void create( GeneroModel genero ) {
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = ConectionController.getInstance().getDB();
            
            String tipo = "Jogo".equals(genero.getTipo()) ? "J" : "F";
            
            String sql = "INSERT INTO generos VALUES ( DEFAULT, ?, ?);";
            
            dbcm.runPreparedSQL(sql,
                    genero.getNome(),
                    tipo);
            
            JOptionPane.showMessageDialog(null, "Genero inserido com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (DataBaseException ex)
        {
            JOptionPane.showMessageDialog(null, "Genero não inserido, tente de novo","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public GeneroModel read( Integer id_genero )
    {
        GeneroModel genero = null;
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "SELECT id_genero, nome FROM generos WHERE id_genero = ?";
            
            ResultSet rs = dbcm.runPreparedQuerySQL(sql, id_genero );
            
            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                // não precisa while por que eu sei que só tem um resultado
                int id = rs.getInt("id_genero");
                String nome = rs.getString("nome");
                String tipo = rs.getString("tipo");
                
                genero = new GeneroModel(id,nome,tipo);
            }
        } 
        catch (DataBaseException | SQLException ex)
        {
            System.out.println("Algo de errado aconteceu");
        }
        
        return genero;
    }
    
    @Override
    public ArrayList<GeneroModel> readAll() {
        ArrayList<GeneroModel> generos = new ArrayList();
        
        DataBaseConnectionManager dbcm;
        try
        {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "SELECT * FROM generos;";
            
            ResultSet rs = dbcm.runQuerySQL( sql );
            
            if (rs.isBeforeFirst()) // acho alguma coisa?
            {
                rs.next();
                while (!rs.isAfterLast())
                {
                    int id = rs.getInt("id_genero");
                    String nome = rs.getString("nome");
                    String tipo = rs.getString("tipo");

                    GeneroModel genero = new GeneroModel(id,nome,tipo);
                    generos.add(genero);
                    
                    rs.next();
                }
            }

        } 
        catch (DataBaseException | SQLException ex)
        {
            System.out.println("Algo de errado aconteceu");
        }
        
        return generos;
    }
    
    @Override
    public void update(GeneroModel genero) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "UPDATE generos SET nome = ?, tipo = ? WHERE id_genero = ?;";
            
            String tipo = "Jogo".equals(genero.getTipo()) ? "J" : "F";
            
            dbcm.runPreparedSQL(sql,
                    genero.getNome(),
                    tipo,
                    genero.getId());
            
            JOptionPane.showMessageDialog(null, "Genero atualizado com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível atualizar o Genero, tente de novo","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void delete(Integer primaryKey) {
        DataBaseConnectionManager dbcm;
        try {
            dbcm = ConectionController.getInstance().getDB();
            
            String sql = "DELETE FROM generos WHERE id_genero = ?;";
            
            dbcm.runPreparedSQL(sql, primaryKey );
            
            JOptionPane.showMessageDialog(null, "Genero excluído com sucesso","Sucesso",JOptionPane.INFORMATION_MESSAGE);
        } 
        catch (DataBaseException ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o genero, tente de novo","Erro",JOptionPane.ERROR_MESSAGE);
        }
    }
}
