/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhathread;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author pmotel
 */
public class MinhaThread extends Thread {

    String nome;
    int tempo;

    public MinhaThread(String nome, int tempo) {

        this.nome = nome;
        this.tempo = tempo;
        start();

    }

    public void run() {

        try {

            for (int i = 0; i < 5; i++) {
                System.out.println(nome);
                Thread.sleep(tempo);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(MinhaThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
