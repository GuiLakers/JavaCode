package menu;

import computerdevice.Laptop;
import computerdevice.PC;
import computerdevice.Server;
import java.util.Scanner;
import mobiledevice.Phone;
import mobiledevice.Tablet;

final public class Menu {

    protected static void init() throws InterruptedException {
        int count = 0;

//////////////////////////////////////////BEGINNING OF SWITCH/////////////////////////////////////////////////////////////////////////////        
        Scanner kb = new Scanner(System.in);
        do {
            System.out.println("Enter a valid number");
            try {//try catch to assign it is only allowed number in here
                count = kb.nextInt();

            } catch (Exception e) {
                System.out.println("You MUST enter a number between 1 and 9");

            }

            switch (count) {
                case 1:
                    count = 1;
                    Laptop lap55 = new Laptop();
                    lap55.listFullInventory();
                    PC pc55 = new PC();
                    pc55.listFullInventory();
                    Server serv55 = new Server();
                    serv55.listFullInventory();
                    Phone phone55 = new Phone();
                    phone55.listFullInventory();
                    Tablet tab55 = new Tablet();
                    tab55.listFullInventory();

                    break;
                case 2:
                    count = 2;
                    Laptop lap11 = new Laptop();
                    lap11.diplayFullValue();
                    PC pc11 = new PC();
                    pc11.diplayFullValue();
                    Server serv11 = new Server();
                    serv11.diplayFullValue();
                    Phone phone11 = new Phone();
                    phone11.diplayFullValue();
                    Tablet tab11 = new Tablet();
                    tab11.diplayFullValue();

                    break;
                case 3:
                    count = 3;

                    Laptop lap1 = new Laptop();
                    lap1.totalMemoryStorage();
                    PC pc1 = new PC();
                    pc1.totalMemoryStorage();
                    Server serv1 = new Server();
                    serv1.totalMemoryStorage();

                    break;

                case 4:
                    count = 4;

                    Server s1 = new Server();
                    System.out.println(s1.getServers().get(0).printSpecification());

                    break;
                case 5:
                    count = 5;

                    Tablet t1 = new Tablet();
                    t1.displayAverageMemorySize();
                    break;
                case 6:
                    count = 6;
                    PC p55 = new PC();
                    p55.add2NewDellInspiron();

                    break;
                case 7:
                    count = 7;
                    Server s88 = new Server("Intel AXU ", 100, "Dell Server XModel ", 4, 2500, "Operating System Window Server)", 16);
                    s88.chargeInsurance();
                    Laptop lap2 = new Laptop("CPU 8th Generation Intel® Core™ i7", 1, "Dell XPS13 ", 18, 950, "Operating System Windows 10 Pro (64-bit)", 32);
                    lap2.chargeInsurance();
                    PC pc2 = new PC("8th Generation Intel® Core™ i3-8100 Processor", 1, "Dell Inspirons ", 12, 500, "	Windows 10 Home 64bit Multi-Language English", 8);
                    pc2.chargeInsurance();
                    Phone p88 = new Phone(5.8, "12MP", "iPhone XS", 7, 725, "iOS 12", 256);
                    p88.chargeInsurance();
                    Phone p99 = new Phone(6.2, "8MP", "Samsung S9", 11, 855, "Android 9", 64);
                    p99.chargeInsurance();
                    Tablet t33 = new Tablet(10, "9MP", "iPad 2017 ", 6, 1200, "iOS 11", 128);
                    t33.chargeInsurance();
                    break;

                case 8:
                    count = 8;
                    Phone phone1 = new Phone();
                    phone1.dispose3Samsung9();

                    break;
                case 9:
                    count = 9;
                    PC pc999 = new PC();
                    pc999.addTeamWorkToSoftwarePack();
                    break;
                default:
                    System.out.println("INVALID OPTION!!!");
                    break;
            }
            count++;
        } while (count == 0);

        Thread.sleep(1000);
        new PlayEndingAudio();//closing audio
        Thread.sleep(8000);
        System.exit(0);//force my program to exit
    }

}
