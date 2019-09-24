import java.util.Arrays;

public class Ex2 {
    public static void main(String[] args){
        int v[] = {1,1,1,1,2,2,2,3,4,5,8,9,9,9,9,9};
        Arrays.sort(v);
        int key = 5;
        int index = binarySearch(v,key);
        if(index < 0) System.out.println("�迭�� �ڷ� ����");
        else System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): "+index);
    }

    private static int binarySearch(int[] v, int key) {
        int left = 0, right=v.length-1;
        while(left<=right){
            int m = (left+right)/2;
            if(key==v[m]){
                return m;
            }
            if(key<v[m]){
                right = m-1;
            }
            else left = m+1;
        }
        return -1;
    }
}
