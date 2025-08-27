public class Occurences {
    public static void main(String[] args) {
        String s1="Shreyansh Mishra";
        char s2='a';
        for(int i=0;i<s1.length();i++){
            if(s1.charAt(i)==(s2)){
                System.out.println(s2+" is present in "+s1);
            }
        }
    }
}

