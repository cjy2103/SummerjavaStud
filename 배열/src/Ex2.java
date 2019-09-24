
import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args) {
        int score [] = {45,50,60};
        int doublescore [] = new int[score.length*2];
        for (int i=0;i<score.length;i++){
            doublescore[i]=score[i];
        }
        System.out.println(Arrays.toString(doublescore));
    }
}
