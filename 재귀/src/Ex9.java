public class Ex9 {
    public static void main(String[] args) {
        int n[] = {5,1,8,3,2};
        System.out.println(min(n,0,n.length-1));
    }

    private static long min(int[] n, int low, int high) {
        if(low==high) return n[low];
        int m =(high+low)/2;
        long v1 = min(n,low,m), v2 = min(n,m+1,high);
        if(v1<v2){
            return v1;
        }
        return v2;
    }
}
