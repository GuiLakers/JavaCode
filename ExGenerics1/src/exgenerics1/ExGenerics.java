
package exgenerics1;


public class ExGenerics<G> {
    
    G g;
    
    public  ExGenerics(G g){
    
        this.g=g;
    }
    public void classType(){
        System.out.println("O tipo generico eh "+this.g.getClass());
    }
}
