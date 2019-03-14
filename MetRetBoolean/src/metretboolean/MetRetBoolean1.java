/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metretboolean;

/**
 *
 * @author pmotel
 */
public class MetRetBoolean1 {
    
    public boolean[] convertBoolean(int[] n) {
        boolean[] result = new boolean[n.length];//array do tamanho do parametro
        for (int i = 0; i < n.length; i++) {
            if (n[i] > 0) {

                result[i] = true;

            }

        }
        return result;
    }
    
}
