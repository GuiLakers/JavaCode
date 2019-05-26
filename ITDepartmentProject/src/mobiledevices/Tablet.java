
package mobiledevices;

import itdepartmentproject.MobileDevice;


public class Tablet extends MobileDevice {

    public Tablet(double screenSize, String camera, String type, int qtd, double price, String OS, String memory) {
        super(screenSize, camera, type, qtd, price, OS, memory);
        
        MobileDevice tablet1= new MobileDevice(10, "9MP" , "iPad 2017" , 6, 1200, "iOS 11", "128 GB") ;
        equipment.add(tablet1);
    }
    
}
