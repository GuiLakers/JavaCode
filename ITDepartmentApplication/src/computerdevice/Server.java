
package computerdevice;

import superclass.Computer;
import java.util.ArrayList;


public class Server extends Computer{
    
   
    private ArrayList<Server > servers = new ArrayList<>();

    public Server(String CPU, double storage, String type, int qtd, double price, String OS, int memory) {
        super(CPU, storage, type, qtd, price, OS, memory);
    }

//This constructor initializes my existing servers
    public Server() {
        initServerList();
    }

    public ArrayList<Server> getServers() {
        return servers;
    }

    public void setServers(ArrayList<Server> servers) {
        this.servers = servers;
    }
    
    
    //method to hold the existing servers
    private void initServerList() {
        
        Server s1 = new Server("Intel AXU ", 100, "Dell Server XModel ", 4, 2500,
                "Operating System Window Server)",16);

        servers.add(s1);
    
    }

    public void addNewServer(Server s1) {
        servers.add(s1);
      
    }
  public void chargeInsurance() {
      
          if (price>1000) {
                System.out.println("This server is Over 1000: " + type);
            }

    }

public void chargeInsuranceWithArrayList() {

     for (int i = 0; i < servers.size(); i++) {
            if (servers.get(i).price > 1000) {
                System.out.println("This server is Over 1000: " + servers.get(i).type);
            }
        }

        }

    @Override
    public void listFullInventory() {
        System.out.println("The full inventory of servers has "+servers.get(0).qtd+
                " servers "+servers.get(0).type);
    }

    @Override
    public void diplayFullValue() {
         
double fullValue= servers.get(0).qtd*servers.get(0).price;
        System.out.println("The full value of all servers is: "+fullValue);
    }

    @Override
    public void totalMemoryStorage() {
       System.out.println("The total memory storage for each server is "+servers.get(0).storage+" TB");
    }

    public boolean compareEquipment(Server equip1, Server equip2) {
        boolean isEqual = true;
        if ((equip1).CPU != ((equip2).CPU)) {
            isEqual = false;
        }
        if (((equip1.storage) != (equip2.storage))) {
            isEqual = false;
        }
        if ((equip1).OS != ((equip2).OS)) {
            isEqual = false;
            {
                isEqual = false;
            }
        }

        if (((equip1.memory) != (equip2.memory))) {
            isEqual = false;
        }
        if (((equip1.price) != (equip2.price))) {
            isEqual = false;
        }
        if (((equip1.qtd) != (equip2.qtd))) {
            isEqual = false;
        }
        if ((equip1).type != ((equip2).type)) {
            isEqual = false;
        }

        if (isEqual) {
            System.out.println("It is equal!");

            return true;
        } else {
            System.out.println("It is NOT equal!");
        }
        return false;
    }

    @Override
    public void removeEquipment(int index) {
        servers.remove(index);
    }
  
}

    


