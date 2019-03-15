package dbexample.DAO;

//Classes necessárias para uso de Banco de dados //
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexaoBd {

    public static String status = "Não conectou...";

    //Método Construtor da Classe//
    public ConexaoBd() {
    }

    //Método de Conexão//
    public static java.sql.Connection getConexaoMySQL() {

        //atributo do tipo Connection
        Connection connection = null;          

        try {

            // Carregando o JDBC Driver padrão
            String driverName = "com.mysql.cj.jdbc.Driver";

            Class.forName(driverName);

            // Configurando a nossa conexão com um banco de dados//
            
            //caminho do servidor do BD
            String serverName = "localhost";    

            //nome do seu banco de dados
            String mydatabase ="test";        
 
            String url = "jdbc:mysql://" + serverName + "/" + mydatabase;

            //nome de um usuário de seu BD
            String username = "root";              

            //sua senha de acesso
            String password = "mobile040904";      

            connection = DriverManager.getConnection(url, username, password);

            //Testa sua conexão//  
            if (connection != null) {

                status = ("STATUS--->Conectado com sucesso!");

            } else {

                status = ("STATUS--->Não foi possivel realizar conexão");

            }

            return connection;

        } catch (ClassNotFoundException e) {  //Driver não encontrado

            System.out.println("O driver expecificado nao foi encontrado.");

            return null;

        } catch (SQLException e) {

            //Não conseguindo se conectar ao banco
            System.out.println("Nao foi possivel conectar ao Banco de Dados.");

            return null;

        }

    }

    //Método que retorna o status da sua conexão//
    public static String statusConection() {

        return status;

    }

    //Método que fecha sua conexão//
    public static boolean FecharConexao() {

        try {

            ConexaoBd.getConexaoMySQL().close();

            return true;

        } catch (SQLException e) {

            return false;

        }

    }

    //Método que reinicia sua conexão//
    public static java.sql.Connection ReiniciarConexao() {

        FecharConexao();

        return ConexaoBd.getConexaoMySQL();

    }
}
