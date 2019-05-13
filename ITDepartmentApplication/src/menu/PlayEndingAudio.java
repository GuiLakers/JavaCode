package menu;

import java.applet.Applet;
import java.applet.AudioClip;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE;

public class PlayEndingAudio extends JFrame {

    JButton play = new JButton("CLICK HERE TO CLOSE");

    public PlayEndingAudio() {

        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        setSize(750, 750);
        setLocationRelativeTo(null);
        setVisible(true);

        add(play);

        play.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                play("successend");
            }
        });
    }

    public void play(String nameOfAudio) {
        URL url = getClass().getResource(nameOfAudio + ".wav");
        AudioClip audio = Applet.newAudioClip(url);
        audio.play();
    }
}
