
package Entities;


public class itemComboBoxPedido {

    private int id;
    private String produto;
    private double valor;

    public itemComboBoxPedido(int id, String produto, double valor) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
    }

    public itemComboBoxPedido() {
        
    }
    

    @Override
    public String toString() {
        return produto;
    }
    
    public String getProduto(){
        return produto;
    }
    
    public double getValor(){
        return valor;
    }

}
