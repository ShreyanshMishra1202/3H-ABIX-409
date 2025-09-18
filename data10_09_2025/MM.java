package data10_09_2025;

public class MM {
    public static void main(String[] args) {
        Car obj= new Nano("Shreyansh") {
            @Override
            public void run() {
                System.out.println("Car started Running.");
            }
        };
        obj.run();
        obj.gearShift();
    }
}
