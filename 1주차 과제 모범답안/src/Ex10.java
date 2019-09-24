import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int computer = (int) (Math.random()*10+1);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1~10 사이의 숫자를 입력하세요");
            int user = sc.nextInt();
            if(user>computer)
                System.out.println("숫자가 큽니다 작은숫자를 입력하세요");
            else if(computer>user)
                System.out.println("숫자가 작습니다 큰숫자를 입력하세요");
            else {
                System.out.println("정답");
                break;
            }
        }
    }
}
