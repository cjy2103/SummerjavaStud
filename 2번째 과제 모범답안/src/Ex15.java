import java.util.Arrays;

public class Ex15 {
    public static void main(String[] args) {
        String a ="ABCDE";
        for(int i=0;i<a.length();i++){
            char c = a.charAt(i);
            System.out.print(c+" ");
        }
        System.out.println();
        char chararray [] = a.toCharArray();
        System.out.println(Arrays.toString(chararray));
    }
}
