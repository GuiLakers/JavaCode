/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entities;

/**
 *
 * @author pmotel
 */
public class itemComboBoxPedido {

    private int id;
    private String produto;
    private double valor;

    public itemComboBoxPedido(int id, String produto, double valor) {
        this.id = id;
        this.produto = produto;
        this.valor = valor;
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
