/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication;

/**
 *
 * @author pmotel
 */
public class ArrayBiBackwards {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int x[][] = {{2, 4, 1, 5},
        {6, 9, 7, 8},
        {0, 3, 2, 8}};

        for (int i = x.length - 1; i >= 0; i--) {
            for (int j = x[i].length - 1; j >= 0; j--) {

                System.out.print(x[i][j] + " ");
            }
            System.out.println();
        }
    }
}
