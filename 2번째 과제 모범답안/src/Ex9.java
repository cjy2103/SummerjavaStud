import java.util.Arrays;

public class Ex9 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5,7};
        int array2 [] = new int[array.length+1];
        System.arraycopy(array,0,array2,1,array.length);
        array2[0] = 6;
        Arrays.sort(array2);
        System.out.println(Arrays.toString(array2));
    }
}
