public class excep2 {
    public static void main(String[] args) {
        String s="Shreyansh";
        try {
            System.out.println(s.charAt(15));
        }
        catch(Exception e){
            System.out.println(e.toString());
        }
    }
}
