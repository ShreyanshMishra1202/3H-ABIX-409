package Oops;

public class MM {
    public static void main(String[] args) {
        Animal animal = new Animal();

        animal.eat();
        System.out.println(animal.eat(2,3));

        Tiger tiger = new Tiger();
        System.out.println(tiger.eat(2,3));

//        Tiger animalRef = new Animal();      it cannot work because we cannot store parent class object into child class referrals but vice versa happens

        Animal tigerRef = new Tiger();
        Tiger.Animal tigerRef2 = new Tiger.Animal();
    }
}
