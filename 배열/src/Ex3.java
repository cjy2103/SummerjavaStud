import java.util.Arrays;

public class Ex3 {
    public static void main(String[] args) {
        int score [] = {45,50,60};
        int doublescore [] = new int[score.length*2];
        System.arraycopy(score,0,doublescore,0,score.length);
        System.out.println(Arrays.toString(doublescore));
    }
}
