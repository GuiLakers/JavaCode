
package exgenerics2;


public class Test {

   
    public static void main(String[] args) {
        
        
        TestGenerica tg1= new TestGenerica(0, 8, "Guilherme");
        System.out.println(tg1.getNome());
      tg1.names.add(0, 'h');
        System.out.println(tg1.getNames().get(0));
        
        
      
      
       
        
    }
    
}
