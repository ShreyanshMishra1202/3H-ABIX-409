import java.util.Scanner;

public class excep1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
//        exc(s);
        handle(s);
    }
//    public static void exc(String s){
//        System.out.println(s.substring(5,2));
//    }
    public static void handle(String s){
        try{
            System.out.println(s.substring(5,2));
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
