import java.util.Arrays;

public class Ex13 {
    public static void main(String[] args) {
        char s[] ={'화','수','목','금','토','일'};
        System.out.println(Arrays.toString(s));
        char t [] =new char[s.length+1];
        System.arraycopy(s,0,t,1,s.length);
        t[0] ='월';
        s=t;
        System.out.println(Arrays.toString(t));

    }
}
