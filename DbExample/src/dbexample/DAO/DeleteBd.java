
package dbexample.DAO;

import Entities.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;


public class DeleteBd {
     static Connection conn;
    static PreparedStatement ps;
    
    public static boolean register(Register rg){
        try {
            
            String DELETE_QUERY = "DELETE from register where Id=?";
            conn = ConexaoBd.getConexaoMySQL();
            ps = conn.prepareStatement(DELETE_QUERY);
            ps.setInt(1, rg.getId());
            ps.executeUpdate();
            
            ConexaoBd.FecharConexao();
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
}
