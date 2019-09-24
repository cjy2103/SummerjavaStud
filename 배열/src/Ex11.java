import java.util.Scanner;

public class Ex11 {
    public static void main(String[] args) {
        final int size = 5;
        int x = 0, y = 0 , num = 0;
        int bingo [][] = new int [size][size];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                bingo[i][j] = i*size +j+1;
            }
        }
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                x = (int)(Math.random()*size);
                y = (int)(Math.random()*size);
                int tmp = bingo[i][j];
                bingo[i][j] = bingo[x][y];
                bingo[x][y] = tmp;
            }
        }
        do{
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    System.out.printf("%2d ",bingo[i][j]);
                }
                System.out.println();
            }

            System.out.printf("1~%d의 숫자를 입력하세요.(종료:0)",size*size);
            String tmp = sc.nextLine();
            num = Integer.parseInt(tmp);

            outer:
            for(int i=0;i<size;i++){
                for(int j=0;j<size;j++){
                    if(bingo[i][j]==num){
                        bingo[i][j]=0;
                        break outer;
                    }
                }
            }
        }while (num!=0);
    }
}
