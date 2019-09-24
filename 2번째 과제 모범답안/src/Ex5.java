public class Ex5 {
    public static void main(String[] args) {
        int score [] = {92,81,77,87,95};
        int sum=0;
        double average = 0;
        for(int i=0;i<score.length;i++){
            sum+=score[i];
        }
        System.out.println(sum);
        average=(double)sum/score.length;
       System.out.println(average);
    }
}
