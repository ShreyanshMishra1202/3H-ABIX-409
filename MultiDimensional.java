import java.util.Scanner;

import java.util.*;
public class MultiDimensional {
    public static void main(String[] args) {
        int a[][]= new int[3][3];
//        for(int[] i:a){
//            for(int j:i){
//                System.out.print(j);
//            }
//            System.out.println();
//        }
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<a.length;i++){
            System.out.println("for "+(i+1)+":");
            for(int j=0;j<a[i].length;j++){
                a[i][j]=sc.nextInt();
            }
        }
        System.out.println(a[1][2]);
        System.out.println(Arrays.toString(a));

        int copy[][]=Arrays.copyOf(a,5);
        System.out.println(Arrays.toString(copy));
    }
}
