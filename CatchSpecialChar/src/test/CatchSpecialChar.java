package test;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;

public class CatchSpecialChar extends JFrame {

    public CatchSpecialChar() {

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent kb) {
                int code= kb.getKeyCode();
                int key= KeyEvent.VK_SEMICOLON;
                if (code==key) {
                    System.out.println("Tecla SEMICOLON pressionada ");
                    System.exit(0);
                }

                char letter = kb.getKeyChar();
                System.out.println(letter);
            }
        });

        
        setSize(500, 400);
        setLocationRelativeTo(this);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

    }

}
