package mobiledevices;

import itdepartmentproject.MobileDevice;

public class Phone extends MobileDevice {

    public Phone(double screenSize, String camera, String type, int qtd, double price, String OS, String memory) {
        super(screenSize, camera, type, qtd, price, OS, memory);

        MobileDevice phone1 = new MobileDevice(5.8, "12MP", "Samsung S9", 7, 725, "iOS 12", "256 GB");
        equipment.add(phone1);
    }

}
