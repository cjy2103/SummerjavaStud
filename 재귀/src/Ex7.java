public class Ex7 {
    public static void main(String[] args) {
        String s = "South, Korea ¾È³ç";
        char v[] = s.toCharArray();
        toUpper(v,0);
        System.out.println(v);
    }

    private static void toUpper(char[] v, int i) {
        if(i==v.length)
            return;
        if(v[i]>='a'&& v[i]<='z') {
            v[i] -='a'-'A';
        }
        toUpper(v,i+1);
    }
}
