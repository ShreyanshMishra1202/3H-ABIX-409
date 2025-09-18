package data10_09_2025;

public abstract class Car {
    String name;

    public abstract void run();
    public void gearShift(){
        System.out.println("Gear Shifting Happens.");
    }
    public Car(String name){
        this.name=name;
        System.out.println("I am in Car abstract class");
    }
}
