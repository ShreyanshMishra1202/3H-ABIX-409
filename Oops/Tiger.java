package Oops;

public class Tiger extends Animal{

//    @Override
//    public Animal() {}

    Animal yy=new Animal();     // it calls the constructor in static class.

    static class Animal extends Oops.Animal {
        public Animal(){                // it first calls main Animal class constructor(implicitly calls super()) and then, its own body.
            System.out.println(" static class constructor");
        }
    }


    @Override
    public String eat(int noOfLegs,int noOfEyes){
        return "Animals is eating too much.(TIGER)";
    }

}
