package superclass;

public abstract class Mobile {

    protected double screenSize;
    protected String camera;
    protected String type;
    protected int qtd;
    protected double price;
    protected String OS;
    protected double memory;

    public Mobile(double screenSize, String camera, String type, int qtd, double price, String OS, int memory) {
        this.screenSize = screenSize;
        this.camera = camera;
        this.type = type;
        this.qtd = qtd;
        this.price = price;
        this.OS = OS;
        this.memory = memory;
    }

    public Mobile() {
    }

    public double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(double screenSize) {
        this.screenSize = screenSize;
    }

    public String getCamera() {
        return camera;
    }

    public void setCamera(String camera) {
        this.camera = camera;
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

    public abstract void listFullInventory();

    public abstract void diplayFullValue();

    public abstract void displayAverageMemorySize();
    
    public abstract void removeEquipment(int index);
    
    
    public String printSpecification() {
       return "Mobiles{" + "screenSize=" + screenSize + ", camera=" + camera + ""
+ ", type=" + type + ", qtd=" + qtd + ", price=" + price + ", OS=" + OS + ", memory=" + memory + '}';
    }

}
