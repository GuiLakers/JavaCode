package test;

public class Test1 {

    private String nome;
    private int idade;

    //forca a classe Test2 a passar esses atributos para ser inicializada
    public Test1(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }
    

    @Override
    public String toString() {
        return "Test1{" + "nome=" + nome + ", idade=" + idade + '}';
    }

    public void mostraSoIdade() {

        System.out.println("Sua idade eh: " + this.idade);
    }

    public void mostraSoName() {

        System.out.println("Seu nome eh: " + this.nome);
    }
}
