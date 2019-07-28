
package conselhoservidor;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;


public class ConselhoServidor {

    
    public static void main(String[] args) throws IOException {
        
        ServerSocket serv1= new  ServerSocket(8888);
        while (true) {            
            Socket sock= serv1.accept();
            try {
                PrintWriter pw= new PrintWriter(sock.getOutputStream());
           pw.println("Aprenda Java e seja contratado");
           pw.flush();
           pw.close();
            } catch (IOException e) {
                System.out.println("Falha na execucao!"+e);
                    
            }
                   System.exit(0);
            
        }
     
    }
    
}
