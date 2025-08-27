package date27_08_2025;//Railway Reservation System
//Problem Statement: Build a simple railway reservation app:Show train options with different fares (switch-case).
//Take booking requests for passengers (for loop).
//If seat not available → show waiting list (if-else).
//Continue until train is full (while).
//At least one booking attempt must be made (do-while).


import java.util.Scanner;

public class RailReservation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int first_AC=0;
        int second_AC=4;
        int third_AC=0;
        int sleeper=2;
        for(int i=0;i<n;i++){
            System.out.println("Enter 1 for first AC, 2 for second AC, 3 for third AC and 4 for sleeper.");
            int choice=sc.nextInt();
            int o=0;
            switch(choice){
                case 1:
                    System.out.println("first AC");
                    break;
                case 2:
                    System.out.println("second AC");
                    break;
                case 3:
                    System.out.println("third AC");
                    break;
                case 4:
                    System.out.println("sleeper");
                    break;
                default:
                    System.out.println("Invalid choice");
                    o++;
            }
            if(o==1){
                continue;
            }
            do{
                if(first_AC!=0 && choice==1){
                    System.out.println("Second AC Booked for Passenger "+(i+1));
                    first_AC=first_AC-1;
                    break;
                }else if(second_AC!=0 && choice==2){
                    System.out.println("Second AC Booked for Passenger "+(i+1));
                    second_AC=second_AC-1;
                    break;
                }else if(second_AC!=0 && choice==3){
                    System.out.println("Third AC Booked for Passenger "+(i+1));
                    third_AC=third_AC-1;
                    break;
                }else if(sleeper!=0 && choice==4){
                    System.out.println("Sleeper Booked for Passenger "+(i+1));
                    sleeper=sleeper-1;
                    break;
                }
                else {
                    System.out.println("No seats available");
                    break;
                }
            }while(true);
        }
    }
}
