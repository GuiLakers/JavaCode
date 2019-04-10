package itdepartmentproject;


import java.util.ArrayList;

public class MobileDevice extends Specification implements ITdepartment {

    protected ArrayList<MobileDevice> equipment = new ArrayList<>();
    protected double screenSize;
    protected String camera;

    //Constructor inherited by superclass
    public MobileDevice(String type, int qtd, double price, String OS, String memory) {
        super(type, qtd, price, OS, memory);
    }

    //Constructor inherited by superclass plus 2 attributes of this class
    public MobileDevice(double screenSize, String camera, String type, int qtd, double price, String OS, String memory) {
        super(type, qtd, price, OS, memory);
        this.screenSize = screenSize;
        this.camera = camera;
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

    public String getMemory() {
        return memory;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public void setEquipment(ArrayList<MobileDevice> equipment) {
        this.equipment = equipment;
    }

    public ArrayList<MobileDevice> getEquipment() {
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
