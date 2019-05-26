package testcarapplication;

//outter class
public class Car {

    DieselEngine engine;

    public void testCarEngine() {
        CustomEngine ce = new CustomEngine();
        ce.testEngine();

    }

    public Car() {
        engine = new DieselEngine();

    }

    //inner class
    private class CustomEngine {

        public void testEngine() {

            System.out.println("Testing car engine");

        }

    }

    //method class
    public void testCarBrakeSystem() {

        class TestBrakes {

            int brakeStrength = 100;

            public void performStrengthCheck() {
                System.out.println(brakeStrength);
            }
        }
        TestBrakes tb = new TestBrakes();
        tb.performStrengthCheck();
    }

    static class CarColour {

        static void paintRed() {
            System.out.println("This car frame has been painted red");
        }
    }

    public void applyColour() {
        CarColour.paintRed();
    }

}
