import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        System.out.println("1~10 ���� ������ �ϳ��� �����ϼ���");
        for(int i=0;i<5;i++){
            int user = sc.nextInt();
            int coumputer = (int)(Math.random()*10)+1;
            if(user==coumputer)
                counter++;
            System.out.println("����� ������ ����: "+user);
            System.out.println("��ǻ�Ͱ� ������ ����: "+coumputer);
        }
        if(counter>=2)
            System.out.println("����� �¸�");
        else
            System.out.println("����� �й�");
    }
}
