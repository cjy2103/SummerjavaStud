import java.util.Arrays;

public class Ex7 {
    public static void main(String[] args) {
     int array [] = {80,53,100,42,100,30,25,25};
        Arrays.sort(array);
        int max = array[array.length-1];
        int max2 =array[0];
        int min2 =array[0];
        int min = array[0];
     for(int i=0;i<array.length;i++){
         if(max2<array[i]&&max2<max) {
             int tmp=max2;
             max2 = array[i];
             if(max2==max){
                 max2=tmp;
             }
         }
         if(min2<array[i]&&min==min2){
             min2=array[i];
         }
     }
     System.out.println(max2);
     System.out.println(min2);
    }
}
