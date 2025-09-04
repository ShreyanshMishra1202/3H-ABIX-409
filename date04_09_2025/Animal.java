package date04_09_2025;

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

    public Animal(Animal animal) {          // it takes Object created by upper Constructor as constructor
        this.noOfEyes = animal.noOfEyes;
        this.noOfLegs = animal.noOfLegs;
        this.color = animal.color;
        this.height = animal.height;
        this.weight = animal.weight;
        this.gender = animal.gender;
    }
    // whenever we define a constructor manually, default constructor gets deleted
}
