/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exenum;

/**
 *
 * @author guifu
 */
public class ExEnum {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //  System.out.println(DiaSemana.DOMINGO.getValor());
      //  DiaSemana.SEXTA.rankYourDay();
      //  EstacoesAno.PRIMAVERA.rankYourSeason();
        //instanciando classe enum dentro de uma classe
        Data d1= new Data(4, 5, 2019, DiaSemana.SABADO);
        System.out.println(d1.toString());
        d1.getDiaSemana().imprimeDezembro();
    }
    
}
