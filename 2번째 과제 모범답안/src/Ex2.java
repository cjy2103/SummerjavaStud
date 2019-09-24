import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1 = sc.nextInt();
        int number2 = sc.nextInt();
        int sum = number1 + number2;
        if(sum%2==0)
            System.out.println("짝수입니다.");
        else
            System.out.println("홀수입니다.");

    }
}
