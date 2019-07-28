package exenum;

public enum DiaSemana implements OpiniaoSobreMes {

    SEGUNDA(1), TERCA(2), QUARTA(3), QUINTA(4), SEXTA(5), SABADO(6), DOMINGO(7);
    private final int valor;

    private DiaSemana(int valor) {

        this.valor = valor;

    }

    //metodo retorna o valor passado pelo usuario
    public int getValor() {
        return this.valor;

    }

    //metodo da uma classificacao para cada dia da semana
    public void rankYourDay() {

        switch (valor) {
            case 1:
                System.out.println("Monday..Such a boring day!");
                break;
            case 2:
                System.out.println("Tuesday...It is ok..But far from weekend");
                break;
            case 3:
                System.out.println("Wednesday..Half week is gone");
                break;
            case 4:
                System.out.println("Tuesday..It is getting there");
                break;
            case 5:
                System.out.println("Friday...I like it");
                break;
            case 6:
                System.out.println("Saturday..My favourite day");
                break;
            case 7:
                System.out.println("Sunday...a day to relax");
                break;

        }

    }

    public void imprimeDezembro() {
        System.out.println("Mes das celebracoes");
    }

    public void imprimeFevereiro() {
        System.out.println("Mes que passa rapido");
    }

    public void imprimeMarco() {
        System.out.println("Mes da maior festa da Irlanda");
    }

    public void imprimeAgosto() {
        System.out.println("Meu mes kkk");
    }
}
