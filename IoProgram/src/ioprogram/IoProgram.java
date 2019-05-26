package ioprogram;

import java.io.*;

public class IoProgram {

    public static void main(String[]args) throws IOException 
         {
            // Parser p1= new Parser();
            // p1.textReader("input.txt");
                     

        FileInputStream in = null;
        FileOutputStream out = null;

        try {
            in = new FileInputStream("input.txt");
            out = new FileOutputStream("output.txt");
            int c;
            while ((c = in.read()) != -1) {
                out.write(c);
            }
        } finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }

    }

}
