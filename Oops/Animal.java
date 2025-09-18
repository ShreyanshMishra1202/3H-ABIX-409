package Oops;

public class Animal {

    public Animal(){
        System.out.println(" Animal class constructor");
    }

    public void eat(){
        System.out.println("Animals eats now.(Animal)");
    }
    public String eat(int noOfLegs,int noOfEyes){
        return "Animals eats now (Animal).";
    }
}
