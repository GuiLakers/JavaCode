/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbexample.DAO;

import Entities.Register;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author pmotel
 */
public class UpdateBd {
    
    static Connection conn;
    static PreparedStatement ps;
    
    public static boolean register(Register rg){
        try {
            
            String UPDATE_QUERY = "UPDATE register SET name=?,email=?,phone=? WHERE id=?";
            conn = ConexaoBd.getConexaoMySQL();
            ps = conn.prepareStatement(UPDATE_QUERY);
            ps.setString(1, rg.getName());
            ps.setString(2, rg.getEmail());
            ps.setString(3, rg.getPhone());
            ps.setInt(4, rg.getId());
            ps.executeUpdate();
            
            ConexaoBd.FecharConexao();
            return true;
            
        } catch (SQLException e) {
            return false;
        }
    }
    
}
