
package itdepartmentproject;

//My interface, which has all methods to be implemented by subclasses
public interface ITdepartment {
    
    String displayTotalMemory();
    void printSpecificationDetail();
    String displayAvgMemSize();
    double displayAssetInsurance();
    void addEquipment();
    boolean compareEquipment();
    void removeEquipment();
    void listFullInventory();
    void displayFullValue();
}
