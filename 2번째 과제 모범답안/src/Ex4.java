import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userlife = 5;
        int computerlife = 5;
        System.out.println("1:���� 2:��� 3:�ʻ��");
        while (true){
            int user = sc.nextInt();
            if(user>=1&&user<=3) {
                if (user < 1 || user > 3)
                    System.out.println("1~3 ������ ���ڸ� �Է��ϼ���");
                int computer = (int) (Math.random() * 3 + 1);
                if (user - computer == 1) {
                    System.out.println("���ݼ���");
                    computerlife--;
                    System.out.println("computer ���� ������: " + computerlife);
                } else if (user - computer == -2) {
                    System.out.println("���ݼ���");
                    computerlife--;
                    System.out.println("computer ���� ������: " + computerlife);
                } else if (user - computer == 0)
                    System.out.println("���");
                else {
                    System.out.println("�������� ����");
                    userlife--;
                    System.out.println("user ���� ������: " + userlife);
                }
                if (userlife == 0) {
                    System.out.println("����� �����ϴ�.");
                    break;
                } else if (computerlife == 0) {
                    System.out.println("����� �̰���ϴ�");
                    break;
                }
            }
            else
                System.out.println("1~3������ ���� �Է��ϼ���");
        }
    }
}
