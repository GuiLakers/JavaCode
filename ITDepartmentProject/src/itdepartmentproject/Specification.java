
package itdepartmentproject;

//This class is to avoid repetitions on ComputerSystem and MobileDevice attributes
public class Specification {
    
  
    protected String type;
    protected int qtd;
    protected double price;
    protected String OS;
    protected String memory;
    

    public Specification(String type, int qtd, double price, String OS, String memory) {
        this.type = type;
        this.qtd = qtd;
        this.price = price;
        this.OS = OS;
        this.memory = memory;
    }
    
    
}
