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
public class BlankSpace {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Type a sentence");

        String sentence = kb.nextLine();

        sentence = sentence.trim().replaceAll("\\s+", " ");

        System.out.println(sentence);

    }
}
