
package mobiledevice;

import superclass.Mobile;
import java.util.ArrayList;


public class Tablet extends Mobile {
    
     
    private ArrayList<Tablet> tablets = new ArrayList<>();

    public Tablet(double screenSize, String camera, String type, int qtd, double 
            price, String OS, int memory) {
        super(screenSize, camera, type, qtd, price, OS, memory);
    }
//This constructor initializes my existing tablets
    public Tablet() {
        initTabletList();
    }

    public ArrayList<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(ArrayList<Tablet> tablets) {
        this.tablets = tablets;
    }
    
     //method to hold the existing tablets
     private void initTabletList() {
     
         Tablet t1= new Tablet(10, "9MP", "iPad 2017 ", 6, 1200, "iOS 11", 128);
        tablets.add(t1);
    
    }

    public void addNewTablet(Tablet t1) {
       tablets.add(t1);

    }
    
public void chargeInsurance() {
    if (price>1000) {
                System.out.println("This phone is Over 1000: " + type);
            }
   
}

public void chargeInsuranceWithArrayList(){
  for (int i = 0; i < tablets.size(); i++) {
            if (tablets.get(i).price > 1000) {
                System.out.println("This server is Over 1000: " + tablets.get(i).type);
            }
        }
  }

    @Override
    public void listFullInventory() {
     System.out.println("The full inventory of tablets has "+tablets.get(0).qtd+" tablets "+tablets.get(0).type);
    }

    @Override
    public void diplayFullValue() {
         double fullValue= tablets.get(0).qtd*tablets.get(0).price;
        System.out.println("The full value of all tablets is: "+fullValue);
    }
    public boolean compareEquipment(Tablet equip1, Tablet equip2) {
        boolean isEqual = true;
        if ((equip1).screenSize != ((equip2).screenSize)) {
            isEqual = false;
        }
        if ((equip1).camera != (equip2.camera)) {
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
    public void displayAverageMemorySize() {
        
            Phone p1 = new Phone();
                    Tablet t1 = new Tablet();
                    int total = 0;
                    int totalMobiles = 0;
                    for (int i = 0; i < p1.getPhones().size(); i++) {
                        total += p1.getPhones().get(i).getMemory();
                        totalMobiles++;
                    }
                    for (int i = 0; i < t1.getTablets().size(); i++) {
                        total += t1.getTablets().get(i).getMemory();
                        totalMobiles++;
                    }
                    double average = total / totalMobiles;
                    System.out.println("The average memory size for mobiles is: "+average+"GB");
    }

    @Override
    public void removeEquipment(int index) {
      tablets.remove(index);
    }

}
