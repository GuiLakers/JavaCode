
package conselhocliente;

import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;


public class ConselhoCliente {

    
    public static void main(String[] args) throws IOException {
       
        //Endereco IP do meu computador Compaq e uma porta qualquer adicionados
        Socket sock1= new Socket("192.168.56.1",8888);
        try (Scanner scan = new Scanner(sock1.getInputStream())) {
            System.out.println("Mensagem: "+scan.nextLine());
            scan.close();
        }
        
    }
    
}
