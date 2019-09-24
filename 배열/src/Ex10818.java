import java.util.Arrays;
import java.util.Scanner;

public class Ex10818 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N =sc.nextInt();
        int number [] = new int[N];
        if(N>=1&&N<=1000000) {
            for (int i = 0; i < number.length; i++) {
                int num = sc.nextInt();
                number[i] = num;
            }
            Arrays.sort(number);
            System.out.println(number[0] + " " + number[number.length - 1]);
        }
    }
}
