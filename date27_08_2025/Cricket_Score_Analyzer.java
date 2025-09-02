package date27_08_2025;

import java.util.Scanner;

public class Cricket_Score_Analyzer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number of Batsman :-- ");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>=100){
                System.out.println("Century Scorer Batsman "+(i+1));
            }
            sum+=arr[i];
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Highest Score :"+max);
        System.out.println("Lowest Score :"+min);
        System.out.println("Average Score :"+(sum/n));

    }
}
