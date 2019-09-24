import java.util.Arrays;

public class Ex8 {
    public static void main(String[] args) {
        int array [] = {1,2,3,4,5};
        int copyarray [] = new int[array.length*2];
        System.arraycopy(array,1,copyarray,0,array.length-1);
        System.out.println(Arrays.toString(copyarray));
    }
}
