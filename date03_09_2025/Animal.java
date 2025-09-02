package date03_09_2025;

public class Animal {
    int noOfLegs;
    int noOfEyes;
    String color;
    double height;
    double weight;
    String gender;

    public Animal(int noOfLegs, int noOfEyes, String color, double height, double weight, String gender) {
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
        this.color = color;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
    }

    public Animal() {
    }

    public Animal(int noOfLegs, int noOfEyes, String color) {
        this.noOfLegs = noOfLegs;
        this.noOfEyes = noOfEyes;
        this.color = color;
    }

    // whenever we define a constructor manually, default constructor gets deleted
}
