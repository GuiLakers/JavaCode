package test;

import java.util.ArrayList;

public class Test2 {

    private Test1 t;
    private ArrayList<Test1> dadosPessoais = new ArrayList<>();

   
    
    public Test2() {
        initDadosPessoais();
    }

    private void initDadosPessoais() {

        ///Essa classe tem que passar esses 2 atributos para ser inicializada
       Test1 t=new Test1("Gui", 35);
       Test1 t1=new Test1("Riyaa", 26);
       Test1 t2=new Test1("Edvaldo",60);
       
       dadosPessoais.add(t);
          dadosPessoais.add(t1);
           dadosPessoais.add(t2);
    }

    public void addDadosPessoais(Test1 t) {

        dadosPessoais.add(t);
        for (int i = 0; i < dadosPessoais.size(); i++) {
            System.out.println(dadosPessoais.get(i));
        }

    }

}
