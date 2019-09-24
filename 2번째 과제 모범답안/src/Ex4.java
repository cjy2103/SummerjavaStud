import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userlife = 5;
        int computerlife = 5;
        System.out.println("1:공격 2:방어 3:필살기");
        while (true){
            int user = sc.nextInt();
            if(user>=1&&user<=3) {
                if (user < 1 || user > 3)
                    System.out.println("1~3 사이의 숫자를 입력하세요");
                int computer = (int) (Math.random() * 3 + 1);
                if (user - computer == 1) {
                    System.out.println("공격성공");
                    computerlife--;
                    System.out.println("computer 남은 라이프: " + computerlife);
                } else if (user - computer == -2) {
                    System.out.println("공격성공");
                    computerlife--;
                    System.out.println("computer 남은 라이프: " + computerlife);
                } else if (user - computer == 0)
                    System.out.println("비김");
                else {
                    System.out.println("데미지를 입음");
                    userlife--;
                    System.out.println("user 남은 라이프: " + userlife);
                }
                if (userlife == 0) {
                    System.out.println("당신이 졌습니다.");
                    break;
                } else if (computerlife == 0) {
                    System.out.println("당신이 이겼습니다");
                    break;
                }
            }
            else
                System.out.println("1~3사이의 수를 입력하세요");
        }
    }
}
