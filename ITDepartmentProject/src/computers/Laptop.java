package computers;

import itdepartmentproject.ComputerSystem;

public class Laptop extends ComputerSystem {

    public Laptop(String CPU, String storage, String type, int qtd, double price, String OS, String memory) {
        super(CPU, storage, type, qtd, price, OS, memory);

        ComputerSystem laptop1 = new ComputerSystem("8th Generation Intel® Core™ i7", "1 TB HDD storage", "Dell XPS13", 18, 950, "Windows 10 Pro (64-bit)", "32 GB DDR4 (2 DIMM");

        equipment.add(laptop1);

    }

}
