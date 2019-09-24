import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int [] score = new int[N];
        int sum=0;
        for(int i=0;i<score.length;i++){
            int n=sc.nextInt();
            score[i]=n;
            sum+=score[i];
        }
        double avearage=sum/N;
        System.out.println(sum);
        System.out.println(avearage);
    }
}
