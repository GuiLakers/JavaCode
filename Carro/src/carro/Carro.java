package carro;

public class Carro {

    public static void main(String[] args) {
        Carro1[] car = new Carro1[3];

        Carro1 car1 = new Carro1("preta", "audi", 2);
        Carro1 car2 = new Carro1("prata", "volvo", 4);
        Carro1 car3 = new Carro1("verde", "mitsubishi", 4);

        car[0] = car1;//meu array de Carro1 chamado car//meu elemento 0 car1
        car[1] = car2;//meu array de Carro1 chamado car//meu elemento 1 car2
        car[2]= car3;//meu array de Carro1 chamado car//meu elemento 2 car3

        //foreach do tipo Carro1 de nome carTotal recebendo o array chamado car
        for (Carro1 carTotal : car) {
            System.out.println(carTotal);
        }
    }
    
}
