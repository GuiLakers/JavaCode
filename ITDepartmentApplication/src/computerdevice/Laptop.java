package computerdevice;

import superclass.Computer;
import java.util.ArrayList;

public class Laptop extends Computer {

    final int microsoftOffice = 400;
    final int photoshop = 295;
    final int nortonAntivirus = 105;
    final int teamWork = 275;

    private ArrayList<Laptop> laptops = new ArrayList<>();

    public Laptop(String CPU, double storage, String type, int qtd, double price,
            String OS, int memory) {
        super(CPU, storage, type, qtd, price, OS, memory);
    }
//This constructor initializes my existing Laptops
    public Laptop() {

        initLaptopList();
    }

    public ArrayList<Laptop> getLaptops() {
        return laptops;
    }

    public void setLaptops(ArrayList<Laptop> laptops) {
        this.laptops = laptops;
    }

    //method to hold the existing laptops
    private void initLaptopList() {

        Laptop lap1 = new Laptop("CPU 8th Generation Intel® Core™ i7", 1, 
       "Dell XPS13 ", 18, 950, "Operating System Windows 10 Pro (64-bit)", 32);

        laptops.add((Laptop) lap1);

    }

    public void addNewLaptop(Laptop lp) {
        laptops.add(lp);

    }

    public void addTeamWorkToSoftwarePack() {
        int total;
        total = microsoftOffice + photoshop + nortonAntivirus + teamWork;
        System.out.println("You just added the TeamWork and the total price is " + total + " euros");
    }

    public void chargeInsurance() {

        if (price > 1000) {
            System.out.println("This laptop is Over 1000: " + type);
        }
    }

    public void chargeInsuranceWithArrayList() {

        for (int i = 0; i < laptops.size(); i++) {
            if (laptops.get(i).price > 1000) {
                System.out.println("This laptop is Over 1000: " + laptops.get(i).type);
            }
        }

    }

    @Override
    public void listFullInventory() {
        System.out.println("The full inventory of laptops has " + laptops.get(0).qtd 
                + " laptops " + laptops.get(0).type);

    }

    @Override
    public void diplayFullValue() {
        double fullValue = laptops.get(0).qtd * laptops.get(0).price + microsoftOffice 
              + photoshop + nortonAntivirus + teamWork;
        System.out.println("The full value of all laptops is: " + fullValue+" including the software pack");
    }

    @Override
    public void totalMemoryStorage() {
        System.out.println("The total memory storage for each laptop is " 
                + laptops.get(0).storage + " TB");
    }

    public boolean compareEquipment(Laptop equip1, Laptop equip2) {
        boolean isEqual = true;
        if ((equip1).CPU != ((equip2).CPU)) {
            isEqual = false;
        }
        if (((equip1.storage) != (equip2.storage))) {
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
    public void removeEquipment(int index) {
        laptops.remove(index);
        
    }
}
