public class Ex4 {
    public static void main(String[] args) {
        int n=98765;
        int k=2;
        for(int i=1;i<k;i++){
            n=n/10;
        }
        System.out.println(n%10);
    }
}
