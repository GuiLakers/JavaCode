package metencapsulate;

import java.util.Scanner;
import java.util.Locale;


public class MetEncapsulate {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        Scanner useLocale = kb.useLocale(Locale.ENGLISH);

        MetEncapsulate1[] dadosPessoais = new MetEncapsulate1[2];
       

        for (int i = 0; i < dadosPessoais.length; i++) {

            System.out.println("Digite seu nome");
            String nome = kb.next();

            System.out.println("Digite sua data de nascimento");

            String dataNasc = kb.next();

            System.out.println("Digite sua altura");
            double alt = kb.nextDouble();

            MetEncapsulate1 test1 = new MetEncapsulate1();
            test1.setNome(nome);
            test1.setDataNascimento(dataNasc);
            test1.setAltura(alt);

            dadosPessoais[i] = test1;

        }

        for (int i = 0; i < dadosPessoais.length; i++) {
            dadosPessoais[i].imprimirDadosPesssoa();

        }

    }

}
