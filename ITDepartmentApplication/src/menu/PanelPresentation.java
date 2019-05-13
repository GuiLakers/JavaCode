package menu;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class PanelPresentation extends JFrame {

    JButton button = new JButton("<html>//////   WELCOME TO THE IT DEPARTMENT  //////<br/>"
            + "<html>******************************************<br/>"
            + "<html>TYPE 1-LIST THE FULL INVENTORY OF IT ASSETS<br/>"
            + "<html>TYPE 2-DISPLAY THE FULL VALUE OF HARDWARE AND SOFTWARE<br/>"
            + "<html>TYPE 3-DISPLAY THE TOTAL MEMORY STORAGE FROM ALL COMPUTER ASSETS<br/>"
            + "<html>TYPE 4-PRINT THE SPECIFICATION DETAILS OF ANY COMPUTER TYPE<br/>"
            + "<html>TYPE 5-DISPLAY THE AVERAGE MEMORY SIZE OF THE MOBILE DEVICE TYPES<br/>"
            + "<html>TYPE 6-ADD 2 NEW DELL INSPIRON PCs<br/>"
            + "<html>TYPE 7-DISPLAY ALL ASSETS THAT NEED INSURANCE<br/>"
            + "<html>TYPE 8-DISPOSE OF 3 SAMSUNG-9<br/>"
            + "<html>TYPE 9-ADD TEAMWORK SOFTWARE TO THE APPLICATION PACK<br/>");

    Font font = new Font("Courier New", Font.ITALIC | Font.BOLD, 20);

    public PanelPresentation() throws InterruptedException {
        button.setForeground(Color.BLUE);
        button.setBackground(Color.WHITE);
        button.setFont(font);

        add(button);
        setTitle("Title");
        setSize(900, 900);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
        Thread.sleep(7000);
        setVisible(false);

    }

}
