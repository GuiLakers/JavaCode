package computers;

import itdepartmentproject.ComputerSystem;

public class PC extends ComputerSystem {

    public PC(String CPU, String storage, String type, int qtd, double price, String OS, String memory) {
        super(CPU, storage, type, qtd, price, OS, memory);

        ComputerSystem PC1 = new ComputerSystem("8th Generation Intel® Core™ i3-8100 Processor", "3.5” 1TB 7200 rpm Hard Drive",
                "Dell Inspirons", 12, 500, "Windows 10 Home 64bit Multi-Language English", " 8GB, DDR4, 2666MHz");

        equipment.add(PC1);

    }

}
