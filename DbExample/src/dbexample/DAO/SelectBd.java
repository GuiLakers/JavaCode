
package dbexample.DAO;

import Entities.Register;
import static java.lang.System.out;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class SelectBd {

    static Connection conn;
    static PreparedStatement ps;
    static ResultSet rs;

    public static List<Register> allRegisters() throws SQLException {

        List<Register> registers = null;

        try {

            String FIND_ALl_QUERY = "SELECT * FROM register";
            conn = ConexaoBd.getConexaoMySQL();
            ps = conn.prepareStatement(FIND_ALl_QUERY);
            rs = ps.executeQuery();

            if (rs.first()) {
                registers = new ArrayList<>();
                do {
                    Register register = new Register(
                        rs.getInt("id"),
                        rs.getString("name"),
                        rs.getString("email"),
                        rs.getString("phone")
                    );
                    registers.add(register);

                } while (rs.next());
            }
        } catch (SQLException e) {
            out.println(e);
        }
        return registers;
    }
    
    public static List<Register> filteredList(List<Register> registers, String term){
    
        return registers.stream()
                .filter(
                    rg -> String.valueOf(rg.getId()).contains(term) || 
                            rg.getName().contains(term) ||
                            rg.getEmail().contains(term)
                )
                .collect(Collectors.toList());
    }
}
