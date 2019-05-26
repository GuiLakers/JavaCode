package computers;

import itdepartmentproject.ComputerSystem;

public class Network extends ComputerSystem {

    public Network(String CPU, String storage, String type, int qtd, double price, String OS, String memory) {
        super(CPU, storage, type, qtd, price, OS, memory);

        ComputerSystem network1 = new ComputerSystem("Intel AXU", "100 TB", "Dell Server XModel",
                4, 2500, "Window Server", "16 GB");
        
        equipment.add(network1);

    }
}
