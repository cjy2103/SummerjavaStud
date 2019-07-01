import java.util.Arrays;
import java.util.Scanner;

public class Ex2562 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num [] = new int[9];
        int count[] = new int [9];
        int check=0;
        for(int i=0;i<9;i++){
            int n = sc.nextInt();
            if(n>=100){
                break;}
            num[i] = n;
            count[i] = n;
            check++;
        }
        if(check==9) {
            Arrays.sort(num);
            System.out.println(num[8]);
            for(int i=0;i<9;i++){
                if(num[8]==count[i])
                    System.out.println(i+1);
            }
        }
    }
}
