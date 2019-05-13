
package mobiledevice;

import superclass.Mobile;
import java.util.ArrayList;


public class Phone extends Mobile{
    
     
    private ArrayList<Phone> phones = new ArrayList<>();

    public Phone(double screenSize, String camera, String type, int qtd, double price, String OS, int memory) {
        super(screenSize, camera, type, qtd, price, OS, memory);
    }
//This constructor initializes my existing phones
    public Phone() {
        initPhoneList();
    }

    public ArrayList<Phone> getPhones() {
        return phones;
    }

    public void setPhones(ArrayList<Phone> phones) {
        this.phones = phones;
    }
     //method to hold the existing phones
    private void initPhoneList() {
     
        Phone p1= new Phone(5.8, "12MP", "iPhone XS", 7, 725, "iOS 12", 256);
        phones.add(p1);
         Phone p2= new Phone(6.2, "8MP", "Samsung S9", 11, 855, "Android 9", 64);
         phones.add(p2);
    }

    public void addNewPhone(Phone p1) {
       phones.add(p1);

    }
   public void dispose3Samsung9(){
   int total=0;
    total= this.phones.get(1).qtd-3;
    System.out.println("The new total of Samsung-9 is "+total);
    
    
}
     public void chargeInsurance() {
      
          if (price>1000) {
                System.out.println("This phone is Over 1000: " + type);
            }

    }
  public void chargeInsuranceWithArrayList(){
  
      for (int i = 0; i < phones.size(); i++) {
            if (phones.get(i).price > 1000) {
                System.out.println("This server is Over 1000: " + phones.get(i).type);
            }
        }
  }

    @Override
    public void listFullInventory() {
    System.out.println("The full inventory of phones has "+phones.get(0).qtd+" phones "
            + ""+phones.get(0).type+" and "+phones.get(1).qtd+" "+phones.get(1).type);
    }

    @Override
    public void diplayFullValue() {
        double fullValue= phones.get(0).qtd*phones.get(0).price;
        System.out.println("The full value of all phones is: "+fullValue);
    }


    public boolean compareEquipment(Phone equip1, Phone equip2) {
        boolean isEqual = true;
        if ((equip1).getScreenSize() != ((equip2).getScreenSize())) {
            isEqual = false;
        }
        if ((equip1).getCamera() != (equip2.getCamera())) {
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
        phones.remove(index);
    }
   
}


    


