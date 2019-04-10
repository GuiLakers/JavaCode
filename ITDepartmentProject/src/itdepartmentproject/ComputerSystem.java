package itdepartmentproject;

import java.util.ArrayList;

public class ComputerSystem extends Specification implements ITdepartment {

    protected ArrayList<ComputerSystem> equipment = new ArrayList<>();
    protected String CPU;
    protected String storage;

    //Constructor inherited by superclass
    public ComputerSystem(String type, int qtd, double price, String OS, String memory) {
        super(type, qtd, price, OS, memory);
    }

    //Constructor inherited by superclass plus 2 attributes of this class
    public ComputerSystem(String CPU, String storage, String type, int qtd, double price, String OS, String memory) {
        super(type, qtd, price, OS, memory);
        this.CPU = CPU;
        this.storage = storage;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }

    public String getStorage() {
        return storage;
    }

    public void setStorage(String storage) {
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

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public void setEquipment(ArrayList<ComputerSystem> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<ComputerSystem> getEquipment() {
        return equipment;
    }

    public String displayTotalMemory() {
        return null;

    }

    public void printSpecificationDetail() {
       
    }

    public String displayAvgMemSize() {
        return null;

    }

    public double displayAssetInsurance() {
        return 0;

    }

    public void addEquipment() {

    }

    public boolean compareEquipment() {
        return false;

    }

    public void removeEquipment() {

    }

    public void listFullInventory() {

    }

    public void displayFullValue() {

    }

}
