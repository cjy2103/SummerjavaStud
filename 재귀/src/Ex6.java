public class Ex6 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(max(n,0,n.length-1));
    }

    private static long max(int[] n, int low, int high) {
        if(low==high) return n[low];
        int m =(high+low)/2;
        long v1 = max(n,low,m), v2 = max(n,m+1,high);
        if(v1>v2){
            return v1;
        }
        return v2;
    }
}
