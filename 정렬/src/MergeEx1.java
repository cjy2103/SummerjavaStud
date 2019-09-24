import java.util.Arrays;

public class MergeEx1 {
    public static void main(String[] args) {
        int n[] = {1,3,5,7,8};
        int m [] = {2,4,6,7,10};
        int v[] = mergeArray(n,m);
        System.out.println(Arrays.toString(v));
    }

    private static int[] mergeArray(int[] n, int[] m) {
        int v[] = new int[n.length+m.length];
        int i=0, j=0, k=0;
        while (i<n.length&&j<m.length){
            if(n[i]<m[j]){
                v[k] =n[i];
                i++;
                k++;
            }
            else{
                v[k] = m[j];
                k++;
                j++;
            }
        }
        v[v.length-1] = m[m.length-1];
        return v;
    }
}
