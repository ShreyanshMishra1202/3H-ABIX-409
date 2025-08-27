public class voting_rights {
    public static void main(String[] args) {
        int a[]={17,34,56,75,11,23,18,90,21,0};
        for(int i:a){
            if(i<18){
                System.out.println("Cannot Vote");
            }
            else{
                System.out.println("Can Vote");
            }
        }
    }
}
