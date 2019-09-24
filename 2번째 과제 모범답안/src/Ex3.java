import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counter=0;
        System.out.println("1~10 까지 숫자중 하나를 선택하세요");
        for(int i=0;i<5;i++){
            int user = sc.nextInt();
            int coumputer = (int)(Math.random()*10)+1;
            if(user==coumputer)
                counter++;
            System.out.println("당신이 선택한 숫자: "+user);
            System.out.println("컴퓨터가 선택한 숫자: "+coumputer);
        }
        if(counter>=2)
            System.out.println("당신의 승리");
        else
            System.out.println("당신의 패배");
    }
}
