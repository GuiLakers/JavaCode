
package menu;
import java.util.logging.Level;
import java.util.logging.Logger;

public class  MyThread extends Thread {

    String nome;
    int tempo;

    public MyThread(String nome, int tempo) {

        this.nome = nome;
        this.tempo = tempo;
        start();

    }

    public void run() {

        try {

            for (int i = 0; i < 1; i++) {
                System.out.println(nome);
                Thread.sleep(tempo);
            }

        } catch (InterruptedException ex) {
            Logger.getLogger(MyThread.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

}
