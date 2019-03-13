
package teste;

public class Teste {

  
    public static void main(String[] args) {
       
        MinhaThread thread1= new MinhaThread("Guilherme",500);
      MinhaThread thread2= new MinhaThread("Wanda",500);
      MinhaThread thread3= new MinhaThread("Sabrina",500);
      
       thread1.setPriority(Thread.MAX_PRIORITY);
       thread2.setPriority(Thread.NORM_PRIORITY);
       thread3.setPriority(Thread.MIN_PRIORITY);
    }
    
}
