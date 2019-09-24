public class Ex8 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(min(n,n.length-1));
    }

    private static int min(int[] n, int i) {
    if(i==0) return n[0];
    if(n[i]>min(n,i-1)) return min(n,i-1);
    return n[i];
    }
}