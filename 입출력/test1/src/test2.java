import java.util.Scanner;

public class test2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b= sc.nextInt();
        int c = a*b;
        for(int i=0;i<3;i++){
            int d = b%10;
            b = b/10;
            System.out.println(a*d);
        }
        System.out.println(c);
    }
}
