import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int sum=0;
        for(int i=1;sum<=N;i++){
            sum=i+sum;
            if(sum<=N)
                System.out.println(sum);
        }
    }
}
