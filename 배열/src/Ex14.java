import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        char s[] ={'화','수','목','금','토','일'};
        System.out.println(Arrays.toString(s));
        char t [] =new char[s.length+1];
        for(int i=0;i<s.length;i++){
            t[i+1]=s[i];
        }
        t[0] ='월';
        System.out.println(Arrays.toString(t));
    }
}
