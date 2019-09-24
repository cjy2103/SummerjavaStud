import java.util.Arrays;

public class Ex5 {
    public static void main(String[] args) {
        int [] score = {40 ,60,70 ,80,100 ,35};
        Arrays.sort(score);
        System.out.println(score[score.length-1]);
        System.out.println(score[0]);
    }
}
