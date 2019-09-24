import java.util.Arrays;

public class Ex12 {
    public static void main(String[] args) {
        char s[] ={'화','수','목','금','토','일'};
        char c[] = new char[s.length+1];
        for(int i=0;i<s.length;i++){
            c[i+1]=s[i];
        }
        c[0]='월';
        System.out.println(Arrays.toString(c));
    }
}
