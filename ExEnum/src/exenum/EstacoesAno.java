package exenum;

public enum EstacoesAno {

    PRIMAVERA(1), VERAO(2), OUTONO(3), INVERNO(4);
    private final int valor;

    private EstacoesAno(int valor) {

        this.valor = valor;

    }

    //metodo retorna o valor passado pelo usuario
        public int getValor() {
        return this.valor;

    }

    //metodo da uma classificacao para cada dia da semana
    public void rankYourSeason() {

        switch (valor) {
            case 1:
                System.out.println("Spring..Flowers everywhere!");
                break;
            case 2:
                System.out.println("Summer...I love it. Sunshine is out!");
                break;
            case 3:
                System.out.println("Autumn..Leaves fallng down");
                break;
            case 4:
                System.out.println("Winter..It is too cold!");
                break;

        }

    }
}
