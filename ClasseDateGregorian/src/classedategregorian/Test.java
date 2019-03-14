/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package classedategregorian;

import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author pmotel
 */
public class Test {
    public static void main(String[] args) {
       
        //data da retirada
        GregorianCalendar dataRetirada=new GregorianCalendar();
        Date time = dataRetirada.getTime();
        System.out.println("A data e horario da retirada eh: "+time);
        
        //data da entrega
        GregorianCalendar gc=new GregorianCalendar();
         gc.add(GregorianCalendar.HOUR, 48); //Adiciona 2 dias à data atual

        
        LivroDeBiblioteca l1= new  LivroDeBiblioteca();
        l1.setEmprestado(true);
        l1.setNome("oi sumida");
        l1.setIsbn("gfh5464646");
        l1.setAnoLancamento(1988);
        l1.setAutor("Tacuabundanabaranga");
        
        
        l1.setQtdPag(124);
        l1.setDataEntrega(gc);
        
        
        System.out.println(l1.detalharLivro());
        
    }
}
