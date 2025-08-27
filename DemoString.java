import java.util.Arrays;

public class DemoString{
    public static void main(String[] args) {
        String str="Amol";
        String name = new String("Abc");

        char[] nameChar={' ',' ','A','m','o','l',' ',' '};
        String names=new String(nameChar);
        System.out.println(names);
        System.out.println(names.substring(1));
        System.out.println(names.substring(1,4));
        System.out.println(names.toUpperCase());
        System.out.println(names.toLowerCase());
        System.out.println(names.trim());
        String[] a="a,b,c".split(",");
        System.out.println(Arrays.toString(a));
        System.out.println(String.join("-","a","b","c"));

    }
}
