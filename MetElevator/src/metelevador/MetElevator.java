/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metelevador;

/**
 *
 * @author pmotel
 */
public class MetElevator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MetElevador1 elev = new MetElevador1();
        elev.inicializa(10, 8);
        elev.entra();
        elev.entra();
        elev.entra();
        elev.sai();
    }

}
