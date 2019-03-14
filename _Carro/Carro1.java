package carro;

public class Carro1 {

    private String cor;
    private String fabricante;
    private int numPortas;

    public Carro1(String cor, String fabricante, int numPortas) {
        this.cor = cor;
        this.fabricante = fabricante;
        this.numPortas = numPortas;
    }

   
    public String getCor() {
        return cor;
    }

   
    public void setCor(String cor) {
        this.cor = cor;
    }

   
    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

  
    public int getNumPortas() {
        return numPortas;
    }

    
    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }

    //Metodo toString que printa os elementos do carro
    @Override
    public String toString() {
        
        
        return "A cor eh: "+cor+ ". A fabricante eh: "+fabricante+". O numero de portas eh: " +numPortas; 
    }


}
