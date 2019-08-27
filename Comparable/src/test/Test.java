package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List lista = new ArrayList();

        Pessoa p1 = new Pessoa("Gui", 886);
        Pessoa p2 = new Pessoa("Edvaldo", 579);
        Pessoa p3 = new Pessoa("Cristina", 63);

        lista.add(p1);
        lista.add(p2);
        lista.add(p3);
        
        //lista ordenada por idade
        Collections.sort(lista);
        for (Object object : lista) {
            System.out.println(object);
        }

    }

}
