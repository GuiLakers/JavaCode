/*
  Crie uma classe para representar uma pessoa, com os atributos privados de nome, data de
nascimento e altura. Crie os métodos públicos necessários para sets e gets e também um
método para imprimir todos dados de uma pessoa. Crie um método para calcular a idade
da pessoa.
 */
package metencapsulate;

public class MetEncapsulate1 {

    private String nome;
    private String dataNascimento;
    private double altura;

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(String dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public int getAnoNascimento() {
        int ano = Integer.parseInt(dataNascimento.split("/")[2]);

        return ano;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    void imprimirDadosPesssoa() {

        System.out.println("Seu nome eh " + nome);
        System.out.println("Sua data de nascimento eh " + dataNascimento);
        System.out.println("Sua altura eh " + altura);
    }

    int calcularIdade(int anoAtual) {

        return anoAtual - getAnoNascimento();

    }

}
