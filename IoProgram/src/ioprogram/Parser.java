
package ioprogram;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Parser {

    public Parser() {
    }

    public void textReader(String input) throws IOException {

        Path path = Paths.get(input);
        Scanner kb = new Scanner(path);
        System.out.println("Read text file using Scanner");

        while (kb.hasNextLine()) {

            //read line by lne
            String line = kb.nextLine();
            System.out.println(line);
        }
        kb.close();
    }

}
