import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int score = sc.nextInt();
        char grade = ' ';
        char sign = ' ';
        if(score>=90)
            grade = 'A';
            if(score>=95)
                sign = '+';
        else if(score>=80)
            grade = 'B';
            if(score>=85)
                sign = '+';
        else if(score>=70)
            grade='C';
            if(score>=75)
                sign = '+';
        else if(score>60)
            grade = 'D';
            if(score>=65)
                sign = '+';
        else grade = 'F';
     System.out.println(grade+""+sign);
    }
}
