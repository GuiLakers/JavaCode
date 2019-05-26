package superclass;

public abstract class Computer {

    protected String CPU;
    protected double storage;
    protected String type;
    protected int qtd;
    protected double price;
    protected String OS;
    protected double memory;

    public Computer(String CPU, double storage, String type, int qtd, double price, String OS, int memory) {
        this.CPU = CPU;
        this.storage = storage;
        this.type = type;
        this.qtd = qtd;
        this.price = price;
        this.OS = OS;
        this.memory = memory;
    }

    public Computer() {
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public double getStorage() {
        return storage;
    }

    public void setStorage(double storage) {
        this.storage = storage;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public double getMemory() {
        return memory;
    }

    public void setMemory(double memory) {
        this.memory = memory;
    }

    public abstract void totalMemoryStorage();

    public abstract void listFullInventory();

    public abstract void diplayFullValue();

    public abstract void removeEquipment(int index);

    public String printSpecification() {
        return "Computers{" + "CPU=" + CPU + ", storage=" + storage + ", type="
  + type + ", qtd=" + qtd + ", price=" + price + ", OS=" + OS + ", memory=" + memory + '}';
    }

}
