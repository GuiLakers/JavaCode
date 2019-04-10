
package exlambda;


public class TestLambda {

    
    public static void main(String[] args) {
       
        Num n1;
        n1= () -> 8.8;
        System.out.println(n1.getValue());
        
        Num n2 = () -> Math.random() *100;
          System.out.println(n2.getValue());
        
         
          ValorNumerico isPar = (int n)-> (n %2)==0;
          System.out.println(isPar.teste(8));
    }
    
}
