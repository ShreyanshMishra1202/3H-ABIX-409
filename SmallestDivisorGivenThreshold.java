import java.util.Arrays;

public class SmallestDivisorGivenThreshold {
    public static void main(String[] args) {
        int[] arr={44,22,33,11,1};
        int limit=5;
        double p=1.0;
        System.out.println(Smallest(arr,limit,p));
    }
    public static int Smallest(int[] arr,int limit,double p){
        int sum=sum(arr);
        if(sum<=limit){
            return (int)p;
        }
        else{
            int temp[]=new int[arr.length];
            for(int i=0;i<arr.length;i++){
                double dd=Math.ceil(arr[i]/p);
//                System.out.println(arr[i]/p);
//                System.out.println(dd+"----------");
                temp[i]=(int)dd;
            }
//            System.out.println(Arrays.toString(temp));
            if(sum(temp)<=limit){
                return (int)p;
            }
            return Smallest(arr,limit,p+1);
        }
    }
    public static int sum(int arr[]){
        int s=0;
        for(int i:arr){
            s=s+i;
        }
        return s;
    }
//    public static int ones(int arr[]){
//        int o=0;
//        for(int i:arr){
//            if(i==1){
//                o++;
//            }
//        }
//        return o;
//    }
}
