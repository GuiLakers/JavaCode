
package exorganizarclasses;


public class WeaponHolder {
    
      //My attributes with a class as a type
    Tank armyTank;
    Soldier armySoldier;
    RocketLauncher armyRocketLauncher;
    Warship armyWarship;
    Drone armyDrone;

    //My constructor with my method being initialized
    public WeaponHolder() {

        armyTank = new Tank();
       armyTank.getReady();
        armyTank.fire();
       

        armySoldier = new Soldier();
        armySoldier.getReady();
        armySoldier.fire();

        armyRocketLauncher = new RocketLauncher();
        armyRocketLauncher.getReady();
        armyRocketLauncher.fire();

        armyWarship = new Warship();
        armyWarship.getReady();
        armyWarship.fire();
        armyDrone =new Drone();
        armyDrone.getReady();
        armyDrone.fire();
       
}
}