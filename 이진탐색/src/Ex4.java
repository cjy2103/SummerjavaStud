import java.util.Arrays;

public class Ex4 {
    public static void main(String[] args) {
        int v[] ={2,3,6,8,9};
        Arrays.sort(v);
        int key = 8;
        int index = binarySearch(v,key);
        if(index<0) System.out.println("�迭 �� �ڷ� ����");
        else System.out.println("�ڷ� �߰� ��ġ(�迭 �� index): "+index);
    }

    private static int binarySearch(int[] v, int key) {

    }
}
