/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exarrayobj;


public class ExArrayObj {

   
    public static void main(String[] args) {
         Carro[] car = new Carro[3];

        Carro car1 = new Carro("preta", "audi", 2);
        Carro car2 = new Carro("prata", "volvo", 4);
        Carro car3 = new Carro("verde", "mitsubishi", 4);

        car[0] = car1;//meu array de Carro chamado car//meu elemento 0 car1
        car[1] = car2;//meu array de Carro chamado car//meu elemento 1 car2
        car[2]= car3;//meu array de Carro chamado car//meu elemento 2 car3

        //foreach do tipo Carro de nome carTotal recebendo o array chamado car
        for (Carro carTotal : car) {
            System.out.println(carTotal);
        }
    }
    
}
