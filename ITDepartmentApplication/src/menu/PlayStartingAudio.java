package menu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DISPOSE_ON_CLOSE;

public class PlayStartingAudio extends JFrame {

    JButton play = new JButton("CLICK HERE TO START");

    public PlayStartingAudio() throws InterruptedException {

        setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        setSize(750, 750);
        setLocationRelativeTo(null);
        setVisible(true);

        add(play);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("success");
            }
        });
        Thread.sleep(2000);//method sleep to arrange the time of my event
        new PanelPresentation();
        Thread.sleep(1000);
    }

    public void play(String nameOfAudio) {
        URL url = getClass().getResource(nameOfAudio + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
        setVisible(false);
    }
}
