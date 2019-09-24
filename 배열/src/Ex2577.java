import java.util.Scanner;

public class Ex2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int sum = A * B * C;
        int array[] = new int[10];
        if (A >= 100 && B >= 100 && C >= 100 && A < 1000 && B < 1000 && C < 1000) {
            while (true) {
                int num = sum % 10;
                sum = sum / 10;
                switch (num) {
                    case 0:
                        array[0] = array[0] + 1;
                        break;
                    case 1:
                        array[1] = array[1] + 1;
                        break;
                    case 2:
                        array[2] = array[2] + 1;
                        break;
                    case 3:
                        array[3] = array[3] + 1;
                        break;
                    case 4:
                        array[4] = array[4] + 1;
                        break;
                    case 5:
                        array[5] = array[5] + 1;
                        break;
                    case 6:
                        array[6] = array[6] + 1;
                        break;
                    case 7:
                        array[7] = array[7] + 1;
                        break;
                    case 8:
                        array[8] = array[8] + 1;
                        break;
                    case 9:
                        array[9] = array[9] + 1;
                        break;
                }
                if (sum == 0) {
                    break;
                }
            }
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }
        }
    }
}
