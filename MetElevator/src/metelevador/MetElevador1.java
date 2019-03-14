/*Crie uma classe denominada Elevador para armazenar as informações de um elevador
dentro de um prédio. A classe deve armazenar o andar atual (térreo = 0), total de andares
no prédio (desconsiderando o térreo), capacidade do elevador e quantas pessoas estão
presentes nele. A classe deve também disponibilizar os seguintes métodos:
Inicializa : que deve receber como parâmetros a capacidade do elevador e o total de
andares no prédio (os elevadores sempre começam no térreo e vazio);
Entra : para acrescentar uma pessoa no elevador (só deve acrescentar se ainda houver
espaço);
Sai : para remover uma pessoa do elevador (só deve remover se houver alguém
dentro dele);
Sobe : para subir um andar (não deve subir se já estiver no último andar);
Desce : para descer um andar (não deve descer se já estiver no térreo);
Encapsular todos os atributos da classe (criar os métodos set e get).*/
package metelevador;

/**
 *
 * @author pmotel
 */
public class MetElevador1 {

    public int getAndarAtual() {
        System.out.println("Andar atual: " + this.andarAtual);
        return andarAtual;
    }

    public void setAndarAtual(int andarAtual) {
        this.andarAtual = andarAtual;
    }

    public int getTotalAndares() {
        return totalAndares;
    }

    public void setTotalAndares(int totalAndares) {
        this.totalAndares = totalAndares;
    }

    public int getCapacElevador() {
        return capacElevador;
    }

    public void setCapacElevador(int capacElevador) {
        this.capacElevador = capacElevador;
    }

    public int getPessoasDentro() {
        System.out.println("Pessoas dentro: " + this.pessoasDentro);
        return pessoasDentro;

    }

    public void setPessoasDentro(int pessoasDentro) {
        this.pessoasDentro = pessoasDentro;
    }

    private int andarAtual = 0;
    private int totalAndares;
    private int capacElevador;
    private int pessoasDentro = 0;

    void inicializa(int totalAndares, int capacElevador) {

        setTotalAndares(totalAndares);
        setCapacElevador(capacElevador);
    }

    void entra() {
        if (this.getPessoasDentro() < this.getCapacElevador()) {
            this.setPessoasDentro(pessoasDentro + 1);
            System.out.println("Entrou uma pessoa");
        }

    }

    void sai() {

        if (this.getPessoasDentro() > 0) {

            this.setPessoasDentro(this.getPessoasDentro() - 1);
            System.out.println("Sai uma pessoa");
        }

    }

    void sobe() {
        if (this.getTotalAndares() > this.getAndarAtual()) {
            this.setAndarAtual(this.getAndarAtual() + 1);
            System.out.println("Sobe um andar");
        } else {
            System.out.println("Ultimo andar");
        }

    }

    void desce() {

        if (this.getAndarAtual() > 0) {
            System.out.println("Desce um andar");
            this.setAndarAtual(this.getAndarAtual() - 1);
            System.out.println("Andar atual: " + this.getAndarAtual());
        }

    }

}
