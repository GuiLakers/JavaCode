package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class mesa implements Serializable {

    @Id
    private int numero;
    private String cliente;
    private pedido pedido;

    public mesa(int numero, String cliente, pedido pedido) {
        this.numero = numero;
        this.cliente = cliente;
        this.pedido= pedido;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    public String getCliente(){
        return this.cliente;
    }
    
    public Entities.pedido setPedido(){
        return pedido;
    }
    
}
