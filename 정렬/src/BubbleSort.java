import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int v[]=new int[]{5,8,1,9,3,5,1,5};
        bubleSort(v);
        System.out.println(Arrays.toString(v));
    }

    private static void bubleSort(int[] v) {
        for(int i=0;i<v.length;i++){
            boolean flag = false;
            for(int j=1;j<v.length-i;j++){
                if(v[j-1]>v[j]){
                    int temp = v[j];
                    v[j] = v[j-1];
                    v[j-1] = temp;
                    flag=true;
                }
            }
            if(flag!=true){
                break;
            }
        }
    }
}
