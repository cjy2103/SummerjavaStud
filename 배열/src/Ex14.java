import java.util.Arrays;

public class Ex14 {
    public static void main(String[] args) {
        char s[] ={'ȭ','��','��','��','��','��'};
        System.out.println(Arrays.toString(s));
        char t [] =new char[s.length+1];
        for(int i=0;i<s.length;i++){
            t[i+1]=s[i];
        }
        t[0] ='��';
        System.out.println(Arrays.toString(t));
    }
}
