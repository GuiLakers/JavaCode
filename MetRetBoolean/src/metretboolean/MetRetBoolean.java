package metretboolean;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author pmotel
 */
public class MetRetBoolean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        int[] x = {5, 0, 7, 8, 33, 4, -12};
        MetRetBoolean1 ret = new MetRetBoolean1();//instancia o array
        boolean[] z = ret.convertBoolean(x);//chama o metodo e joga dentro de um array

        for (int i = 0; i < x.length; i++) {
            System.out.println(x[i] + " " + z[i]);//printa o array retornado

        }

    }

}
