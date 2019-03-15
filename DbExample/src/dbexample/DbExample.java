
import dbexample.DAO.ConexaoBd;
import static java.lang.System.out;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pmotel
 */
public class DbExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        out.println(ConexaoBd.statusConection());
        ConexaoBd.getConexaoMySQL();
        out.println(ConexaoBd.statusConection());
        
    }
    
}
