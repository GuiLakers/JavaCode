package playlink;

import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.Scanner;

public class PlayLink {

    public static void main(String[] args) throws URISyntaxException, IOException {

        System.out.println("Type a number from 1 to 4 to pick a RHCP'song");
        Scanner kb = new Scanner(System.in);

        try {

            int i = kb.nextInt();

            switch (i) {

                case 1:
                    System.out.println("Scar tissue");
                    URI link1 = new URI("https://www.youtube.com/watch?v=mzJj5-lubeM");
                    Desktop.getDesktop().browse(link1);
                    break;

                case 2:
                    System.out.println("Dani California");
                    URI link2 = new URI("https://www.youtube.com/watch?v=Sb5aq5HcS1A");
                    Desktop.getDesktop().browse(link2);
                    break;

                case 3:
                    System.out.println("Road tripping'");
                    URI link3 = new URI("https://www.youtube.com/watch?v=11GYvfYjyV0");
                    Desktop.getDesktop().browse(link3);
                    break;

                case 4:
                    System.out.println("Under the bridge");
                    URI link4 = new URI("https://www.youtube.com/watch?v=GLvohMXgcBo");
                    Desktop.getDesktop().browse(link4);
                    break;

                default:
                    System.out.println("Number not valid!");
            }
        } catch (Exception e) {
            System.out.println("You have NOT typed a valid option!");
        }

    }
}
