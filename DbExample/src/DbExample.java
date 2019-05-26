
import dbexample.DAO.ConexaoBd;
import static java.lang.System.out;


public class DbExample {

    
    public static void main(String[] args) {
        
        out.println(ConexaoBd.statusConection());
        ConexaoBd.getConexaoMySQL();
        out.println(ConexaoBd.statusConection());
        
    }
    
}
