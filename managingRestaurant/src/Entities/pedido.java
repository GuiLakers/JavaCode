package Entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class pedido implements Serializable {

    @Id
    private int id;
    private ArrayList<itemPedido> itens;
    
    public pedido(int id){
        this.id = id;
        this.itens = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void addItem(itemPedido item){
        itens.add(item);
    }
    
    
}
