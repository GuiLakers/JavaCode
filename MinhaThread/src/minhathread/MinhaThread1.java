/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package minhathread;

/**
 *
 * @author pmotel
 */
public class MinhaThread1 {

    public static void main(String[] args) {

        MinhaThread thread1 = new MinhaThread("Guilherme", 500);
        MinhaThread thread2 = new MinhaThread("Wanda", 500);
        MinhaThread thread3 = new MinhaThread("Sabrina", 500);

        thread1.setPriority(Thread.MAX_PRIORITY);
        thread2.setPriority(Thread.NORM_PRIORITY);
        thread3.setPriority(Thread.MIN_PRIORITY);
    }

}
