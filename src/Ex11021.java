import java.util.Scanner;

public class Ex11021 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for(int i=1;i<=N;i++){
            int A = sc.nextInt();
            int B = sc.nextInt();
            if(A>0&&B<10)
                System.out.println("Case #"+i+": "+(A+B));
        }
    }
}
