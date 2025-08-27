import java.util.Scanner;

public class Library_Fine_Calculator {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Students Can Keep Books for 5 days.");
        System.out.println();
        System.out.println("No. Of Students:---");
        int noOfStudents=sc.nextInt();
        int j=0;

        int sum=0;
        while(j<noOfStudents){
            System.out.println("No. of books borrowed by Student "+(j+1)+":---- ");
            int noOfBooks=sc.nextInt();
            sum=0;
            for(int i=0;i<noOfBooks;i++){
                System.out.println("No. of days borrowed for Book "+(i+1)+" :-- ");
                int day=sc.nextInt();
                day-=5;
                System.out.println("Enter 1 for Regular, 2 for Reference, 3 for Magazine.");
                int choice=sc.nextInt();
                switch(choice) {
                    case 1:
                        System.out.println("You chose Regular");
                        break;
                    case 2:
                        System.out.println("You chose Reference");
                        break;
                    case 3:
                        System.out.println("You chose Magazine");
                        break;
                    default:
                        break;
                }
                int h=1;
                do{
                    if(h>0 && h<6){
                        sum+=10;
                    }
                    else if(h>=6 && h<11){
                        sum+=20;
                    }
                    else{
                        sum+=50;
                    }
                    h++;
                }while(h<=day);

            }
            System.out.println("Fine for student "+(j+1)+" = "+sum);
            j++;
        }

    }
}
