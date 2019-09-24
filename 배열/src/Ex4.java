public class Ex4 {
    public static void main(String[] args) {
        int [] score = {40 ,60,70 ,80,100 ,35};
        int max = score[0], min = score[0];
        for(int i=0;i<score.length;i++){
            if(score[i]>max)
                max=score[i];
            else if(score[i]<min)
                min = score[i];
        }
        System.out.println(max);
        System.out.println(min);
    }
}
