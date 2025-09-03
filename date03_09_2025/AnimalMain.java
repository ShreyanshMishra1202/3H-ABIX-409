package date03_09_2025;

public class AnimalMain {
    public static void main(String[] args) {
        Animal dog=new Animal(2,4,"RED");
        Animal cat=new Animal(dog);
        System.out.println(cat.noOfEyes);
        System.out.println(cat.gender);

    }
}
