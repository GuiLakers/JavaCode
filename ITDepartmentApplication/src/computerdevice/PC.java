package computerdevice;

import superclass.Computer;
import java.util.ArrayList;

public class PC extends Computer {

   
    final  int microsoftOffice = 400;
    final int photoshop = 295;
    final int nortonAntivirus = 105;
    final int teamWork = 275;

    private ArrayList<PC> PCs = new ArrayList<>();

    public PC(String CPU, double storage, String type, int qtd, double price, 
            String OS, int memory) {
        super(CPU, storage, type, qtd, price, OS, memory);
    }
//This constructor initializes my existing PCs
    public PC() {
        
      initPCList();
    }

    public ArrayList<PC> getPCs() {
        return PCs;
    }

    public void setPCs(ArrayList<PC> PCs) {
        this.PCs = PCs;
    }
    
     //method to hold the existing PCs
     private void initPCList() {
     
        PC pc1= new PC("8th Generation Intel® Core™ i3-8100 Processor", 1, 
   "Dell Inspirons ", 12, 500, "Windows 10 Home 64bit Multi-Language English",8);
        PCs.add((PC) pc1);
    
    }

    public void addNewPC(PC pc) {
        this.PCs.add(pc);

    }

    public void addTeamWorkToSoftwarePack() {
        int total;
        total = microsoftOffice + photoshop + nortonAntivirus + teamWork;
        System.out.println("You just added the TeamWork and the total price is "
                + "" + total + " euros");
    }

    public void add2NewDellInspiron() {
        
        int totalQtd=0;
        double totalPrice=0;
        totalQtd= this.PCs.get(0).qtd+2;
        totalPrice= totalQtd*this.PCs.get(0).price;
    
    System.out.println("The new total of Dell Inspiron is "+totalQtd+ " "
            + "and the total price is " +totalPrice);
        

    }

    public void chargeInsurance() {
                if (price>1000) {
                System.out.println("This PC is Over 1000: " + type);
            }
    }
    
    public void chargeInsuranceWithArrayList() {

     for (int i = 0; i < PCs.size(); i++) {
            if (PCs.get(i).price > 1000) {
                System.out.println("This PC is Over 1000: " + PCs.get(i).type);
            }
        }

        }
    @Override
    public void listFullInventory() {
           System.out.println("The full inventory of Pcs has "+PCs.get(0).qtd+" "
                   + "Pcs "+PCs.get(0).type);
    }

    @Override
    public void diplayFullValue() {
double fullValue= PCs.get(0).qtd*PCs.get(0).price+microsoftOffice+photoshop+nortonAntivirus+teamWork;
        System.out.println("The full value of all PCs is: "+fullValue+" including the software pack");
    }

    @Override
    public void totalMemoryStorage() {
             System.out.println("The total memory storage for each PC is "+PCs.get(0).storage+" TB");
    }
    public boolean compareEquipment(PC equip1, PC equip2) {
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
        PCs.remove(index);
    }

   }
