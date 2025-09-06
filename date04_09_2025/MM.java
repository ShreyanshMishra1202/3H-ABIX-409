package date04_09_2025;

public class MM {
    int n=0;
    static class sh{
        int a=10;
        int b=20;
        int c=30;
    }
//    System.out.println(sh.a);


    public static void main(String[] args) {
        MM myDog=new MM();
        MM myDog1=new MM();
        System.out.println(myDog.n);
//        System.out.println(myDog1.a);
        System.out.println(myDog instanceof MM);
        System.out.println(myDog1 instanceof MM);
    }
}
