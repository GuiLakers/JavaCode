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
public class InsertBd {
    
    static Connection conn;
    static PreparedStatement ps;
    
    public static boolean register(Register rg){
        try {
            
            String INSERT_QUERY = "INSERT INTO register (name,email,phone) VALUES(?,?,?)";
            conn = ConexaoBd.getConexaoMySQL();
            ps = conn.prepareStatement(INSERT_QUERY);
            ps.setString(1, rg.getName());
            ps.setString(2, rg.getEmail());
            ps.setString(3, rg.getPhone());
            ps.executeUpdate();
            
            ConexaoBd.FecharConexao();
            return true;
        } catch (SQLException e) {
            
            return false;
        }
    }
}
