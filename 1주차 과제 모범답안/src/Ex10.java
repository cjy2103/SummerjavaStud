import java.util.Scanner;

public class Ex10 {
    public static void main(String[] args) {
        int computer = (int) (Math.random()*10+1);
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("1~10 ������ ���ڸ� �Է��ϼ���");
            int user = sc.nextInt();
            if(user>computer)
                System.out.println("���ڰ� Ů�ϴ� �������ڸ� �Է��ϼ���");
            else if(computer>user)
                System.out.println("���ڰ� �۽��ϴ� ū���ڸ� �Է��ϼ���");
            else {
                System.out.println("����");
                break;
            }
        }
    }
}
