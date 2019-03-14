/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

import java.util.Scanner;

/**
 *
 * @author pmotel
 */
public class BookTitle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        String fullName;

        System.out.print("\nType a book title: ");

        fullName = kb.nextLine();

        int length = fullName.length();

        int lowercase = 0;
        int uppercase = 0;
        int A = 0;
        int E = 0;
        int I = 0;
        int O = 0;
        int U = 0;
        char temp;

        for (int i = 0; i < fullName.length(); i++) {
            temp = fullName.charAt(i);

            if (Character.isLowerCase(fullName.charAt(i))) {
                lowercase++;
            } else if (Character.isUpperCase(fullName.charAt(i))) {
                uppercase++;
            }

            if (temp == 'a' || temp == 'A') {
                A++;
            } else if (temp == 'e' || temp == 'E') {
                E++;
            } else if (temp == 'i' || temp == 'I') {
                I++;
            } else if (temp == 'o' || temp == 'O') {
                O++;
            } else if (temp == 'u' || temp == 'U') {
                U++;
            }

        }
        System.out.println("\n" + fullName + " contains " + uppercase + " uppercase and " + lowercase + " lowercase characters.");
        System.out.println("A or a occurs  : " + A + " times");
        System.out.println("E or e occurs  : " + E + " times");
        System.out.println("I or i occurs  : " + I + " times");
        System.out.println("O or o occurs  : " + O + " times");
        System.out.println("U or u occurs  : " + U + " times");
    }

}
