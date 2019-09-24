import java.util.Scanner;

public class Ex2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int as = 0 , ds =0, mix=0;
        int scale [] = new int[8];
        for(int i=0;i<8;i++){
            int play = sc.nextInt();
            scale[i]=play;
            if(scale[i]==i+1)
                as++;
            else if (scale[i]==8-i)
                ds++;
            else
                mix++;
        }
        if(as==8)
            System.out.println("ascending");
        else if(ds==8)
            System.out.println("descending");
        else
            System.out.println("mixed");

    }
}
