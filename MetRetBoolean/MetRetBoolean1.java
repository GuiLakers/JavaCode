package metretboolean;

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


